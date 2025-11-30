package Ejercicios;

public class Ejercicio3 {

    /*
     * Enunciado:
     * Generar 20 números aleatorios entre 0 y 100, calcular su cuadrado y cubo,
     * y mostrarlos todos en formato tabla.
     */
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];

        // Rellenar array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }

        // Calcular cuadrados y cubos
        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = numeros[i] * numeros[i];
            cubos[i] = numeros[i] * numeros[i] * numeros[i];
        }

        // Mostrar resultados
        System.out.println("Posición | Número | Cuadrado | Cubo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%8d | %6d | %8d | %4d\n",
                    i, numeros[i], cuadrados[i], cubos[i]);
        }
    }
}
