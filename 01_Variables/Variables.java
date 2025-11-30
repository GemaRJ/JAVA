// Archivo: Variables.java

// Una clase contiene todo el código
public class Variables {

    public static void main(String[] args) {

        // ------------------------------
        // VARIABLES EN JAVA
        // ------------------------------

        // Una variable es un espacio en memoria donde guardamos datos.
        // Java es un lenguaje fuertemente tipado → siempre hay que indicar el tipo.

        // DECLARACIÓN Y ASIGNACIÓN
        int numero; // declaramos una variable tipo entero
        numero = 10; // asignamos valor

        // o en una sola línea
        int edad = 25;

        // TIPOS DE VARIABLES EN JAVA:

        // Números enteros
        int cantidad = 100;
        long poblacion = 8000000L; // L obligatorio para long

        // Números decimales
        float precio = 19.99f; // f obligatorio para float
        double salario = 1850.75;

        // Texto
        String nombre = "Gema"; // String es un objeto
        char inicial = 'G'; // char es un solo carácter

        // Booleanos
        boolean esMayor = true;
        boolean activo = false;

        // Mostrar variables por consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial: " + inicial);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("¿Es mayor?: " + esMayor);

        // Mostrar con formato (más elegante)
        System.out.printf("La persona %s tiene %d años y gana %.2f €%n",
                nombre, edad, salario);

        // VARIABLES QUE CAMBIAN
        int contador = 1;
        contador = 2; // se puede cambiar su valor

        // CONSTANTES
        final double PI = 3.14159; // final = no se puede modificar
        System.out.println("Valor de PI: " + PI);

        // Declaración múltiple
        int a = 1, b = 2, c = 3;

        // Inicialización tardía
        String saludo;
        saludo = "Hola desde Java";

        System.out.println(saludo);

        // COMPROBAR LOS TIPOS DE DATOS
        System.out.println(((Object) precio).getClass().getSimpleName()); // Float
        System.out.println(((Object) activo).getClass().getSimpleName()); // Boolean
    }
}
