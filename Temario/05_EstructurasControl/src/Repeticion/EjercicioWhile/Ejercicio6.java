// Ejercicio 9: Cambiar un número de base (2,8,16) usando while
package Repeticion.EjercicioWhile;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1- Pasar a base 2");
            System.out.println("2- Pasar a base 8");
            System.out.println("3- Pasar a base 16");
            System.out.println("4- Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: cambiarBase(2); break;
                case 2: cambiarBase(8); break;
                case 3: cambiarBase(16); break;
            }

        } while (opcion != 4);
    }

    public static void cambiarBase(int base) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que número quieres pasar a base " + base);
        int numero = scanner.nextInt();
        String resultadoCambio = "";

        while (numero > base - 1) {
            int resto = numero % base;
            String letra = "";
            if (base == 16) {
                switch (resto) {
                    case 10: letra = "A"; break;
                    case 11: letra = "B"; break;
                    case 12: letra = "C"; break;
                    case 13: letra = "D"; break;
                    case 14: letra = "E"; break;
                    case 15: letra = "F"; break;
                }
                if (resto > 9) resultadoCambio = letra + resultadoCambio;
                else resultadoCambio = resto + resultadoCambio;
            }
            if (base == 2 || base == 8) resultadoCambio = resto + resultadoCambio;
            numero = numero / base;
        }

        resultadoCambio = numero + resultadoCambio;
        System.out.println("El resultado de cambiar de base es " + resultadoCambio);
    }
}
