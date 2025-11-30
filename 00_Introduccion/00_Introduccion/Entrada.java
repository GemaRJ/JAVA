// Imprimir por consola
public class Entrada {
    public static void main(String[] args) {
        System.out.println("Hola desde GitHub");

        // Entrada de datos
        System.out.println("Hola Java");

        // Comentarios:
        // Misma línea: Esto es un comentario
        /*
         * Este es un comentario
         * en varias
         * líneas
         */

        // Consultar el tipo de dato (Java es tipado estáticamente)
        String texto = "Soy un dato tipo String";
        int numero = 5;
        double decimal = 1.5;
        boolean verdadero = true;

        System.out.println(texto.getClass().getSimpleName()); // String
        System.out.println(((Object) numero).getClass().getSimpleName()); // Integer
        System.out.println(((Object) decimal).getClass().getSimpleName()); // Double
        System.out.println(((Object) verdadero).getClass().getSimpleName()); // Boolean

        // Salida de datos con formato
        String nombre = "Gema";
        String correo = "gema@gmail.com";
        System.out.printf("El correo de %s es %s, el cual cuenta con %d caracteres%n",
                nombre, correo, correo.length());

        // Pedir datos por consola
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        nombre = scanner.nextLine();
        System.out.print("¿Cuál es tu correo? ");
        correo = scanner.nextLine();
        System.out.print("¿Cuál es tu edad? ");
        int edad = scanner.nextInt();
        System.out.printf("Hola %s, tu correo es %s y tienes %d años.%n", nombre, correo, edad);
        scanner.close();
    }
}
