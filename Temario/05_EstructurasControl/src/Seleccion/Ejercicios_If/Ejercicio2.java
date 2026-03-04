package Seleccion.Ejercicios_If;

// Ejercicio: Comprobar si un número es múltiplo de 20 y si está en el rango [-100, 100]
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 200;

        if (numero % 20 == 0) {
            if (numero >= -100 && numero <= 100) {
                System.out.println("El numero es múltiplo y está en rango");
            } else {
                System.out.println("El numero es múltiplo y no está en rango");
            }
        } else {
            if (numero >= -100 && numero <= 100) {
                System.out.println("El numero no es múltiplo y está en rango");
            } else {
                System.out.println("El numero no es múltiplo y no está en rango");
            }
        }
    }
}