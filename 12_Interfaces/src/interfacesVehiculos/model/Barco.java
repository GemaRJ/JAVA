package interfacesVehiculos.model;

public class Barco implements Vehiculo, Acuatico {

    private String nombre;
    private int velocidad;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.velocidad = 0;
    }

    @Override
    public void acelerar(int cantidad) {
        velocidad += cantidad;
        System.out.println("El barco " + nombre + " acelera a " + velocidad + " nudos");
    }

    @Override
    public void frenar(int cantidad) {
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El barco " + nombre + " reduce velocidad a " + velocidad + " nudos");
    }

    @Override
    public void navegar() {
        System.out.println("El barco " + nombre + " está navegando por el mar.");
    }
}
