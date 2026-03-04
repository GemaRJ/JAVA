public class ClaseStrings {

    /*
     * Enunciado:
     * Ejemplos de métodos de la clase String
     */
    public static void main(String[] args) {
        String texto = "  Hola Mundo  ";
        String otroTexto = "hola mundo";

        // equals y equalsIgnoreCase
        System.out.println(texto.trim().equals(otroTexto)); // false
        System.out.println(texto.trim().equalsIgnoreCase(otroTexto)); // true

        // length
        System.out.println("Longitud: " + texto.length());

        // charAt
        System.out.println("Caracter posición 2: " + texto.charAt(2));

        // indexOf
        System.out.println("Posición de 'Mundo': " + texto.indexOf("Mundo"));

        // substring
        System.out.println("Substring(0,4): " + texto.substring(0,4));

        // toUpperCase y toLowerCase
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        // trim
        System.out.println("Sin espacios: '" + texto.trim() + "'");

        // split
        String[] palabras = texto.trim().split(" ");
        for(String palabra : palabras){
            System.out.println("Palabra: " + palabra);
        }

        // concat
        String concatenado = texto.trim().concat(" Java");
        System.out.println("Concatenado: " + concatenado);
    }
}
