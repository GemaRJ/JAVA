package Seleccion;

import java.util.Scanner;

public class If {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // IF / ELSE-IF / ELSE
        // Permite tomar decisiones según condiciones booleanas.
        // Ejemplo: evaluación de notas (SS, AP, NT, SB, MH)
        // estructuraIF();

    }

    private static void estructuraIF() {
        // Se evalúa una nota y se asigna calificación según rangos
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota <= 10) {
            if (nota < 5) {
                // Suspenso
            } else if (nota <= 6) {
                // Aprobado
            } else if (nota <= 8) {
                // Notable
            } else if (nota < 10) {
                // Sobresaliente
            } else {
                // Matrícula de honor
            }
        } else {
            // Nota no válida
        }
    }

   }
