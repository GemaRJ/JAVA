// Devuelven un booleano: true (verdadero) o false (falso)

public class Comparadores {
    public static void main(String[] args) {

        int numero1 = 45;
        int numero2 = 44;

        // Mayor que
        System.out.println("numero1 > numero2 → " + (numero1 > numero2));   // true, porque 45 > 44

        // Mayor o igual que
        System.out.println("numero1 >= numero2 → " + (numero1 >= numero2)); // true, 45 >= 44

        // Menor que
        System.out.println("numero1 < numero2 → " + (numero1 < numero2));   // false, 45 < 44

        // Menor o igual que
        System.out.println("numero1 <= numero2 → " + (numero1 <= numero2)); // false, 45 <= 44

        // Igual a
        System.out.println("numero1 == numero2 → " + (numero1 == numero2)); // false, 45 == 44

        // Distinto de
        System.out.println("numero1 != numero2 → " + (numero1 != numero2)); // true, 45 != 44
    }
}
