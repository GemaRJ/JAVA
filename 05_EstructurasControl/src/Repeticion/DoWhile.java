package Repeticion;

import java.util.Scanner;

public class DoWhile {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // DO-WHILE → ejecuta al menos una vez y luego comprueba la condición

        // Ejemplo 1: pedir una nota válida entre 0 y 10
        int nota;
        do {
            System.out.print("Introduce una nota entre 0 y 10: ");
            nota = scanner.nextInt();
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota);

        // Ejemplo 2: repetir una acción mientras el usuario quiera
        char respuesta;
        do {
            System.out.println("¿Quieres continuar? (s/n)");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');

        // Ejemplo 3: generar números aleatorios hasta que salga un múltiplo de 10
        int aleatorio;
        do {
            aleatorio = (int) (Math.random() * 100); // 0 a 99
            System.out.println("Número aleatorio generado: " + aleatorio);
        } while (aleatorio % 10 != 0);
        System.out.println("¡Ha salido un múltiplo de 10!");
    }
}
