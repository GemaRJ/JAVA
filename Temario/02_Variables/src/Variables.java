

public class Variables {

    public static void main(String[] args) {


        // VARIABLES EN JAVA

        // Una variable es un espacio en memoria donde guardamos datos.
        // Java es un lenguaje fuertemente tipado → siempre hay que indicar el tipo.


        // DECLARACIÓN Y ASIGNACIÓN

        int numero;      // Declaramos una variable de tipo entero
        numero = 10;     // Asignamos un valor

        int edad = 25;   // Declaración y asignación en la misma línea


        // TIPOS DE VARIABLES


        // Números enteros
        int cantidad = 100;           // Entero
        long poblacion = 8000000L;    // Entero largo (L obligatorio)

        // Números decimales
        float precio = 19.99f;        // Decimal simple (f obligatorio)
        double salario = 1850.75;     // Decimal doble precisión

        // Texto
        String nombre = "Gema";       // Texto (objeto)
        char inicial = 'G';           // Un solo carácter

        // Booleanos
        boolean esMayor = true;       // Verdadero
        boolean activo = false;       // Falso

        // MOSTRAR VARIABLES POR CONSOLA

        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial: " + inicial);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("¿Es mayor?: " + esMayor);

        // Mostrar con formato (con banderas)

        // %s = String, %d = entero, %.2f = decimal con 2 decimales
        System.out.printf("La persona %s tiene %d años y gana %.2f €%n",
                nombre, edad, salario);


        // VARIABLES QUE CAMBIAN

        int contador = 1;
        contador = 2; // Se puede modificar el valor


        // CONSTANTES

        final double PI = 3.14159; // final = no se puede modificar
        System.out.println("Valor de PI: " + PI);


        // DECLARACIÓN MÚLTIPLE

        int a = 1, b = 2, c = 3; // Se pueden declarar varias variables del mismo tipo en una línea


        // INICIALIZACIÓN TARDÍA

        String saludo;        // Se declara primero
        saludo = "Hola desde Java"; // Se asigna valor después
        System.out.println(saludo);


        // COMPROBAR TIPOS DE DATOS

        // Método getClass().getSimpleName() devuelve el nombre de la clase del objeto
        System.out.println(((Object) precio).getClass().getSimpleName());  // Float
        System.out.println(((Object) activo).getClass().getSimpleName());  // Boolean
    }
}
