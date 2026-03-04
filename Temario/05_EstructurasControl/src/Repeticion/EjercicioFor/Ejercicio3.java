// Ejercicio 3: Tablas de multiplicar entre dos números dados
package Repeticion.EjercicioFor;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUno = 3;
        int numeroDos = 7;
        for (int i = numeroUno; i <= numeroDos; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("\t%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
