package interfacesVehiculos.model;

public class Coche implements Vehiculo, Terrestre {

    private String marca;
    private int velocidad;

    public Coche(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    @Override
    public void acelerar(int cantidad) {
        velocidad += cantidad;
        System.out.println("El coche " + marca + " acelera a " + velocidad + " km/h");
    }

    @Override
    public void frenar(int cantidad) {
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El coche " + marca + " frena a " + velocidad + " km/h");
    }

    @Override
    public void derrapar() {
        System.out.println("El coche " + marca + " está derrapando!");
    }
}
