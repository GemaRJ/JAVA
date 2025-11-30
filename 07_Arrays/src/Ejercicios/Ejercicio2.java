package Ejercicios;

public class Ejercicio2 {

    /*
     * Enunciado:
     * Generar 30 números aleatorios entre 0 y 10, almacenarlos en un array
     * y calcular el sumatorio y la media de esos números.
     */
    public static void main(String[] args) {
        int[] numerosGenerados = new int[30]; // Array de 30 posiciones
        int sumatorio = 0;

        // Rellenar el array con números aleatorios entre 0 y 10
        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = (int) (Math.random() * 11); // Math.random()*11 genera 0-10
        }

        // Sumar todos los números
        for (int num : numerosGenerados) {
            sumatorio += num;
        }

        // Calcular la media
        double media = (double) sumatorio / numerosGenerados.length;

        // Mostrar resultados
        System.out.println("Sumatorio: " + sumatorio);
        System.out.println("Media: " + media);
    }
}
