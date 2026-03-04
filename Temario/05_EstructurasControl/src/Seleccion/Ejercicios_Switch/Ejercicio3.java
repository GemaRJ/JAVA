package Seleccion.Ejercicios_Switch;

// Ejercicio 3: Comprobar si un número es par o impar usando switch

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 6;
        switch (numero % 2) {
            case 0 -> System.out.println("Numero par");
            default -> System.out.println("Impar");
        }
    }
}

