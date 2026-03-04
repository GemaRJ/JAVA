package Repeticion;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Menú interactivo: opciones de un "banco"
        // El menú se repite mientras el usuario no seleccione la opción de salir
        int opcion;
        do {
            System.out.println("\n=== MENÚ BANCO ===");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido INGRESAR dinero");
                    break;
                case 2:
                    System.out.println("Has elegido SACAR dinero");
                    break;
                case 3:
                    System.out.println("Has elegido CONSULTAR saldo");
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción incorrecta, inténtalo de nuevo");
            }
        } while (opcion != 4);
    }
}
