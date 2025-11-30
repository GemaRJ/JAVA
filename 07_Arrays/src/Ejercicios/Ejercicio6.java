package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    /*
     * Enunciado:
     * Crear un array de 10 palabras. Ofrecer un menú para:
     * 1. Rellenar palabras manualmente
     * 2. Mostrar una palabra aleatoria
     * 3. Contar total de letras
     * 4. Calcular media de letras por palabra
     * 5. Mostrar la palabra más grande
     * 6. Mostrar la palabra más pequeña
     * 7. Salir
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[10];
        int opcion = 0;

        do {
            System.out.println("\nMenu de palabras:");
            System.out.println("1. Rellenar palabras");
            System.out.println("2. Mostrar palabra aleatoria");
            System.out.println("3. Total de letras");
            System.out.println("4. Media de letras");
            System.out.println("5. Palabra más grande");
            System.out.println("6. Palabra más pequeña");
            System.out.println("7. Salir");
            System.out.print("Introduce opcion: ");
            opcion = scanner.nextInt();
            int totalLetras = 0;

            switch (opcion) {
                case 1:
                    for (int i = 0; i < palabras.length; i++) {
                        System.out.print("Introduce palabra: ");
                        palabras[i] = scanner.next();
                    }
                    break;

                case 2:
                    int posicionAleatoria = (int) (Math.random() * palabras.length);
                    System.out.println("Palabra aleatoria: " + palabras[posicionAleatoria]);
                    break;

                case 3:
                    for (String palabra : palabras) {
                        if (palabra != null) {
                            totalLetras += palabra.length();
                        }
                    }
                    System.out.println("Total de letras: " + totalLetras);
                    break;

                case 4:
                    if (totalLetras == 0) {
                        System.out.println("No se han introducido palabras");
                    } else {
                        System.out.println("Media de letras: " + (double) totalLetras / palabras.length);
                    }
                    break;

                case 5:
                    String palabraGrande = palabras[0];
                    for (String palabra : palabras) {
                        if (palabra != null && palabra.length() > palabraGrande.length()) {
                            palabraGrande = palabra;
                        }
                    }
                    System.out.println("Palabra más grande: " + palabraGrande);
                    break;

                case 6:
                    String palabraPequenia = palabras[0];
                    for (String palabra : palabras) {
                        if (palabra != null && palabra.length() < palabraPequenia.length()) {
                            palabraPequenia = palabra;
                        }
                    }
                    System.out.println("Palabra más pequeña: " + palabraPequenia);
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);
    }
}
