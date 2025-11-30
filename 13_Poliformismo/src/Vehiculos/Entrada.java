package Vehiculos;
import java.util.ArrayList;

/**
 * Clase principal para probar polimorfismo
 */
public class Entrada {

    public static void main(String[] args) {
        // Creamos una lista de vehículos usando polimorfismo
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Coche("Toyota", 120, 4));
        listaVehiculos.add(new Bicicleta("Bianchi", 25, true));
        listaVehiculos.add(new Coche("Ford", 150, 2));
        listaVehiculos.add(new Bicicleta("Orbea", 20, false));

        // Recorrer la lista y llamar al método mostrarInfo()
        // Gracias al polimorfismo, cada objeto ejecuta su versión del método
        for (Vehiculo v : listaVehiculos) {
            v.mostrarInfo();
            v.acelerar();
            v.frenar();

            // Comprobamos el tipo y llamamos a métodos específicos
            if (v instanceof Coche) {
                ((Coche) v).tocarBocina();
            } else if (v instanceof Bicicleta) {
                ((Bicicleta) v).tocarCampana();
            }

            System.out.println("----------------------------");
        }
    }
}