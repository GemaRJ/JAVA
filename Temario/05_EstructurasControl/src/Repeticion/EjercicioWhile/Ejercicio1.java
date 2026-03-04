
// Ejercicio 1: Sumar números positivos hasta que se introduzca un 0
package Repeticion.EjercicioWhile;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, sumatorio = 0;

        do {
            System.out.println("Introduce un número");
            numero = scanner.nextInt();
            if (numero > 0) sumatorio += numero;
        } while (numero != 0);

        System.out.println("La suma de los positivos es: " + sumatorio);
    }
}
