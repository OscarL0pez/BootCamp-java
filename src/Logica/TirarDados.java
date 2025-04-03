package Logica;

import java.util.Scanner;

public class TirarDados {

    /*
    Enunciado:
        El programa simula N tiradas de dos dados de 6 caras. Después muestra:

        * Cuántas veces ha salido cada suma (de 2 a 12).
        * Cuál es la suma más frecuente.
        * Mostrar un pequeño gráfico de frecuencias con asteriscos.

    Requisitos:
        * Arrays para contar las sumas.
        * Métodos para:
            - Lanzar dados.
            - Registrar resultados.
            - Analizar y mostrar resultados.
        * Uso de Math.random() o Random.
    */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar el número de tiradas al usuario
            System.out.print("Introduce el número de tiradas: ");
            int tiradas = scanner.nextInt();

            // Array para almacenar las frecuencias de las sumas (índices 2 a 12)
            int[] frecuencias = new int[13]; // Índices 0 y 1 no se usan

            // Realizar las tiradas
            for (int i = 0; i < tiradas; i++) {
                int dado1 = lanzarDado(); // Lanzar el primer dado
                int dado2 = lanzarDado(); // Lanzar el segundo dado
                int suma = dado1 + dado2; // Calcular la suma de los dos dados
                registrarSuma(frecuencias, suma); // Registrar la suma en el array de frecuencias
            }

            // Mostrar las frecuencias de las sumas
            mostrarFrecuencias(frecuencias);

            // Determinar y mostrar la suma más frecuente
            int sumaFrecuente = obtenerSumaMasFrecuente(frecuencias);
            System.out.println("La suma más frecuente es: " + sumaFrecuente);

            // Mostrar un gráfico de frecuencias
            System.out.println("Gráfico de frecuencias:");
            mostrarGrafico(frecuencias);
        }
    }

    /**
     * Método para simular el lanzamiento de un dado de 6 caras.
     * @return Un número aleatorio entre 1 y 6.
     */
    public static int lanzarDado() {
        return (int) (Math.random() * 6) + 1; // Generar un número aleatorio entre 1 y 6
    }

    /**
     * Método para registrar una suma en el array de frecuencias.
     * @param frecuencias Array que almacena las frecuencias de las sumas.
     * @param suma La suma obtenida de los dos dados.
     */
    public static void registrarSuma(int[] frecuencias, int suma) {
        frecuencias[suma]++; // Incrementar el contador correspondiente a la suma
    }

    /**
     * Método para mostrar las frecuencias de las sumas.
     * @param frecuencias Array que almacena las frecuencias de las sumas.
     */
    public static void mostrarFrecuencias(int[] frecuencias) {
        System.out.println("Frecuencias de las sumas:");
        for (int i = 2; i <= 12; i++) { // Las sumas posibles van de 2 a 12
            System.out.println("Suma " + i + ": " + frecuencias[i] + " veces");
        }
    }

    /**
     * Método para determinar la suma más frecuente.
     * @param frecuencias Array que almacena las frecuencias de las sumas.
     * @return La suma más frecuente.
     */
    public static int obtenerSumaMasFrecuente(int[] frecuencias) {
        int maxFrecuencia = 0; // Variable para almacenar la frecuencia máxima
        int sumaMasFrecuente = 2; // Variable para almacenar la suma más frecuente (inicialmente 2)
        for (int i = 2; i <= 12; i++) { // Recorrer las sumas posibles
            if (frecuencias[i] > maxFrecuencia) { // Si se encuentra una frecuencia mayor
                maxFrecuencia = frecuencias[i]; // Actualizar la frecuencia máxima
                sumaMasFrecuente = i; // Actualizar la suma más frecuente
            }
        }
        return sumaMasFrecuente; // Devolver la suma más frecuente
    }

    /**
     * Método para mostrar un gráfico de frecuencias con asteriscos.
     * @param frecuencias Array que almacena las frecuencias de las sumas.
     */
    public static void mostrarGrafico(int[] frecuencias) {
        for (int i = 2; i <= 12; i++) { // Las sumas posibles van de 2 a 12
            System.out.print(i + ": "); // Mostrar el número de la suma
            for (int j = 0; j < frecuencias[i]; j++) { // Imprimir un asterisco por cada ocurrencia
                System.out.print("*");
            }
            System.out.println(); // Nueva línea para la siguiente suma
        }
    }
}