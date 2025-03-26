package Metodos;

public class CA_MetodosYVariables {
    public static void main(String[] args) {
        /*
         * ================================
         * = Variables y Tipos Primitivos =
         * ================================
         */

        imprimirNombreEjercicio("Ejercicio 1: Mostrar nombre");
        // Declara una variable String que contenga tu nombre y muéstralo por pantalla.
        String nombre = "Juan";
        System.out.println("Nombre: " + nombre);
        separador();

        imprimirNombreEjercicio("Ejercicio 2: Suma de dos números");
        // Declara dos variables int, asígnales valores y muestra la suma de ambas.
        int num1 = 5;
        int num2 = 10;
        System.out.println("Suma: " + (num1 + num2));
        separador();

        imprimirNombreEjercicio("Ejercicio 3: Resta de dos números");
        // Declara dos variables int, asígnales valores y muestra la resta del primero menos el segundo.
        System.out.println("Resta: " + (num1 - num2));
        separador();

        imprimirNombreEjercicio("Ejercicio 4: Multiplicación de dos números");
        // Declara dos variables int y muestra su multiplicación.
        System.out.println("Multiplicación: " + (num1 * num2));
        separador();

        imprimirNombreEjercicio("Ejercicio 5: División entera de dos números");
        // Declara dos variables int y muestra la división entera entre ellas.
        System.out.println("División: " + (num1 / num2));
        separador();

        imprimirNombreEjercicio("Ejercicio 6: Operador módulo");
        // Declara dos variables int y muestra el resultado del operador módulo %.
        System.out.println("Módulo: " + (num1 % num2));
        separador();

        imprimirNombreEjercicio("Ejercicio 7: Concatenar nombre y edad");
        // Declara una variable String para el nombre y una variable int para la edad.
        // Muestra un mensaje concatenando ambas.
        int edad = 25;
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        separador();

        imprimirNombreEjercicio("Ejercicio 8: Declarar variables primitivas");
        // Declara al menos una variable de cada tipo primitivo
        // (byte, short, int, long, float, double, char, boolean)
        // y muestra un mensaje que confirme que todo está bien declarado.
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.5f;
        double d = 6.6;
        char c = 'A';
        boolean bool = true;
        System.out.println("Variables primitivas declaradas correctamente.");
        System.out.println("Valor de byte b: " + b);
        System.out.println("Valor de short s: " + s);
        System.out.println("Valor de int i: " + i);
        System.out.println("Valor de long l: " + l);
        System.out.println("Valor de float f: " + f);
        System.out.println("Valor de double d: " + d);
        System.out.println("Valor de char c: " + c);
        System.out.println("Valor de boolean bool: " + bool);
        separador();

        /*
         * =============================
         * = Operaciones con variables =
         * =============================
         */
        imprimirNombreEjercicio("Ejercicio 9: Saludar");
        // Declara un método saludar() que imprima un saludo y llámalo desde otro método.
        saludar();
        separador();

        imprimirNombreEjercicio("Ejercicio 10: Imprimir número");
        // Declara un método que reciba un número como parámetro y lo imprima por pantalla.
        // Llámalo con cualquier valor.
        imprimirNumero(10);
        separador();

        imprimirNombreEjercicio("Ejercicio 11: Sumar dos números");
        // Declara un método que reciba dos int, sume ambos y devuelva el resultado.
        // Muestra el resultado por pantalla.
        int suma = sumar(5, 10);
        System.out.println("Suma de dos números: " + suma);
        separador();

        imprimirNombreEjercicio("Ejercicio 12: Saludar con nombre");
        // Sobrecarga el método saludar para que también acepte un nombre y lo imprima.
        // Llama ambas versiones.
        saludar("Juan");
        separador();

        imprimirNombreEjercicio("Ejercicio 13: Sumar tres números");
        // Sobrecarga el método suma para que pueda recibir tres números.
        // Llama a esta versión y muestra el resultado.
        int sumaTres = sumar(5, 10, 15);
        System.out.println("Suma de tres números: " + sumaTres);
        separador();

        imprimirNombreEjercicio("Ejercicio 14: Multiplicación de dos doubles");
        // Haz una multiplicación entre dos variables double y muestra el resultado.
        double x = 2.5;
        double y = 4.0;
        double resultadoMultiplicacion = multiplicar(x, y);
        System.out.println("Multiplicación de x e y: " + resultadoMultiplicacion);
        separador();

        imprimirNombreEjercicio("Ejercicio 15: Conversión implícita de int a double");
        // Declara una variable int y asígnala a una variable double.
        // Imprime el resultado para comprobar la conversión implícita.
        int entero = 10;
        double doble = entero;
        System.out.println("Conversión implícita de int a double: " + doble);
        separador();

        imprimirNombreEjercicio("Ejercicio 16: Conversión explícita de double a int");
        // Declara una variable double y haz una conversión explícita (casting) a int.
        // Muestra el valor convertido.
        double decimal = 9.99;
        int enteroConvertido = (int) decimal;
        System.out.println("Conversión explícita de double a int: " + enteroConvertido);
        separador();

        imprimirNombreEjercicio("Ejercicio 17: Área de un triángulo");
        // Calcula el área de un triángulo utilizando base y altura como double.
        // Usa la fórmula (base * altura) / 2.
        double base = 5.0;
        double altura = 10.0;
        double areaTriangulo = (base * altura) / 2;
        System.out.println("Área del triángulo: " + areaTriangulo);
        separador();
    }

    // Método para imprimir un separador
    private static void separador() {
        System.out.println("========================================");
    }

    // Método para imprimir el nombre del ejercicio
    private static void imprimirNombreEjercicio(String nombre) {
        System.out.println("\n" + nombre);
    }

    // Métodos adicionales
    private static void saludar() {
        System.out.println("¡Hola!");
    }

    private static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    private static void imprimirNumero(int numero) {
        System.out.println("Número: " + numero);
    }

    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    private static double multiplicar(double a, double b) {
        return a * b;
    }
}