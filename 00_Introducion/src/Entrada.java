// Archivo: 00Introduccion.java
// Nombre del archivo debe coincidir con la clase pública

import java.util.Scanner; // Importamos Scanner para leer por consola

public class Entrada{

    public static void main(String[] args) {

        // ------------------------------
        // EJEMPLO DE VARIABLES
        // ------------------------------

        // Tipos de datos básicos
        String texto = "Soy un dato tipo String";
        int numero = 5;
        double decimal = 1.5;
        boolean verdadero = true;

        // Mostrar tipo de dato
        System.out.println(texto.getClass().getSimpleName()); // String
        System.out.println(((Object) numero).getClass().getSimpleName()); // Integer
        System.out.println(((Object) decimal).getClass().getSimpleName()); // Double
        System.out.println(((Object) verdadero).getClass().getSimpleName()); // Boolean

        // Salida con formato
        String nombre = "GEMA";
        String correo = "GEMA@gmail.com";
        System.out.printf("El correo de %s es %s, el cual cuenta con %d caracteres%n",
                nombre, correo, correo.length());

        // Pedir datos por consola
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("¿Cuál es tu correo? ");
        String correoUsuario = scanner.nextLine();

        System.out.print("¿Cuál es tu edad? ");
        int edadUsuario = scanner.nextInt();

        System.out.println("Nombre ingresado: " + nombreUsuario);
        System.out.println("Correo ingresado: " + correoUsuario);
        System.out.println("Edad ingresada: " + edadUsuario);

        // Cerramos Scanner
        scanner.close();
    }
}
