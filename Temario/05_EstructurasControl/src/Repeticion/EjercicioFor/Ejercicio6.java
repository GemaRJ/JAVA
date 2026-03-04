// Ejercicio 6: Tiradas aleatorias de un dado
package Repeticion.EjercicioFor;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas tiradas quieres hacer");
        int nVeces = scanner.nextInt();
        if (nVeces < 1) nVeces = 100;

        for (int i = 0; i < nVeces; i++) {
            int tirada = (int) (Math.random() * 6) + 1;
            System.out.println(tirada);
        }
    }
}
