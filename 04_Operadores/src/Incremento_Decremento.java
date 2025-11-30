
// Ejemplo de operadores de incremento y decremento en Java

public class Incremento_Decremento {
    public static void main(String[] args) {

        // EJEMPLO DE INCREMENTO
        int a = 5;
        System.out.println("Valor original a: " + a); // 5
        System.out.println("Pre-incremento (++a): " + (++a)); // 6
        System.out.println("Post-incremento (a++): " + (a++)); // 6
        System.out.println("Después del post-incremento: " + a); // 7

        // EJEMPLO DE DECREMENTO
        int b = 10;
        System.out.println("\nValor original b: " + b); // 10
        System.out.println("Pre-decremento (--b): " + (--b)); // 9
        System.out.println("Post-decremento (b--): " + (b--)); // 9
        System.out.println("Después del post-decremento: " + b); // 8

        // EJEMPLO DE COMBINACIÓN
        int c = 3;
        int d = ++c + c++; // pre + post
        System.out.println("\nCombinación: d = ++c + c++ → d = " + d + ", c = " + c); // d=8, c=5
    }
}
