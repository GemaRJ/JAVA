import java.util.Random;

public class ClaseRandomMath {

    /*
     * Enunciado:
     * Mostrar ejemplos de generación de números aleatorios
     * y uso de métodos de la clase Math
     */
    public static void main(String[] args) {
        Random random = new Random();

        // Número aleatorio entre 0 y 9
        int numAleatorio = random.nextInt(10);
        System.out.println("Número aleatorio 0-9: " + numAleatorio);

        // Número aleatorio decimal entre 0 y 1
        double numDecimal = Math.random();
        System.out.println("Número decimal aleatorio: " + numDecimal);

        // Usando Math
        System.out.println("Valor absoluto de -10: " + Math.abs(-10));
        System.out.println("Raíz cuadrada de 25: " + Math.sqrt(25));
        System.out.println("Redondeo de 5.7: " + Math.round(5.7));
        System.out.println("Potencia 2^3: " + Math.pow(2,3));
        System.out.println("Número máximo entre 5 y 10: " + Math.max(5,10));
    }
}
