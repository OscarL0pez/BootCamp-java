package Logica;
  /*
     * Crea un programa que permita introducir el número de 
     * votantes y tres candidatos. 
     * Cada votante elige un candidato por número (1, 2 o 3). 
     * El programa debe validar los votos, contar cuántos ha 
     * recibido cada candidato, mostrar el porcentaje de votos 
     * y declarar al ganador.
     * 
     * Requisitos:
     * Uso de arrays para almacenar los votos.
     * 
     * Métodos para:
     *      Mostrar menú.
     *      Leer votos.
     *      Validar voto.
     *      Calcular porcentaje.
     *      Determinar el ganador.
     * Controlar errores de entrada (votos fuera del rango).
     */

import java.util.Scanner;

public class GestionVotaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de votantes
        System.out.print("Introduce el número de votantes: ");
        int numVotantes = scanner.nextInt();

        // Inicializar el array de votos
        int[] votos = new int[numVotantes];

        // Leer los votos
        leerVotos(scanner, votos);

        // Contar los votos
        int[] conteoVotos = contarVotos(votos);

        // Calcular los porcentajes
        double[] porcentajes = calcularPorcentajes(conteoVotos, numVotantes);

        // Mostrar los resultados
        mostrarResultados(conteoVotos, porcentajes);

        // Determinar el ganador
        int ganador = determinarGanador(conteoVotos);
        System.out.println("El ganador es el candidato " + ganador);

        scanner.close();
    }

    public static void leerVotos(Scanner scanner, int[] votos) {
        for (int i = 0; i < votos.length; i++) {
            int voto;
            do {
                System.out.print("Votante " + (i + 1) + ", elige un candidato (1, 2 o 3): ");
                voto = scanner.nextInt();
            } while (!validarVoto(voto));
            votos[i] = voto;
        }
    }

    public static boolean validarVoto(int voto) {
        if (voto < 1 || voto > 3) {
            System.out.println("Voto inválido. Debe ser 1, 2 o 3.");
            return false;
        }
        return true;
    }

    public static int[] contarVotos(int[] votos) {
        int[] conteoVotos = new int[3];
        for (int voto : votos) {
            conteoVotos[voto - 1]++;
        }
        return conteoVotos;
    }

    public static double[] calcularPorcentajes(int[] conteoVotos, int numVotantes) {
        double[] porcentajes = new double[3];
        for (int i = 0; i < conteoVotos.length; i++) {
            porcentajes[i] = (conteoVotos[i] / (double) numVotantes) * 100;
        }
        return porcentajes;
    }

    public static void mostrarResultados(int[] conteoVotos, double[] porcentajes) {
        for (int i = 0; i < conteoVotos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + conteoVotos[i] + " votos (" + porcentajes[i] + "%)");
        }
    }

    public static int determinarGanador(int[] conteoVotos) {
        int maxVotos = conteoVotos[0];
        int ganador = 1;
        for (int i = 1; i < conteoVotos.length; i++) {
            if (conteoVotos[i] > maxVotos) {
                maxVotos = conteoVotos[i];
                ganador = i + 1;
            }
        }
        return ganador;
    }
}