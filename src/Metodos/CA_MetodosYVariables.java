package Metodos;

public class CA_MetodosYVariables {
    public static void main(String[] args) {
        /*
         * ================================
         * = Variables y Tipos Primitivos =
         * ================================
         */

        // Declara una variable String que contenga tu nombre y muéstralo por pantalla.
        String nombre = "Juan";
        System.out.println("Nombre: " + nombre);
        System.out.println();

        // Declara dos variables int, asígnales valores y muestra la suma de ambas.
        int num1 = 5;
        int num2 = 10;
        System.out.println("Suma: " + (num1 + num2));

        // Declara dos variables int, asígnales valores y muestra la resta del primero menos el segundo.
        System.out.println("Resta: " + (num1 - num2));

        // Declara dos variables int y muestra su multiplicación.
        System.out.println("Multiplicación: " + (num1 * num2));

        // Declara dos variables int y muestra la división entera entre ellas.
        System.out.println("División: " + (num1 / num2));

        // Declara dos variables int y muestra el resultado del operador módulo %.
        System.out.println("Módulo: " + (num1 % num2));

        // Declara una variable String para el nombre y una variable int para la edad.
        // Muestra un mensaje concatenando ambas.
        int edad = 25;
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);

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

        /*
         * =============================
         * = Operaciones con variables =
         * =============================
         * ** A partir de aquí todo o casi todo va a necesitar hacer un método...
         */
        // Declara un método saludar() que imprima un saludo y llámalo desde otro método.
        saludar();
        

        // Declara un método que reciba un número como parámetro y lo imprima por pantalla.
        // Llámalo con cualquier valor.
        imprimirNumero(10);

        // Declara un método que reciba dos int, sume ambos y devuelva el resultado.
        // Muestra el resultado por pantalla.
        int suma = sumar(5, 10);
        System.out.println("Suma de dos números: " + suma);

        // Sobrecarga el método saludar para que también acepte un nombre y lo imprima.
        // Llama ambas versiones.
        saludar("Juan");

        // Sobrecarga el método suma para que pueda recibir tres números.
        // Llama a esta versión y muestra el resultado.
        int sumaTres = sumar(5, 10, 15);
        System.out.println("Suma de tres números: " + sumaTres);

        // Declara dos variables int, pásalas a un método que sume y devuelva el resultado, y muéstralo.
        int a = 7;
        int b2 = 3;
        int resultadoSuma = sumar(a, b2);
        System.out.println("Suma de a y b: " + resultadoSuma);

        // Haz una multiplicación entre dos variables double y muestra el resultado.
        double x = 2.5;
        double y = 4.0;
        double resultadoMultiplicacion = multiplicar(x, y);
        System.out.println("Multiplicación de x e y: " + resultadoMultiplicacion);

        /*
         * =============================
         * = Conversiones y Constantes =
         * =============================
         */
        // Declara una variable int y asígnala a una variable double.
        // Imprime el resultado para comprobar la conversión implícita.
        int entero = 10;
        double doble = entero;
        System.out.println("Conversión implícita de int a double: " + doble);

        // Declara una variable double y haz una conversión explícita (casting) a int.
        // Muestra el valor convertido.
        double decimal = 9.99;
        int enteroConvertido = (int) decimal;
        System.out.println("Conversión explícita de double a int: " + enteroConvertido);

        // Calcula el área de un triángulo utilizando base y altura como double.
        // Usa la fórmula (base * altura) / 2.
        double base = 5.0;
        double altura = 10.0;
        double areaTriangulo = (base * altura) / 2;
        System.out.println("Área del triángulo: " + areaTriangulo);

        // Declara una variable String para ciudad y una int para el año.
        // Imprime una frase como “Aprendiendo Java...”.
        String ciudad = "Madrid";
        int año = 2025;
        System.out.println("Aprendiendo Java en " + ciudad + " en el año " + año);

        // Declara un método que reciba un número y devuelva su cuadrado.
        // Llama al método y muestra el resultado.
        int numero = 4;
        int cuadrado = calcularCuadrado(numero);
        System.out.println("Cuadrado de " + numero + ": " + cuadrado);

        /*
         * ====================================
         * = Operaciones Compuestas y Métodos =
         * ====================================
         */
        // Declara dos variables y muestra cuál es mayor utilizando el operador ternario (? :).
        int numA = 8;
        int numB = 12;
        int mayor = (numA > numB) ? numA : numB;
        System.out.println("El mayor es: " + mayor);

        // Declara tres variables String y concaténalas en una frase completa.
        String str1 = "Hola";
        String str2 = "mundo";
        String str3 = "Java";
        String fraseCompleta = str1 + " " + str2 + " " + str3;
        System.out.println("Frase completa: " + fraseCompleta);

        // Declara dos variables int, multiplícalas y almacena el resultado en una tercera variable. Imprime el resultado.
        int numX = 3;
        int numY = 4;
        int resultadoMultiplicacionInt = numX * numY;
        System.out.println("Multiplicación de numX y numY: " + resultadoMultiplicacionInt);

        // Crea un método que reciba dos enteros y devuelva su promedio como double. Imprime el resultado.
        int num1Prom = 7;
        int num2Prom = 9;
        double promedio = calcularPromedio(num1Prom, num2Prom);
        System.out.println("Promedio de num1Prom y num2Prom: " + promedio);
    }

    // Métodos
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

    private static int calcularCuadrado(int numero) {
        return numero * numero;
    }

    private static double calcularPromedio(int a, int b) {
        return (a + b) / 2.0;
    }
}