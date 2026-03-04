package Seleccion.Ejercicios_If;

// Ejercicio: Comprobar si un año es bisiesto
public class Ejercicio3 {
    public static void main(String[] args) {
        int anio = 2002;

        if (anio % 4 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}