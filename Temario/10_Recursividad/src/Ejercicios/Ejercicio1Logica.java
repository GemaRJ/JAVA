package Ejercicios;

public class Ejercicio1Logica {

    // Ejemplo de ejercicio: sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Otro ejemplo: comprobar si un número es primo
    public boolean esPrimo(int n) {
        if (n <= 1) return false;
        return esPrimoRec(n, 2);
    }

    private boolean esPrimoRec(int n, int divisor) {
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return esPrimoRec(n, divisor + 1);
    }
}
