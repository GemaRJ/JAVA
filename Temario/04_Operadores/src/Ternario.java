
// Sintaxis: condicion ? valorSiTrue : valorSiFalse

public class Ternario {
    public static void main(String[] args) {

        // EJEMPLO SIMPLE
        int nota = 7;
        String resultado = (nota >= 5) ? "Aprobado" : "Suspenso"; // Si nota >= 5 → "Aprobado", si no → "Suspenso"
        System.out.println("Resultado simple: " + resultado);

        // EJEMPLO COMBINANDO CONDICIONES
        boolean tieneCarnet = true;
        boolean tieneCoche = false;
        String puedeConducir = (tieneCarnet && tieneCoche) ? "Puede conducir" : "No puede conducir"; // AND de dos booleanos
        System.out.println("Resultado combinado: " + puedeConducir);
    }
}
