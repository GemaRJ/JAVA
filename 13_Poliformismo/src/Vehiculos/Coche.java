package Vehiculos;

/**
 * Clase Coche que hereda de Vehiculo
 * Sobrescribe el método mostrarInfo() y añade un método propio
 */
public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String marca, int velocidad, int numPuertas) {
        super(marca, velocidad);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche de marca: " + marca + ", velocidad: " + velocidad + " km/h, puertas: " + numPuertas);
    }

    public void tocarBocina() {
        System.out.println("Beep beep! Bocina del coche");
    }
}