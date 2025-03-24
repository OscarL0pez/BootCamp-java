/*
 * ================
 * =   AVANZADO   =
 * ================
 * En estos ejercicios vais a tener que investigar un poco más.
 * Es muy importante que entrenemos la autosuficiencia desde el principio.
 * Es necesario que aprendáis a buscar en la red posibles soluciones a vuestros problemas
 * y tener el máximo de autonomía posible.
 * También es esencial manejarse con los manuales.
 * 
 * ====INSTRUCCIONES====
 * * Tienes que crear la clase.
 * * Tienes que crear el método main.
 * * Tienes que estructurar los ejercicios con comentarios y prints para que sea manejable.
 * * Importante preservar un buen orden en el código.
 * 
 * ====EJERCICIOS====
 * 1. Crea un programa que reciba (necesitas input) un número decimal como una String
 * Imprime ese número decimal como String
 * Conviértelo a double
 * Imprime el número convertido a double
 * Conviértelo a int
 * Imprime el número siendo int
 * ******************
 * 2. Crea una variable boolean y una variable int.
 * Súmalas. ¿Es posible? Justifícalo.
 * ******************
 * 3. Realiza una conversión de double a byte.
 * Muestra los valores antes y después de la conversión.
 * ******************
 * 4. Convierte un número float a int. Pero antes de hacer la conversión haz un redondeo.
 * Muestra los valores de las 3 fases, ejeplo:
 * Valor del número float: xxx
 * Valor del número redondeado: xxx
 * Valor del número convertido a int: xxx
 * ******************
 * 5. Crea un conversor de temperaturas. Necesitas inputs para ello.
 * El usuario va a ingresar un valor que será una temperatura en Celsius, 
 * y tendrá el tipo String.
 * Ese valor tendrá que transformarse a double.
 * Tienes que mostrar tres resultados: Celius, Fahrenheit y Kelvin
 */

package Variables;

import java.util.Scanner;

public class BC_AvanzadoVariablesYTipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("EJERCICIO 1:");
        System.out.print("Introduce un número decimal como una String: ");
        String numeroDecimalString = scanner.nextLine();
        System.out.println("Número decimal como String: " + numeroDecimalString);
        double numeroDecimalDouble = Double.parseDouble(numeroDecimalString);
        System.out.println("Número convertido a double: " + numeroDecimalDouble);
        int numeroDecimalInt = (int) numeroDecimalDouble;
        System.out.println("Número convertido a int: " + numeroDecimalInt);
        System.out.println("******************");

        // Ejercicio 2
        System.out.println("EJERCICIO 2:");
        boolean booleanVar = true;
        int intVar = 5;
        // No es posible sumar directamente un boolean y un int en Java.
        // Justificación: Los tipos de datos boolean e int son incompatibles para operaciones aritméticas.
        // System.out.println("Suma de boolean y int: " + (booleanVar + intVar)); // Esto causará un error de compilación
        System.out.println("No es posible sumar directamente un boolean y un int en Java.");
        System.out.println("******************");

        // Ejercicio 3
        System.out.println("EJERCICIO 3:");
        double doubleVar = 123.456;
        System.out.println("Valor original (double): " + doubleVar);
        byte byteVar = (byte) doubleVar;
        System.out.println("Valor convertido a byte: " + byteVar);
        System.out.println("******************");

        // Ejercicio 4
        System.out.println("EJERCICIO 4:");
        float floatVar = 123.456f;
        System.out.println("Valor del número float: " + floatVar);
        int floatRedondeado = Math.round(floatVar);
        System.out.println("Valor del número redondeado: " + floatRedondeado);
        int floatConvertidoAInt = (int) floatRedondeado;
        System.out.println("Valor del número convertido a int: " + floatConvertidoAInt);
        System.out.println("******************");

        // Ejercicio 5
        System.out.println("EJERCICIO 5:");
        System.out.print("Introduce una temperatura en Celsius (como String): ");
        String temperaturaCelsiusString = scanner.nextLine();
        double temperaturaCelsius = Double.parseDouble(temperaturaCelsiusString);
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        System.out.println("Temperatura en Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura en Kelvin: " + temperaturaKelvin);

        scanner.close();
    }
}