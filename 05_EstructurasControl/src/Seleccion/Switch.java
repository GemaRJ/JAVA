package Seleccion;

import java.util.Scanner;

// SWITCH
// Selecciona entre múltiples casos según un valor.
// Ejemplo: días por mes (31, 30, 28 días)
// estructuraSwitch(
public class Switch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        estructuraSwitch();
    }

    private static void estructuraSwitch() {
        // Pedimos al usuario que introduzca su mes de nacimiento
        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        // Estructura switch → selecciona un bloque de código según el valor de la variable
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                // Si mes es 1,3,5,7,8,10 o 12 → tiene 31 días
                System.out.println("Este mes tiene 31 días");
                break; // sale del switch
            case 4, 6, 9, 11:
                // Si mes es 4,6,9,11 → tiene 30 días
                System.out.println("Este mes tiene 30 días");
                break;
            case 2:
                // Si mes es 2 → febrero → 28 días
                System.out.println("Febrero, 28 días");
                break;
            default:
                // Si no coincide con ningún caso → valor no válido
                System.out.println("Mes no válido");
        }
    }
}
