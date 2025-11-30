// Ejercicio 4: Calcular la potencia de un número usando for
package Repeticion.EjercicioFor;

public class Ejercicio4 {
    public static void main(String[] args) {
        int base = 2, exponente = 4;
        if (base == 0 && exponente == 0) {
            System.out.println("No se puede calcular error");
        } else {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println(resultado);
        }
    }
}
