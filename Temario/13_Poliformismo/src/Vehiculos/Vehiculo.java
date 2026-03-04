package Vehiculos;

/**
 Clase base Vehiculo
  Contiene atributos y métodos comunes a todos los vehículos
 */
public class Vehiculo {

    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Método que puede ser sobrescrito por las clases hijas
    public void mostrarInfo() {
        System.out.println("Vehículo de marca: " + marca + ", velocidad: " + velocidad + " km/h");
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println("Acelerando... Nueva velocidad: " + velocidad + " km/h");
    }

    public void frenar() {
        velocidad -= 10;
        System.out.println("Frenando... Nueva velocidad: " + velocidad + " km/h");
    }
}