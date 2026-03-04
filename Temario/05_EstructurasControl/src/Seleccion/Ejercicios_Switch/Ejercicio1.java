package Seleccion.Ejercicios_Switch;

import java.util.Scanner;

// Ejercicio 1: Dado un número de día de la semana, mostrar su nombre

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el numero de dia de la semana");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Es el lunes");
            case 2 -> System.out.println("Es el martes");
            case 3 -> System.out.println("Es el miercoles");
            case 4 -> System.out.println("Es el jueves");
            case 5 -> System.out.println("Es el viernes");
            case 6 -> System.out.println("Es el sabado");
            case 7 -> System.out.println("Es el domingo");
            default -> System.out.println("Dia no contemplado");
        }
    }
}
