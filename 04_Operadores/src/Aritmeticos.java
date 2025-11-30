
// Ejemplo de operadores aritméticos en Java: +, -, *, /, %

public class Aritmeticos {
    public static void main(String[] args) {

        int operador1 = 7; // Primer número
        int operador2 = 3; // Segundo número

        // Suma
        System.out.println("Suma: " + (operador1 + operador2)); // 7 + 3 = 10

        // Resta
        System.out.println("Resta: " + (operador1 - operador2)); // 7 - 3 = 4

        // Multiplicación
        System.out.println("Multiplicación: " + (operador1 * operador2)); // 7 * 3 = 21

        // División entera
        System.out.println("División entera: " + (operador1 / operador2)); // 7 / 3 = 2

        // División decimal
        System.out.println("División decimal: " + ((float) operador1 / operador2)); // 7 / 3 = 2.3333

        // Módulo (resto de la división)
        System.out.println("Resto de la división: " + (operador1 % operador2)); // 7 % 3 = 1
    }
}
