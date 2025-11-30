package Repeticion;

import java.util.Scanner;

public class While {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // WHILE → repetición mientras se cumpla una condición
        // Se usa cuando no sabemos cuántas veces se repetirá

        // Ejemplo 1: pedir una nota válida entre 0 y 10
        System.out.print("Introduce una nota entre 0 y 10: ");
        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota no válida. Introduce otra vez:");
            nota = scanner.nextInt();
        }
        System.out.println("Nota válida: " + nota);

        // Ejemplo 2: contar hacia atrás
        int contador = 5;
        System.out.println("\nContando hacia atrás desde 5:");
        while (contador > 0) {
            System.out.println(contador);
            contador--; // importante modificar la variable para no crear bucle infinito
        }

        // Ejemplo 3: sumatorio de números positivos introducidos por usuario
        int suma = 0;
        System.out.println("\nIntroduce números positivos (0 para terminar):");
        int numero = scanner.nextInt();
        while (numero != 0) {
            if (numero > 0) {
                suma += numero;
            }
            numero = scanner.nextInt();
        }
        System.out.println("Suma de números positivos: " + suma);
    }
}
