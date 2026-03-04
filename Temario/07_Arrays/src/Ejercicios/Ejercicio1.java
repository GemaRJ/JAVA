package Ejercicios;

public class Ejercicio1
{

    public static void main(String[] args) {

        // Ejercicio: Sorteo de la Champions


        // Equipos del bombo 1

        String[] bombo1 = {"Barcelona", "Madrid", "Juve", "PSG", "Liverpool", "PSV", "Brest"};

        // Equipos del bombo 2

        String[] bombo2 = {"Girona", "Bayer", "City", "Arsenal", "Feyenord", "Milan", "Inter"};

        // Vamos a sacar emparejamientos sin repetir equipos

        for (int i = 0; i < bombo1.length; i++) {
            int aleatorio1;
            // Seleccionar equipo del bombo 1 que no esté ya emparejado
            do {
                aleatorio1 = (int) (Math.random() * bombo1.length);
            } while (bombo1[aleatorio1] == null);
            String equipo1 = bombo1[aleatorio1];
            bombo1[aleatorio1] = null; // Marcamos como usado

            int aleatorio2;
            // Seleccionar equipo del bombo 2 que no esté ya emparejado
            do {
                aleatorio2 = (int) (Math.random() * bombo2.length);
            } while (bombo2[aleatorio2] == null);
            String equipo2 = bombo2[aleatorio2];
            bombo2[aleatorio2] = null; // Marcamos como usado

            // Mostrar el emparejamiento

            System.out.printf("El emparejamiento es: %s vs %s\n", equipo1, equipo2);
        }

        // Comentarios sobre formato
        // %s -> texto
        // %d -> número entero
        // %.2f -> número decimal con 2 decimales
    }
}