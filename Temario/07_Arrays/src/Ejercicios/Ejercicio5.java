package Ejercicios;

public class Ejercicio5 {

    /*
     * Enunciado:
     * Generar un array de 20 números aleatorios entre 0 y 30.
     * Sustituir todos los 6 por 8, los 7 por 15 y los 20 por 10.
     * Mostrar el array antes y después de los cambios y el número de cambios realizados.
     */
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int numeroCambios = 0;

        // Rellenar array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31); // 0-30
        }

        System.out.println("Array original:");
        mostrarArray(numeros);

        // Sustituir 6 por 8
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6) {
                numeros[i] = 8;
                numeroCambios++;
            }
        }

        // Sustituir 7 por 15
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 7) {
                numeros[i] = 15;
                numeroCambios++;
            }
        }

        // Sustituir 20 por 10
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                numeros[i] = 10;
                numeroCambios++;
            }
        }

        System.out.println("Array modificado:");
        mostrarArray(numeros);
        System.out.println("Número de cambios realizados: " + numeroCambios);
    }

    // Método para mostrar un array
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
