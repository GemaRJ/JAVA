// Ejemplo de funciones (métodos) en Java

public class Funciones {

    public static void main(String[] args) {

        System.out.println("=== EJEMPLOS DE FUNCIONES EN JAVA ===");


        // 1. MÉTODO SIN PARÁMETROS Y SIN RETORNO

        // Llama al método saludar(), no recibe datos ni devuelve nada
        saludar();


        // 2. MÉTODO CON PARÁMETROS PERO SIN RETORNO

        // Llama al método mostrarEdad() pasando un entero
        mostrarEdad(30);


        // 3. MÉTODO CON PARÁMETROS Y CON RETORNO

        // Llama al método sumar() pasando dos números y recibe un entero de retorno
        int suma = sumar(10, 20);
        System.out.println("La suma es: " + suma);


        // 4. MÉTODO QUE DEVUELVE UN STRING

        // Llama a crearMensaje() pasando un nombre y recibe un mensaje de texto
        String mensaje = crearMensaje("Gema");
        System.out.println(mensaje);


        // 5. MÉTODO QUE DEVUELVE UN BOOLEANO

        // Llama a esMayor() pasando la edad y devuelve true/false
        boolean mayorEdad = esMayor(18);
        System.out.println("¿Es mayor de edad? " + mayorEdad);
    }


    // 1. Sin parámetros y sin retorno

    public static void saludar() {
        System.out.println("Hola desde un método.");
    }


    // 2. Con parámetros y sin retorno

    public static void mostrarEdad(int edad) {
        System.out.println("La edad es: " + edad);
    }


    // 3. Con parámetros y con retorno

    public static int sumar(int a, int b) {
        return a + b; // Devuelve la suma de los dos números
    }


    // 4. Devuelve un String

    public static String crearMensaje(String nombre) {
        return "Hola " + nombre + ", bienvenida al mundo Java.";
    }


    // 5. Devuelve un booleano

    public static boolean esMayor(int edad) {
        return edad >= 18; // Devuelve true si la edad es mayor o igual a 18
    }
}
