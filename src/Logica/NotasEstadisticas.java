
/*
Objetivo: Leer notas de alumnos y calcular estadísticas.

Enunciado:
Crea un programa que lea las notas de N alumnos (por ejemplo, de 0 a 10) 
y que, una vez introducidas, muestre:

    Nota media, máxima y mínima.

    Cuántos alumnos han aprobado (≥5).

    Cuántos han sacado sobresaliente (≥9).

    Histograma simple (por ejemplo: 5-6: ***, 6-7: **, etc.)

Requisitos:
    Arrays para almacenar notas.

Métodos para:

    Leer las notas.

    Calcular estadísticas.

    Mostrar histograma.

Evitar entradas inválidas (números negativos o mayores que 10).
*/
    
package Logica;

import java.util.Scanner;

public class NotasEstadisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de alumnos
        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        // Inicializar el array de notas
        double[] notas = new double[numAlumnos];

        // Leer las notas
        leerNotas(scanner, notas);

        // Calcular estadísticas
        double media = calcularMedia(notas);
        double maxima = calcularMaxima(notas);
        double minima = calcularMinima(notas);
        int aprobados = contarAprobados(notas);
        int sobresalientes = contarSobresalientes(notas);

        // Mostrar estadísticas
        System.out.println("Nota media: " + media);
        System.out.println("Nota máxima: " + maxima);
        System.out.println("Nota mínima: " + minima);
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de sobresalientes: " + sobresalientes);

        // Mostrar histograma
        mostrarHistograma(notas);

        scanner.close();
    }

    public static void leerNotas(Scanner scanner, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Introduce la nota del alumno " + (i + 1) + " (0-10): ");
                nota = scanner.nextDouble();
            } while (!validarNota(nota));
            notas[i] = nota;
        }
    }

    public static boolean validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
            return false;
        }
        return true;
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double calcularMaxima(double[] notas) {
        double maxima = notas[0];
        for (double nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    public static double calcularMinima(double[] notas) {
        double minima = notas[0];
        for (double nota : notas) {
            if (nota < minima) {
                minima = nota;
            }
        }
        return minima;
    }

    public static int contarAprobados(double[] notas) {
        int aprobados = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int contarSobresalientes(double[] notas) {
        int sobresalientes = 0;
        for (double nota : notas) {
            if (nota >= 9) {
                sobresalientes++;
            }
        }
        return sobresalientes;
    }

    public static void mostrarHistograma(double[] notas) {
        int[] histograma = new int[11];
        for (double nota : notas) {
            histograma[(int) nota]++;
        }
        System.out.println("Histograma de notas:");
        for (int i = 0; i < histograma.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < histograma[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

