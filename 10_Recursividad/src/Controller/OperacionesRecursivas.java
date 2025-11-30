package Controller;

import java.util.Scanner;

public class OperacionesRecursivas {

    private Scanner lector = new Scanner(System.in);

    public void calculoFactorial() {
        System.out.println("Introduce un número para calcular su factorial:");
        int numero = lector.nextInt();
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    private int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void cuentaAtras() {
        System.out.println("Introduce un número para cuenta atrás:");
        int numero = lector.nextInt();
        cuentaAtrasRecursiva(numero);
    }

    private void cuentaAtrasRecursiva(int n) {
        if (n < 0) {
            System.out.println("FIN");
        } else {
            System.out.println(n);
            cuentaAtrasRecursiva(n - 1);
        }
    }
}
