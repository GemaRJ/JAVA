public class ClasesEnvoltorio {

    /*
     * Enunciado:
     * Ejemplo de uso de clases envoltorio Integer y Character
     * para convertir y comparar valores primitivos.
     */
    public static void main(String[] args) {

        // Integer: convertir String a int
        String numeroStr = "123";
        int numero = Integer.parseInt(numeroStr); // convertir String a int
        System.out.println("Número + 5 = " + (numero + 5));

        // Integer: convertir int a String
        String numeroComoString = Integer.toString(numero);
        System.out.println("Número como String: " + numeroComoString);

        // Character: verificar si un carácter es letra o dígito
        char letra = 'a';
        char digito = '5';

        System.out.println("¿Es letra? " + Character.isLetter(letra));
        System.out.println("¿Es dígito? " + Character.isDigit(digito));

        // Comparación
        System.out.println("Comparar dos números: " + Integer.compare(5, 10));
    }
}
