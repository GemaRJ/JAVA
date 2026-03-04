// Ejercicio 3: Generar números aleatorios hasta que salga 0 y mostrar el máximo generado
package Repeticion.EjercicioWhile;

public class Ejercicio2 {
    public static void main(String[] args) {
        int aleatorio, max = 0;

        do {
            aleatorio = (int) (Math.random() * 101);
            System.out.println(aleatorio);
            if (aleatorio > max) max = aleatorio;
        } while (aleatorio != 0);

        System.out.println("El máximo generado es " + max);
    }
}
