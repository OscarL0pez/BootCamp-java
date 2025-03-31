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

    Métodos para:

        * Lanzar dados.

        * Registrar resultados.

        * Analizar y mostrar resultados.

    Uso de Math.random() o Random.
    */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el número de tiradas: ");
            int tiradas = scanner.nextInt();

            int[] frecuencias = new int[13]; 

            
            for (int i = 0; i < tiradas; i ++) {
                int dado1 = lanzarDado();
                int dado2 = lanzarDado();
                int suma = dado1 + dado2;
                registrarSuma(frecuencias, suma);
            }
            
            // Mostrar resultados
            mostrarFrecuencias(frecuencias);
            int sumaFrecuente = obtenerSumaMasFrecuente(frecuencias);
            System.out.println("La suma más frecuente es: " + sumaFrecuente);

            // Mostrar gráfico
            System.out.println("Gráfico de frecuencias:");
            mostrarGrafico(frecuencias);
        }
    }

    // Métodos
    public static int lanzarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void registrarSuma(int[] frecuencias, int suma) {
        frecuencias[suma] ++;
    }

    public static void mostrarFrecuencias(int [] frecuencias) {
        System.out.println("Frecuencias de las sumas:");
        for (int i = 2; i <= 12; i++) {
            System.out.println("suma " + i + ": " + frecuencias[i] + "veces");
        }
    }

    public static int obtenerSumaMasFrecuente(int[] frecuencias) {
        int maxFrecuencia = 0;
        int sumaMasFrecuente = 2;
        for (int i = 2; i <= 12; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                sumaMasFrecuente = i;
            }
        }
        return sumaMasFrecuente;
    }

    public static void mostrarGrafico(int[] frecuencias) {
        for (int i = 2; i <= 12; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

