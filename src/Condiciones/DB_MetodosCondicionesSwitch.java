package Condiciones;


/*
 * Casi cada ejercicio necesita que crees un método.
 * Cada ejercicio está declarado como un método para que
 * desde main puedas ejecutar individualmente cada uno de ellos.
 * 
 * El método, o métodos, que crees para cada ejercicio hazlo
 * en el espacio entre ese ejercicio y el siguiente.
 * Ejemplo: Comprueba si es un varón fumador con un método
 * y luego imprime el resultado:
 * 
 * public static void ejercicioEjemplo() {
 *     String sexo = "HomBre";
 *     String fumador = "Si";
 *     
 *     if (esFumador) {
 *         System.out.println("El sujeto fuma.");
 *     } else {
 *         System.out.println("El sujeto NO fuma.");
 *     }
 * }
 * 
 * La finalidad de estos ejercicios es practicar con métodos.
 * Practicar con condicionales.
 * Anidar métodos.
 * Relacionar métodos con condiciones.
 */

public class DB_MetodosCondicionesSwitch {

    // 1. Método que verifica si un número es par o impar
        /*
         * Primero tienes que declarar un método que devuelva
         * un booleano.
         * Luego vas a utilizar ese método en la condición.
         */
    public static void ejercicio1() {
        int numero = 5;
        boolean esPar = esNumeroPar(numero);
        
        if (esPar) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

    }

    // 2. Método que verifica si un número es múltiplo de 3 y 5
        /*
         * Primero declara un método que verifique si un número
         * es múltiplo de otro.
         * (Necesitará el número a verificar y el divisor a comprobar)
         */
    public static void ejercicio2() {
        int numero = 15;
        int divisor1 = 3;
        int divisor2 = 5;

        boolean esMultiploDe3 = esMultiplo(numero, divisor1);
        boolean esMultiploDe5 = esMultiplo(numero, divisor2);

        if (esMultiploDe3 && esMultiploDe5) {
            System.out.println("El número " + numero + " es múltiplo de " + divisor1 + " y " + divisor2 + ".");
        } else {
            System.out.println("El número " + numero + " NO es múltiplo de " + divisor1 + " y " + divisor2 + ".");
        }
    
    }

    // 3. Método que devuelve el mayor de dos números
        /*
         * Primero haz un método que devuelva el mayor de ambos
         * Utiliza el operador ternario... (<> ? _ : _ )
         */
    public static void ejercicio3() {
        int numero1 = 10;
        int numero2 = 20;

        int mayor = (numero1 > numero2) ? numero1 : numero2;

        System.out.println("El mayor número es: " + mayor);

    }

    // 4. Calcular el precio final con descuento usando switch
        /*
         * Si el cliente es VIP paga el 80%
         * Si el cliente es REGULAR paga el 90%
         * Crea un método que pida:
         *  - tipo de cliente
         *  - precio del producto
         * Utiliza el método que has creado para ver el resultado.
         */
    public static void ejercicio4() {
        String tipoCliente = "VIP";
        double precioProducto = 100.0;
        double precioFinal;

        precioFinal = switch (tipoCliente.toUpperCase()) {
            case "VIP" -> precioProducto * 0.8;
            case "REGULAR" -> precioProducto * 0.9;
            default -> precioProducto;
        }; // Sin descuento

        System.out.println("El precio final es: " + precioFinal);
    
    }

    // 5. Determinar si un carácter es vocal
        /*
         * Utiliza métodos de String
         * PISTA: puedo saber la posición de cada caracter
         *        dentro de una String. Si tiene posición...
         */
    public static void ejercicio5() {
        char caracter = 'a';
        String vocales = "aeiouAEIOU";

        if (vocales.indexOf(caracter) != -1) {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' NO es una vocal.");
        }
    
    }

    // 6. Determinar si una persona puede conducir (edad >= 18 y examen aprobado)
        /*
         * Haz una función que verifique si puede o no conducir. (que devuelva un boolean)
         * Utiliza esa función en tu bloque condicional.
         */
    public static void ejercicio6() {
        int edad = 20;
        boolean examenAprobado = true;

        if (puedeConducir(edad, examenAprobado)) {
            System.out.println("La persona puede conducir.");
        } else {
            System.out.println("La persona NO puede conducir.");
        }
    
    }

    // 7. Clasificar nota con método y switch
        /*
         * Primero haz un método que devuelva una String
         * La nota es sobre 100
         * Insuficiente: < 50
         * Suficiente: 50 a 65
         * Bien: 65 a 74
         * Notable: 75 a 89
         * Excelente: 90 a 100
         * 
         * En el ejercicio imprime algo así como "Calificación: [return del método que has creado]"
         */
    public static void ejercicio7() {
        String calificacion;

        int nota = 85; // Asignar un valor a la variable nota
        calificacion = switch (nota / 10) {
            case 0, 1, 2, 3, 4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Excelente";
            default -> "Nota inválida";
        };

        System.out.println("Calificación: " + calificacion);


    
    }

    // 8. Determinar si un año es bisiesto usando métodos
        /*
         * Crea un método para determinar si un año es o no bisiesto
         * Dentro del ejercicio usa el operador ternario.
         * Si el resultado del método creado es true -> "Bisiesto"
         * Si el resultado del método creado es false -> "No bisiesto"
         */
    public static void ejercicio8() {
        int anio = 2024;
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        String resultado = esBisiesto ? "Bisiesto" : "No bisiesto";
        System.out.println("El año " + anio + " es " + resultado);

    }

    // 9. Método que clasifica edad en etapas
        /*
         * Primero crea un método que devuelva una String
         * < 0 -> Edad inválida
         * <= 12 -> Niñez
         * <= 17 -> Adolescencia 
         * <= 64 -> Adulto
         */
    public static void ejercicio9() {
        String edad = "25"; // Declarar y asignar un valor a la variable edad
        int edadInt = Integer.parseInt(edad);
        String etapa;

        if (edadInt < 0) {
            etapa = "Edad inválida";
        } else if (edadInt <= 12) {
            etapa = "Niñez";
        } else if (edadInt <= 17) {
            etapa = "Adolescencia";
        } else if (edadInt <= 64) {
            etapa = "Adulto";
        } else {
            etapa = "Anciano";
        }

        System.out.println("La persona está en la etapa: " + etapa);



    }

    // 10. Método que recibe un carácter y devuelve si es mayúscula o minúscula
        /*
         * Haz un método que reciba una letra del tipo char y verifique si es
         * mayúscula o minúscula. El método devolverá una String: "Mayúscula" o "Minúscula".
         * No puedes utilizar Character.isUpperCase() ni Character.isLowerCase()
         * Pista: ASCII...
         */
    public static void ejercicio10() {
        char letra = 'A';
        String resultado;

        if (letra >= 'A' && letra <= 'Z') {
            resultado = "Mayúscula";
        } else if (letra >= 'a' && letra <= 'z') {
            resultado = "Minúscula";
        } else {
            resultado = "No es una letra válida";
        }

        System.out.println("La letra '" + letra + "' es: " + resultado);
    
    }

    // 11. Método que devuelve el signo zodiacal en función del mes y día
        /*
         * Los meses van del 1 al 12
         * Los días van del 1 al 31
         * Haz un método que devuelva una String con el nombre del signo zodiacal
         * Necesita dos parámetros: mes y día
         */
    public static void ejercicio11() {
        int mes = 3; // Marzo
        int dia = 21; // 21 de marzo
        String signoZodiacal;

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signoZodiacal = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signoZodiacal = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signoZodiacal = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signoZodiacal = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signoZodiacal = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signoZodiacal = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signoZodiacal = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signoZodiacal = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signoZodiacal = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signoZodiacal = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signoZodiacal = "Acuario";
        } else {
            signoZodiacal = "Piscis";
        }

        System.out.println("El signo zodiacal es: " + signoZodiacal);

    
    }

    // 12. Método que evalúa si una contraseña es segura
    public static void ejercicio12() {
        String contrasena = "Abc1234";
        boolean esSegura = true;

        if (contrasena.length() < 8) {
            esSegura = false;
        } else if (!contrasena.matches(".*[A-Z].*")) {
            esSegura = false;
        } else if (!contrasena.matches(".*[a-z].*")) {
            esSegura = false;
        } else if (!contrasena.matches(".*[0-9].*")) {
            esSegura = false;
        }

        if (esSegura) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña NO es segura.");
        }
    
    }

    // 13. Método que según una opción del usuario ejecuta una operación matemática
        /*
         * para dividir tiene que comprobar si el divisor es distinto a 0
         * si no, que lance un error (System.err.println();)
         */
    public static void ejercicio13() {
        int opcion = 1; // 1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir
        double num1 = 10;
        double num2 = 0;
        double resultado;

        switch (opcion) {
            case 1 -> {
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            case 4 -> {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.err.println("Error: División por cero.");
                }
            }
            default -> System.err.println("Opción inválida.");
        }

    }

    public static void main(String[] args) {
        //ejercicio1(); 
        ejercicio2();
        //ejercicio3(); 
        //ejercicio4(); 
        //ejercicio5();
        //ejercicio6(); 
        //ejercicio7(); 
        //ejercicio8(); 
        //ejercicio9(); 
        //ejercicio10();
        //ejercicio11(); 
        //ejercicio12(); 
        //ejercicio13();
    }

    private static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

    private static boolean esMultiplo(int numero, int divisor2) {
        return numero % divisor2 == 0;
    }

    private static boolean puedeConducir(int edad, boolean examenAprobado) {
        return edad >= 18 && examenAprobado;
    }
}