package Ejercicios;

import java.util.Scanner;

// Calcula el coste de bebidas y bocadillos en un bar
public class Bar {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        final double COSTE_BEBIDA = 1.25; // Precio por bebida
        final double COSTE_BOCATA = 2.05; // Precio por bocadillo

        System.out.print("Cuántas bebidas queréis: ");
        int cantidadBebidas = lectorTeclado.nextInt();

        System.out.print("Cuántos bocadillos queréis: ");
        int cantidadBocatas = lectorTeclado.nextInt();

        double costeBebidas = cantidadBebidas * COSTE_BEBIDA;
        double costeBocatas = cantidadBocatas * COSTE_BOCATA;
        double costeTotal = costeBebidas + costeBocatas;

        System.out.println("Coste bebidas: " + costeBebidas);
        System.out.println("Coste bocadillos: " + costeBocatas);
        System.out.println("Coste total: " + costeTotal);

        lectorTeclado.close();
    }
}

