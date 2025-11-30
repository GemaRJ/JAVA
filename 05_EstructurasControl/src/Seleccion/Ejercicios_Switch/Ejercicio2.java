package Seleccion.Ejercicios_Switch;

import java.util.Scanner;

// Ejercicio 2: Comprobar si una letra es vocal o consonante

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la letra");
        char letra = scanner.next().charAt(0);

        switch (String.valueOf(letra).toUpperCase().charAt(0)) {
            case 'A', 'E', 'I', 'O', 'U' -> System.out.println("Es una vocal");
            default -> System.out.println("Es consonante");
        }
    }
}

