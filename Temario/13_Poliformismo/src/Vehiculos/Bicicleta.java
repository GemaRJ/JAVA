package Vehiculos;

/**
 * Clase Bicicleta que hereda de Vehiculo
 * Sobrescribe mostrarInfo() y añade un método propio
 */
public class Bicicleta extends Vehiculo {

    private boolean tieneCambio;

    public Bicicleta(String marca, int velocidad, boolean tieneCambio) {
        super(marca, velocidad);
        this.tieneCambio = tieneCambio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Bicicleta de marca: " + marca + ", velocidad: " + velocidad + " km/h, tiene cambio: " + tieneCambio);
    }

    public void tocarCampana() {
        System.out.println("Ring ring! Campana de la bicicleta");
    }
}