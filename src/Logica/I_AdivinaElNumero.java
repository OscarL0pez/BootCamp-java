/*
 * Genera un número aleatorio entre 1 y 100.
 * El usuario tiene que adivinarlo y recibir pistas.
 * 
 * El programa pedirá al usuario que introduzca un número.
 * Este número se tendrá que comprobar con el número aleatorio.
 * 
 * Tiene que contar la cantidad de intentos que se han realizado hasta
 * acertar con el número.
 * 
 * Debe lanzar pistas, si el número es demasiado alto, o bajo.
 */

import java.util.Scanner;

public class I_AdivinaElNumero {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        // Inicializar variables
        int intentos = 0; // Contador de intentos
        int numeroUsuario = 0; // Número introducido por el usuario
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He generado un número aleatorio entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle para que el usuario intente adivinar el número
        do {
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt(); // Leer el número introducido por el usuario
            intentos++; // Incrementar el contador de intentos

            // Comprobar si el número es mayor, menor o igual al número aleatorio
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es demasiado bajo. ¡Intenta de nuevo!");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es demasiado alto. ¡Intenta de nuevo!");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (numeroUsuario != numeroAleatorio); // Repetir hasta que el usuario adivine el número

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }
}