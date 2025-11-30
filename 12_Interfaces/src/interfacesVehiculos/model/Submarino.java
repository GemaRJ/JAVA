package interfacesVehiculos.model;

public class Submarino implements Vehiculo, Acuatico {

    private String codigo;
    private int velocidad;
    private int profundidad;

    public Submarino(String codigo) {
        this.codigo = codigo;
        this.velocidad = 0;
        this.profundidad = 0;
    }

    @Override
    public void acelerar(int cantidad) {
        velocidad += cantidad;
        System.out.println("El submarino " + codigo + " avanza a " + velocidad + " nudos");
    }

    @Override
    public void frenar(int cantidad) {
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El submarino " + codigo + " disminuye velocidad a " + velocidad + " nudos");
    }

    @Override
    public void navegar() {
        System.out.println("El submarino " + codigo + " navega bajo el agua.");
    }

    public void sumergir(int metros){
        profundidad += metros;
        System.out.println("El submarino " + codigo + " baja a " + profundidad + " metros.");
    }
}
