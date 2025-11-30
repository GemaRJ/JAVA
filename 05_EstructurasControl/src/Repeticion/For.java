package Repeticion;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SUMATORIO, MEDIA Y NÚMEROS PARES
        int sumatorio = 0;
        int numeroPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            sumatorio += numero;
            if (numero % 2 == 0) {
                numeroPares++;
            }
        }

        double media = (double) sumatorio / 10;
        System.out.println("\nSumatorio de los números: " + sumatorio);
        System.out.println("Media de los números: " + media);
        System.out.println("Cantidad de números pares: " + numeroPares);

        // TABLA DE MULTIPLICAR COMPLETA 0-10
        System.out.println("\n=== TABLA DE MULTIPLICAR 0-10 ===");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", j, i, i * j);
            }
        }

        // TABLA DEL 8
        System.out.println("\n=== TABLA DEL 8 ===");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("8 * %d = %d\n", i, 8 * i);
        }

        // NÚMEROS ALEATORIOS Y COINCIDENCIAS
        System.out.print("\nIntroduce un número para adivinar (0-800): ");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Generando 5 números aleatorios...");
        for (int i = 0; i < 5; i++) {
            int aleatorio = (int) (Math.random() * 801); // 0 a 800
            System.out.println("Número aleatorio: " + aleatorio);
            if (numeroUsuario == aleatorio) {
                System.out.println("¡Número adivinado!");
            }
        }

        scanner.close();
    }
}



