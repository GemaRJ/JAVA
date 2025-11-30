// Ejercicio 2: Mostrar la tabla de multiplicar completa del 0 al 10
package Repeticion.EjercicioFor;

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("\t%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
