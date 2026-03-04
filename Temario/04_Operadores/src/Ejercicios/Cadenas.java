package Ejercicios;

import java.util.Scanner;

// Compara dos cadenas de texto de varias formas
public class Cadenas {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Indica la primera palabra: ");
        String palabra1 = lectorTeclado.next();

        System.out.print("Indica la segunda palabra: ");
        String palabra2 = lectorTeclado.next();

        System.out.println("Son iguales (respetando mayúsculas/minúsculas): " + palabra1.equals(palabra2));
        System.out.println("Son iguales (ignorando mayúsculas/minúsculas): " + palabra1.equalsIgnoreCase(palabra2));
        System.out.println("La segunda palabra tiene menos letras que la primera: " + (palabra2.length() < palabra1.length()));
        System.out.println("Son distintas: " + !palabra1.equalsIgnoreCase(palabra2));

        lectorTeclado.close();
    }
}
