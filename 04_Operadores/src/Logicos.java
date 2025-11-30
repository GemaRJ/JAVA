// Archivo: Logicos.java
// Ejemplo de operadores lógicos en Java

public class Logicos {
    public static void main(String[] args) {

        boolean tieneCarnet = true;  // Usuario tiene carnet de conducir
        boolean tieneCoche = false;  // Usuario no tiene coche

        System.out.println("tieneCarnet && tieneCoche → " + (tieneCarnet && tieneCoche)); // AND: ambas deben ser true
        System.out.println("tieneCarnet || tieneCoche → " + (tieneCarnet || tieneCoche)); // OR: al menos una es true
        System.out.println("!tieneCarnet → " + (!tieneCarnet)); // Negación: invierte el valor booleano

        int numero1 = 3;
        int numero2 = 5;
        int numero3 = 70;

        // Combinación de condiciones: (numero1 > numero2) OR (numero2 < 10 AND numero1 > numero3)
        boolean resultado = numero1 > numero2 || (numero2 < 10 && numero1 > numero3);
        System.out.println("Resultado de la combinación → " + resultado); // false
    }
}
