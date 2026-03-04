package Ejercicios;

import java.util.Scanner;

public class Ejercicio1Entrada {
    public static void main(String[] args) {

        Ejercicio1Logica logica = new Ejercicio1Logica();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int a = sc.nextInt();

        System.out.println("Introduce otro número:");
        int b = sc.nextInt();

        System.out.println("La suma es: " + logica.sumar(a, b));

        System.out.println("¿Qué número quieres comprobar si es primo?");
        int n = sc.nextInt();

        if (logica.esPrimo(n)) {
            System.out.println(n + " SÍ es primo.");
        } else {
            System.out.println(n + " NO es primo.");
        }
    }
}
