// Ejercicio 7: Menú simple que se repite hasta seleccionar salir
package Repeticion.EjercicioWhile;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bienvenido al menu");
            System.out.println("1-Opcion 1");
            System.out.println("2-Opcion 2");
            System.out.println("3-Opcion 3");
            System.out.println("4-Opcion 4");
            System.out.println("5-Salir");
            System.out.println("Introduce la opcion deseada");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: System.out.println("Opcion seleccionada 1"); break;
                case 2: System.out.println("Opcion seleccionada 2"); break;
                case 3: System.out.println("Opcion seleccionada 3"); break;
                case 4: System.out.println("Opcion seleccionada 4"); break;
                case 5: System.out.println("Saliendo......."); break;
                default: System.out.println("Opcion no contemplada");
            }

        } while (opcion != 5);

        System.out.println("Fin del menu");
    }
}
