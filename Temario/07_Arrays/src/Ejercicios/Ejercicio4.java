package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    /*
     * Enunciado:
     * Pedir al usuario 8 números y mostrar cuáles son pares y cuáles impares.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        // Rellenar el array con números introducidos por el usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = scanner.nextInt();
        }

        // Comprobar y mostrar pares e impares
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println("Par: " + num);
            } else {
                System.out.println("Impar: " + num);
            }
        }
    }
}
