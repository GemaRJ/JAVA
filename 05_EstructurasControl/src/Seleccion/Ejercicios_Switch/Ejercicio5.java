package Seleccion.Ejercicios_Switch;

// Ejercicio 5: Mostrar información de un producto según su código

public class Ejercicio5 {
    public static void main(String[] args) {
        String codigo = "123A";
        switch (codigo) {
            case "1234A" -> {
                System.out.println("El producto es XXX");
                System.out.println("Su precio es XXX");
            }
            case "123A" -> {
                System.out.println("El producto es XXX");
                System.out.println("Su precio es XXX");
            }
            case "1234B" -> {
                System.out.println("El producto es XXX");
                System.out.println("Su precio es XXX");
            }
            case "123B" -> {
                System.out.println("El producto es XXX");
                System.out.println("Su precio es XXX");
            }
        }
    }
}
