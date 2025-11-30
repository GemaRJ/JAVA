import interfacesVehiculos.model.*;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Vehiculo> lista = new ArrayList<>();

        lista.add(new Coche("Audi"));
        lista.add(new Moto("Yamaha"));
        lista.add(new Barco("Titanic"));
        lista.add(new Submarino("SUB-01"));

        for (Vehiculo v : lista) {
            v.acelerar(20);
            v.frenar(5);

            if (v instanceof Terrestre t){
                t.derrapar();
            }

            if (v instanceof Acuatico a){
                a.navegar();
            }

            System.out.println("---------------------");
        }
    }
}

/*
    INTERFACES EN JAVA

    Una interfaz es un "contrato" que define qué métodos debe tener una clase,
    pero sin implementar el contenido de esos métodos. Es decir:
    ➤ La interfaz dice QUÉ hay que hacer.
    ➤ Las clases que la implementan deciden CÓMO se hace.

    En este ejemplo usamos una interfaz llamada Vehiculo,
    que obliga a todas las clases (Coche, Moto, Camion…) a incluir los métodos:
        - arrancar()
        - acelerar()
        - frenar()

    ¿Para qué sirve?
 
    - Para asegurar que todas las clases que representan vehículos
      compartan el mismo comportamiento básico.
    - Para poder trabajar con diferentes clases usando el mismo tipo Vehiculo.
    - Para permitir polimorfismo: tratar distintos vehículos de forma uniforme.

    Ejemplo:
        Vehiculo miVehiculo = new Coche();
        miVehiculo.arrancar();   // funciona porque Coche implementa la interfaz

    De esta forma conseguimos código más organizado, reutilizable y flexible.
*/