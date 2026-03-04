
// Ejemplos de casting y parsing en Java

public class CambiosTipo {
    public static void main(String[] args) {


        // CASTING → convertir entre tipos primitivos

        int numero = 43;

        float numeroFloat = (float) numero; // int → float
        System.out.println("Casting int a float: " + numeroFloat); // 43.0

        byte numeroByte = (byte) numero; // int → byte
        System.out.println("Casting int a byte: " + numeroByte); // 43

        double numeroDouble = numero; // int → double (automático)
        System.out.println("Casting implícito int a double: " + numeroDouble); // 43.0


        // PARSING → convertir String a otros tipos

        String textoNumero = "123";
        int numeroParseado = Integer.parseInt(textoNumero); // String → int
        System.out.println("Parsing String a int: " + numeroParseado); // 123

        String textoDecimal = "3.14";
        double decimalParseado = Double.parseDouble(textoDecimal); // String → double
        System.out.println("Parsing String a double: " + decimalParseado); // 3.14

        String booleanoTexto = "true";
        boolean booleanoParseado = Boolean.parseBoolean(booleanoTexto); // String → boolean
        System.out.println("Parsing String a boolean: " + booleanoParseado); // true


        // CONVERSIÓN A STRING

        String numeroComoTexto = String.valueOf(numero); // int → String
        System.out.println("Int convertido a String: " + numeroComoTexto); // "43"

        String decimalComoTexto = String.valueOf(decimalParseado); // double → String
        System.out.println("Double convertido a String: " + decimalComoTexto); // "3.14"
    }
}
