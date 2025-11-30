package Controller;

// Clase que contiene varios métodos para practicar modularidad
public class Metodo {

    // Método que solo imprime un saludo
    public void metodoSaludar() {
        System.out.println("Bienvenido a la ejecución de los métodos");
    }

    // Sobrecarga de métodos de división
    public double realizarDivision(){
        return (double) 4 / 2;
    }

    public double realizarDivision(int operador1){
        return (double) 4 / operador1;
    }

    public double realizarDivision(int operador1, int operador2){
        return (double) operador1 / operador2;
    }

    public double realizarDivision(double operador1, int operador2){
        return operador1 / operador2;
    }

    public double realizarDivision(int operador1, double operador2){
        return operador1 / operador2;
    }

    // Método que calcula la media de un array de enteros
    public void calcularMedia(int[] numeros){
        double media = 0;
        int sumatorio = 0;
        for (int item : numeros){
            sumatorio += item;
        }
        media = (double) sumatorio / numeros.length;
        System.out.println("La media calculada es " + media);
    }

    // Método que simula un cajero automático
    public void sacarDinero(int pin, int cantidad){
        int saldo = 100;
        if (pin == 1234){
            System.out.println("Pin correcto");
            if (cantidad > saldo){
                System.out.println("Saldo insuficiente");
            } else {
                System.out.println("Sacando dinero: " + cantidad);
            }
        } else {
            System.out.println("Pin incorrecto");
        }
    }

    @Override
    public String toString() {
        return "Clase Metodo";
    }
}
