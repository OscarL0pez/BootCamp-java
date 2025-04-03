/*
 * Haz un programa que reciba un texto
 * Divide el texto en palabras
 * Muestra el total de palabras
 * ¿Cuál es la palabra más larga?
 */

import java.util.Scanner;

public class I_AnalisisTexto {
    public static void main(String[] args) {
        
    }
    
    public class AnalizarTexto {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario que introduzca un texto
            System.out.println("Introduce un texto:");
            String texto = scanner.nextLine();
    
            // Dividir el texto en palabras
            String[] palabras = texto.split("\\s+"); // Divide por espacios en blanco
    
            // Mostrar el total de palabras
            System.out.println("Total de palabras: " + palabras.length);
    
            // Determinar la palabra más larga
            String palabraMasLarga = obtenerPalabraMasLarga(palabras);
            System.out.println("La palabra más larga es: " + palabraMasLarga);
    
            scanner.close(); // Cerrar el scanner
        }
    
        /**
         * Método para obtener la palabra más larga de un array de palabras.
         * @param palabras Array de palabras.
         * @return La palabra más larga.
         */
        public static String obtenerPalabraMasLarga(String[] palabras) {
            String palabraMasLarga = ""; // Inicializar con una cadena vacía
            for (String palabra : palabras) {
                if (palabra.length() > palabraMasLarga.length()) { // Comparar longitudes
                    palabraMasLarga = palabra; // Actualizar si se encuentra una palabra más larga
                }
            }
            return palabraMasLarga;
        }
    }
}