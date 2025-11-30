// Archivo: Entrada.java

// Una clase en Java contiene todo el código que se va a ejecutar.
// Debe llamarse igual que el archivo.
public class Introduccion {

    // VARIABLES → Espacios donde guardamos datos.
    // MÉTODOS → Bloques de código que realizan acciones.
    // Estructura de un método:
    // modificador_acceso tipo_retorno nombre(parámetros) { ... }
    // - modificador_acceso: public, private, etc.
    // - tipo_retorno: void (no devuelve nada) o un tipo de dato.
    // - nombre: cómo llamamos al método.
    // - parámetros: datos que recibe el método.

    // Método principal del programa
    public static void main(String[] args) {

        System.out.println("Este es mi primer programa en JAVA");
        System.out.println("Esta es la segunda linea");

        // Imprimir por consola:
        System.out.println("Hola desde GitHub y VSCode 🚀");

        // Entrada de datos (sin pedir al usuario aún)
        System.out.println("Hola Java");

        // Comentarios en Java:
        // Comentario de una sola línea

        /*
         * Comentario
         * de varias
         * líneas
         */

        // Consultar el tipo de dato:
        String texto = "Soy un dato tipo String";
        int numero = 5;
        double decimal = 1.5;
        boolean verdadero = true;

        System.out.println(texto.getClass().getSimpleName()); // String
        System.out.println(((Object) numero).getClass().getSimpleName()); // Integer
        System.out.println(((Object) decimal).getClass().getSimpleName()); // Double
        System.out.println(((Object) verdadero).getClass().getSimpleName()); // Boolean

        // Salida de datos con formato
        String nombre = "Juan";
        String correo = "juan@gmail.com";
        System.out.printf("El correo de %s es %s, el cual cuenta con %d caracteres%n",
                nombre, correo, correo.length());

        // Pedir datos por consola:
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("¿Cuál es tu correo? ");
        String correoUsuario = scanner.nextLine();

        System.out.print("¿Cuál es tu edad? ");
        int edadUsuario = scanner.nextInt();

        System.out.println("Nombre ingresado: " + nombreUsuario);
        System.out.println("Correo ingresado: " + correoUsuario);
        System.out.println("Edad ingresada: " + edadUsuario);
    }
}
