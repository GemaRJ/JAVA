import Controller.Metodo;

public class Entrada {

    public static void main(String[] args) {
        // Creamos instancia de la clase Metodo
        Metodo metodos = new Metodo();

        // 1. Saludar
        metodos.metodoSaludar();

        // 2. Divisiones
        double resultado1 = metodos.realizarDivision();            // 4 / 2
        double resultado2 = metodos.realizarDivision(6);           // 4 / 6
        double resultado3 = metodos.realizarDivision(10, 5);       // 10 / 5
        double resultado4 = metodos.realizarDivision(12.0, 4);     // 12 / 4
        double resultado5 = metodos.realizarDivision(7, 2.0);      // 7 / 2

        System.out.println("Resultados de divisiones:");
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);

        // 3. Calcular media de un array
        int[] numeros = {5, 10, 15, 20};
        metodos.calcularMedia(numeros);

        // 4. Sacar dinero
        System.out.println("\nSimulación cajero:");
        metodos.sacarDinero(1234, 50);  // Pin correcto, saldo suficiente
        metodos.sacarDinero(1234, 200); // Pin correcto, saldo insuficiente
        metodos.sacarDinero(1111, 50);  // Pin incorrecto

        // 5. Mostrar la clase Metodo usando toString
        System.out.println("\nObjeto Metodo:");
        System.out.println(metodos);
    }
}
