// Permiten asignar valores y combinar asignación con operaciones: +=, -=, *=, /=, %=

public class Asignacion {
    public static void main(String[] args) {
        int resultado = 0;   // Variable donde se guardará el resultado
        int operando1 = 8;
        int operando2 = 9;

        resultado += operando1; // equivalente a: resultado = resultado + operando1
        System.out.println("resultado += operando1 → " + resultado); // 0 + 8 = 8

        resultado -= operando2; // equivalente a: resultado = resultado - operando2
        System.out.println("resultado -= operando2 → " + resultado); // 8 - 9 = -1

        resultado *= 3; // equivalente a: resultado = resultado * 3
        System.out.println("resultado *= 3 → " + resultado); // -1 * 3 = -3

        resultado = 6; // reasignamos un nuevo valor
        resultado /= 2; // equivalente a: resultado = resultado / 2
        System.out.println("resultado /= 2 → " + resultado); // 6 / 2 = 3

        resultado %= 2; // equivalente a: resultado = resultado % 2 (resto de la división)
        System.out.println("resultado %= 2 → " + resultado); // 3 % 2 = 1
    }
}
