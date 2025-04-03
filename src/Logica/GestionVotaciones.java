package Logica;

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

        // Contar los votos por candidato
        int[] conteoVotos = contarVotos(votos);

        // Calcular los porcentajes de votos para cada candidato
        double[] porcentajes = calcularPorcentajes(conteoVotos, numVotantes);

        // Mostrar los resultados de la votación
        mostrarResultados(conteoVotos, porcentajes);

        // Determinar el ganador de la votación
        int ganador = determinarGanador(conteoVotos);
        System.out.println("El ganador es el candidato " + ganador);

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }

    /**
     * Método para leer los votos de los votantes.
     * Valida que cada voto sea 1, 2 o 3 antes de almacenarlo.
     */
    public static void leerVotos(Scanner scanner, int[] votos) {
        for (int i = 0; i < votos.length; i++) {
            int voto;
            do {
                System.out.print("Votante " + (i + 1) + ", elige un candidato (1, 2 o 3): ");
                voto = scanner.nextInt();
            } while (!validarVoto(voto)); // Repetir hasta que el voto sea válido
            votos[i] = voto; // Guardar el voto en el array
        }
    }

    /**
     * Método para validar que un voto sea válido (1, 2 o 3).
     * @param voto El voto a validar.
     * @return true si el voto es válido, false en caso contrario.
     */
    public static boolean validarVoto(int voto) {
        if (voto < 1 || voto > 3) {
            System.out.println("Voto inválido. Debe ser 1, 2 o 3.");
            return false; // Voto no válido
        }
        return true; // Voto válido
    }

    /**
     * Método para contar los votos de cada candidato.
     * @param votos Array con los votos de los votantes.
     * @return Array con el conteo de votos por candidato.
     */
    public static int[] contarVotos(int[] votos) {
        int[] conteoVotos = new int[3]; // Array para almacenar el conteo de votos (3 candidatos)
        for (int voto : votos) {
            conteoVotos[voto - 1]++; // Incrementar el contador correspondiente al candidato
        }
        return conteoVotos;
    }

    /**
     * Método para calcular el porcentaje de votos de cada candidato.
     * @param conteoVotos Array con el conteo de votos por candidato.
     * @param numVotantes Número total de votantes.
     * @return Array con los porcentajes de votos por candidato.
     */
    public static double[] calcularPorcentajes(int[] conteoVotos, int numVotantes) {
        double[] porcentajes = new double[3]; // Array para almacenar los porcentajes
        for (int i = 0; i < conteoVotos.length; i++) {
            porcentajes[i] = (conteoVotos[i] / (double) numVotantes) * 100; // Calcular porcentaje
        }
        return porcentajes;
    }

    /**
     * Método para mostrar los resultados de la votación.
     * Incluye el número de votos y el porcentaje de cada candidato.
     * @param conteoVotos Array con el conteo de votos por candidato.
     * @param porcentajes Array con los porcentajes de votos por candidato.
     */
    public static void mostrarResultados(int[] conteoVotos, double[] porcentajes) {
        for (int i = 0; i < conteoVotos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + conteoVotos[i] + " votos (" + porcentajes[i] + "%)");
        }
    }

    /**
     * Método para determinar el ganador de la votación.
     * @param conteoVotos Array con el conteo de votos por candidato.
     * @return El número del candidato ganador.
     */
    public static int determinarGanador(int[] conteoVotos) {
        int maxVotos = conteoVotos[0]; // Inicializar con los votos del primer candidato
        int ganador = 1; // Inicializar con el primer candidato
        for (int i = 1; i < conteoVotos.length; i++) {
            if (conteoVotos[i] > maxVotos) { // Comparar para encontrar el candidato con más votos
                maxVotos = conteoVotos[i];
                ganador = i + 1; // Actualizar el número del candidato ganador
            }
        }
        return ganador;
    }
}