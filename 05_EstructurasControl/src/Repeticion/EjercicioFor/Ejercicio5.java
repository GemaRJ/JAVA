// Ejercicio 5: Mostrar números pares e impares entre dos valores
package Repeticion.EjercicioFor;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numeroUno = 10, numeroDos = 1000;
        for (int i = numeroUno; i < numeroDos; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            } else {
                System.out.println("Impar: " + i);
            }
        }
    }
}
