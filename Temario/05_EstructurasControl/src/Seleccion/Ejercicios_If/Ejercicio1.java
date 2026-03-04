package Seleccion.Ejercicios_If;

import java.util.Scanner;

// Ejercicio: Comprobar si uno de los tres números es la suma de los otros dos

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero 1:");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce numero 2:");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce numero 3:");
        int numero3 = scanner.nextInt();

        if ((numero1 == numero2 + numero3) ||
                (numero2 == numero1 + numero3) ||
                (numero3 == numero1 + numero2)) {
            System.out.println("Uno de los números es la suma de los otros dos");
        } else {
            System.out.println("Ninguno es suma de los otros dos");
        }
        scanner.close();
    }
}
