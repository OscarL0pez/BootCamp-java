package Metodos;

/*
 * =================
 * =    METODOS    =
 * =================
 * Los métodos, en otros lenguajes también llamados funciones,
 * pueden ser públicos o privados.
 * - public: hacen que sean accesibles desde otras clases
 * - private: únicamente son accesibles desde la propia clase
 * 
 * Vamos a crear una sencilla calculadora que tendrá las siguientes funcionalidades:
 * 1. sumar
 * 2. restar
 * 3. multiplicar
 * 4. dividir
 * 5. módulo --> si una división es o no exacta
 * 
 * ====OBJETIVOS====
 * - Comprender de una manera básica cómo crear métodos y llamarlos.
 * - Almacenar el resultado de un método en una variable.
 * - Utilizar inputs para interacción con el usuario de nuestro programa.
 * 
 * ----INDICACIONES----
 * Sigue los pasos de la plantilla facilitada.
 * 
 * ----AYUDA----
 * Por lo general primero se definen los métodos públicos.
 * Después los privados.
 * Para este ejercicio vamos a hacerlo todo privado y estático.
 * 
 * private static <tipo> <nombre> (<tipo> <nombre>, <tipo> <nombre>) {}
 * 
 * ===============
 * =   ESQUEMA   =
 * ===============
 * declaración de clase
 *     declaración de métodos públicos (como main)
 *         instrucciones o acciones dentro de main
 *         lo que se ejecutará y será visible por consola siempre que tenga prints
 *     declaración de métodos privados (diferentes operaciones)
 */

import java.util.Scanner;
public class C_Metodos {
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

        // Guarda en una variable llamada suma el resultado de llamar al método suma()
        
        // Que muestre por pantalla dicho resultado
        

        // Guarda en una variable llamada resta el resultado de llamar al método resta()
        
        // Que muestre por pantalla dicho resultado
        

        // Guarda en una variable llamada division el resultado de llamar al método division()
        
        // Que muestre por pantalla dicho resultado
        

        // Guarda en una variable llamada multiplicacion el resultado de llamar al método multiplicacion()
        
        // Que muestre por pantalla dicho resultado
        

        // Guarda en una variable llamada resto el resultado de llamar al método modulo()
        
        // Que muestre por pantalla dicho resultado
        

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






    /* ================
     * =   ATENCION   =
     * ================
     * Fuera del método main() no puedes utilizar System.out.println()
     */
}
