package interfacesVehiculos.model;

public class Moto implements Vehiculo, Terrestre {

    private String modelo;
    private int velocidad;

    public Moto(String modelo) {
        this.modelo = modelo;
        this.velocidad = 0;
    }

    @Override
    public void acelerar(int cantidad) {
        velocidad += cantidad;
        System.out.println("La moto " + modelo + " acelera a " + velocidad + " km/h");
    }

    @Override
    public void frenar(int cantidad) {
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0;
        System.out.println("La moto " + modelo + " frena a " + velocidad + " km/h");
    }

    @Override
    public void derrapar() {
        System.out.println("La moto " + modelo + " realiza un derrape espectacular!");
    }
}
