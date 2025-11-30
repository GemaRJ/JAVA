// Ejercicio 5: Juego de adivinar un número aleatorio con opción de repetir y registro de récord
package Repeticion.EjercicioWhile;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir = "S";
        int record = 10000;

        do {
            int intentos = 0;
            int numero;
            int aleatorio = (int) (Math.random() * 21);
            System.out.println(aleatorio); // para pruebas

            do {
                System.out.println("Introduce numero");
                numero = scanner.nextInt();
                if (numero != aleatorio) System.out.println("Intentalo de nuevo");
                intentos++;
            } while (numero != aleatorio);

            System.out.printf("Enhorabuena, has acertado el número en %d intentos\n", intentos);
            if (intentos < record) {
                System.out.println("Has superado el récord");
                record = intentos;
            }

            System.out.println("Quieres volver a jugar (S/N)");
            repetir = scanner.next();

        } while (repetir.equalsIgnoreCase("S"));
    }
}
