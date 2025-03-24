package Metodos;

import java.util.Scanner;

public class CA_MetodosYCondiciones {
    // Va a afectar a toda la clase, se puede usar la variable sc dentro de:
    // metodo main, cualquier método que se declare fuera del método main
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Así te pedirá por la consola un número
        System.out.println("Introduce el número a (que sea entero y mayor que 0):");
        int a = sc.nextInt();

        // Así te pedirá por la consola otro número
        System.out.println("Introduce el número b (que sea entero y mayor que 0):");
        int b = sc.nextInt();

        // Comprobar si los números introducidos son distintos de 0
        if (a == 0 || b == 0) {
            System.out.println("No se puede dividir por 0. El programa se detendrá.");
            sc.close();
            return; // Detener la ejecución del programa
        }

        // Guarda en una variable llamada suma el resultado de llamar al método suma()
        int suma = suma(a, b);
        // Que muestre por pantalla dicho resultado
        System.out.println("Suma: " + suma);

        // Guarda en una variable llamada resta el resultado de llamar al método resta()
        int resta = resta(a, b);
        // Que muestre por pantalla dicho resultado
        System.out.println("Resta: " + resta);

        // Guarda en una variable llamada division el resultado de llamar al método division()
        int division = division(a, b);
        // Que muestre por pantalla dicho resultado
        System.out.println("División: " + division);

        // Guarda en una variable llamada multiplicacion el resultado de llamar al método multiplicacion()
        int multiplicacion = multiplicacion(a, b);
        // Que muestre por pantalla dicho resultado
        System.out.println("Multiplicación: " + multiplicacion);

        // Guarda en una variable llamada resto el resultado de llamar al método modulo()
        int resto = modulo(a, b);
        // Que muestre por pantalla dicho resultado
        System.out.println("Módulo: " + resto);

        // Comprobar si el resultado de RESTO es 0
        if (resto == 0) {
            System.out.println("Los números " + a + " y " + b + " son divisibles.");
        } else {
            System.out.println("Los números " + a + " y " + b + " NO son divisibles.");
        }

        // Cierra Scanner para evitar problemas (acostúmbrate a cerrarlo cuando deja de ser necesario)
        sc.close();
    } // Cierre del método main

    /*
     * Aunque esté después del método main Java va a entender el código.
     * Los métodos privados se declaran, por convención, después de los públicos.
     * Cada método llamado dentro de main, aunque se haya declarado después, va a ejecutarlo.
     * 
     * ----METODOLOGIA----
     * Define cada método como privado (private).
     * Define cada método como estático (static).
     * Define el tipo de cada método, a priori enteros.
     * Indica el nombre de cada método (suma, resta, division, multiplicacion, modulo)
     * Como los métodos tienen tipo todos tienen que tener retorno (return)
     * 
     * ----HELP! HELP!----
     * Recuerda que Java es de tipado estático, el tipo que devuelve el método
     * y el de la variable deben ser el mismo.
     */

    // Define los métodos necesarios en este espacio:

    private static int suma(int a, int b) {
        return a + b;
    }

    private static int resta(int a, int b) {
        return a - b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static int multiplicacion(int a, int b) {
        return a * b;
    }

    private static int modulo(int a, int b) {
        return a % b;
    }

    /* ================
     * =   ATENCION   =
     * ================
     * Fuera del método main() no puedes utilizar System.out.println()
     */
}