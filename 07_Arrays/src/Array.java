package _05Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // 1. Array unidimensional simple

        int[] numerosDatos = {1, 5, 8};
        System.out.println("Array inicial: " + Arrays.toString(numerosDatos));

        // Obtener el valor de una posición (desde 0)
        System.out.println("Valor en la posición 0: " + numerosDatos[0]);

        // Obtener cuántos elementos tiene
        System.out.println("Longitud del array: " + numerosDatos.length);

        // Sacar el último número
        System.out.println("Último elemento: " + numerosDatos[numerosDatos.length - 1]);

        // Evaluar si el valor de una posición es igual a algo
        if (numerosDatos[1] == 5) {
            System.out.println("La posición 1 es igual a 5");
        }

        // Asignar un valor a una posición
        numerosDatos[0] = 10;
        System.out.println("Array tras asignar 10 en posición 0: " + Arrays.toString(numerosDatos));


        // 2. Recorrer array con foreach

        System.out.println("Recorriendo array con foreach:");
        for (int num : numerosDatos) {
            System.out.println(num);
        }


        // 3. Array con valores aleatorios (sin repetir)

        int[] aleatorios = new int[10];
        for (int i = 0; i < aleatorios.length; i++) {
            int num;
            do {
                num = (int) (Math.random() * 20) + 1;
            } while (estaNumero(num, aleatorios));
            aleatorios[i] = num;
        }
        System.out.println("Array aleatorio sin repetir: " + Arrays.toString(aleatorios));


        // 4. Array multidimensional

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Array multidimensional:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }


        // 5. Números en posiciones pares

        System.out.println("Elementos en posiciones pares:");
        for (int i = 0; i < aleatorios.length; i += 2) {
            System.out.println("Posición " + i + ": " + aleatorios[i]);
        }


        // 6. Ordenar array

        Arrays.sort(aleatorios);
        System.out.println("Array ordenado: " + Arrays.toString(aleatorios));


        // 7. Mover elementos a la izquierda

        int[] izquierda = Arrays.copyOf(aleatorios, aleatorios.length);
        int primero = izquierda[0];
        for (int i = 0; i < izquierda.length - 1; i++) {
            izquierda[i] = izquierda[i + 1];
        }
        izquierda[izquierda.length - 1] = primero;
        System.out.println("Array rotado a la izquierda: " + Arrays.toString(izquierda));


        // 8. Mover elementos a la derecha

        int[] derecha = Arrays.copyOf(aleatorios, aleatorios.length);
        int ultimo = derecha[derecha.length - 1];
        for (int i = derecha.length - 1; i > 0; i--) {
            derecha[i] = derecha[i - 1];
        }
        derecha[0] = ultimo;
        System.out.println("Array rotado a la derecha: " + Arrays.toString(derecha));


        // 9. Invertir array

        int[] invertido = Arrays.copyOf(aleatorios, aleatorios.length);
        for (int i = 0; i < invertido.length / 2; i++) {
            int temp = invertido[i];
            invertido[i] = invertido[invertido.length - 1 - i];
            invertido[invertido.length - 1 - i] = temp;
        }
        System.out.println("Array invertido: " + Arrays.toString(invertido));


        // 10. Array con posiciones pares

        System.out.println("Valores en posiciones pares usando foreach:");
        for (int i = 0; i < aleatorios.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Posición " + i + ": " + aleatorios[i]);
            }
        }
    }

    // Función auxiliar para comprobar si un número está en un array
    public static boolean estaNumero(int numero, int[] array) {
        for (int n : array) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
}
