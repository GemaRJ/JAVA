import java.util.Scanner;

public class ClaseScanner {

    /*
     * Enunciado:
     * Mostrar ejemplos de Scanner y métodos next y nextLine
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next(); // lee hasta espacio
        System.out.println("Hola " + nombre);

        scanner.nextLine(); // limpiar buffer

        System.out.print("Introduce frase completa: ");
        String frase = scanner.nextLine(); // lee línea completa
        System.out.println("Tu frase: " + frase);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tienes " + edad + " años.");
    }
}
