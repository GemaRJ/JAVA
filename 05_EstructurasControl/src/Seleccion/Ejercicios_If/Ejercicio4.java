package Seleccion.Ejercicios_If;

// Ejercicio: Comprobar si un número de 4 cifras es capicúa
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 1221;
        String numStr = String.valueOf(numero);

        if (numero >= 1000 && numero <= 9999) {
            if (numStr.charAt(0) == numStr.charAt(3) &&
                    numStr.charAt(1) == numStr.charAt(2)) {
                System.out.println("El numero es capicúa");
            } else {
                System.out.println("El numero no es capicúa");
            }
        } else {
            System.out.println("Numero fuera del rango");
        }
    }
}