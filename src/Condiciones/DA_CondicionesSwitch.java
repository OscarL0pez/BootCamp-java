package Condiciones;

import java.util.Scanner;

public class DA_CondicionesSwitch {
    // 1. Indica numéricamente (del 1 al 7) el día de la semana
    // según el número que sea que muestre por pantalla 
    // el día de la semana en palabras (Lunes, Martes, Miércoles...)
    public static void ejercicio1(int dia) {
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido");
        }

    }

    // 2. Calificación con letra
    // A = Excelente, B = Notable, C = Aprobado, D = Insuficiente
    public static void ejercicio2(String calificacion) {
        switch (calificacion) {
            case "A" -> System.out.println("Excelente");
            case "B" -> System.out.println("Notable");
            case "C" -> System.out.println("Aprobado");
            case "D" -> System.out.println("Insuficiente");
            default -> System.out.println("Calificación inválida");
        }
        
    }

    // 3. Menú de opciones: genera un menú para iniciar un juego
    // que tenga varias opciones:
    // 1 -> Seleccionaste Nueva partida
    // 2 -> Seleccionaste Cargar partida
    // 3 -> Seleccionaste Salir
    // Opción inválida

    public static void ejercicio3() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Menú de opciones");
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Salir");
            System.out.println("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Seleccionaste Nueva partida");
                case 2 -> System.out.println("Seleccionaste Cargar partida");
                case 3 -> System.out.println("Seleccionaste Salir");
                default -> System.out.println("Opción inválida");
            }
        }
    }
        
    // 4. Estación del año: verifica en qué estación estás
    // declara una variable que contenga el nombre de la estación
    // verifica el nombre de la estación y cuando se dé el caso correcto
    // que muestre por pantalla: "Estás en [estacion]" 
    // [estacion] --> hace referencia al valor de la variable que 
    //                contiene el nombre de la estación
    public static void ejercicio4(String estacion) {
        switch (estacion) {
            case "Primavera" -> System.out.println("Estás en Primavera");
            case "Verano" -> System.out.println("Estás en Verano");
            case "Otoño" -> System.out.println("Estás en Otoño");
            case "Invierno" -> System.out.println("Estás en Invierno");
            default -> System.out.println("Estación inválida");
        }

    }

    // 5. Tipo de figura geométrica
    // 3 -> triángulo
    // 4 -> cuadrado o rectángulo
    // 5 -> pentágono
    // 6 -> hexágono
    public static void ejercicio5(int lados) {
        switch (lados) {
            case 3 -> System.out.println("Triángulo");
            case 4 -> System.out.println("Cuadrado o rectángulo");
            case 5 -> System.out.println("Pentágono");
            case 6 -> System.out.println("Hexágono");
            default -> System.out.println("Figura inválida");
        }

    }

    // 6. Tipo de moneda
    // USD -> Dolar
    // EUR -> Euro
    // GBP -> Libra
    // JPY -> Yen
    public static void ejercicio6() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tipo de moneda");
            System.out.println("USD -> Dolar");
            System.out.println("EUR -> Euro");
            System.out.println("GBP -> Libra");
            System.out.println("JPY -> Yen");
            System.out.println("Selecciona una opción: ");
            String moneda = scanner.nextLine();
            switch (moneda) {
                case "USD" -> System.out.println("Dolar");
                case "EUR" -> System.out.println("Euro");
                case "GBP" -> System.out.println("Libra");
                case "JPY" -> System.out.println("Yen");
                default -> System.out.println("Moneda inválida");
            }
        }
    }

    // 7. Número de mes: verifica el mes según su número (del 1 al 12)
    // Enero, Febrero...
    public static void ejercicio7() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Número de mes");
            System.out.println("Ingresa un número del 1 al 12: ");
            int mes = scanner.nextInt();
            switch (mes) {
                case 1 -> System.out.println("Enero");
                case 2 -> System.out.println("Febrero");
                case 3 -> System.out.println("Marzo");
                case 4 -> System.out.println("Abril");
                case 5 -> System.out.println("Mayo");
                case 6 -> System.out.println("Junio");
                case 7 -> System.out.println("Julio");
                case 8 -> System.out.println("Agosto");
                case 9 -> System.out.println("Septiembre");
                case 10 -> System.out.println("Octubre");
                case 11 -> System.out.println("Noviembre");
                case 12 -> System.out.println("Diciembre");
                default -> System.out.println("Mes inválido");
            }
        }
        
    }

    // 8. Clasificación por edad y periodo escolar
    // de 3 a 5 años: Infantil
    // de 6 a 11 años: Primaria
    // de 12 a 15 años: ESO
    // de 16 a 17 años: Bachillerato
    // de 18 a 21 años: Universidad
    // de 22 en adelante: Persona formada
    public static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clasificación por edad y periodo escolar");
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        switch (edad) {
            case 3, 4, 5 -> System.out.println("Infantil");
            case 6, 7, 8, 9, 10, 11 -> System.out.println("Primaria");
            case 12, 13, 14, 15 -> System.out.println("ESO");
            case 16, 17 -> System.out.println("Bachillerato");
            case 18, 19, 20, 21 -> System.out.println("Universidad");
            default -> System.out.println("Persona formada");
        }
        
    }

    // 9. Letra del DNI para un número fijo
    // Para calcular la letra se divide el número del DNI
    // entre 23 y el resto indica la letra, según la tabla
    // que encontraréis en este link:
    // https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/#:~:text=Por%20ejemplo%2C%20si%20el%20n%C3%BAmero,n%C3%BAmeros%20y%20d%C3%ADgito%20de%20control.
    public static void ejercicio9(int dni) {
        int resto = dni % 23;
        switch (resto) {
            case 0 -> System.out.println("T");
            case 1 -> System.out.println("R");
            case 2 -> System.out.println("W");
            case 3 -> System.out.println("A");
            case 4 -> System.out.println("G");
            case 5 -> System.out.println("M");
            case 6 -> System.out.println("Y");
            case 7 -> System.out.println("F");
            case 8 -> System.out.println("P");
            case 9 -> System.out.println("D");
            case 10 -> System.out.println("X");
            case 11 -> System.out.println("B");
            case 12 -> System.out.println("N");
            case 13 -> System.out.println("J");
            case 14 -> System.out.println("Z");
            case 15 -> System.out.println("S");
            case 16 -> System.out.println("Q");
            case 17 -> System.out.println("V");
            case 18 -> System.out.println("H");
            case 19 -> System.out.println("L");
            case 20 -> System.out.println("C");
            case 21 -> System.out.println("K");
            case 22 -> System.out.println("E");
        }

    }

    // 10. Estado de un semáforo
    public static void ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estado de un semáforo?");
        System.out.println("Rojo");
        System.out.println("Naranja");
        System.out.println("Verde");
        System.out.println("Selecciona un color: ");
        String color = scanner.nextLine();
        switch (color) {
            case "Rojo" -> System.out.println("Detente");
            case "Naranja", "Amarillo" -> System.out.println("Precaución");
            case "Verde" -> System.out.println("Sigue");
            default -> System.out.println("Color inválido");
        }
        
        scanner.close();
        
    }

    // Método main para ejecutar todos los ejercicios
    public static void main(String[] args) {
        //ejercicio1(2); 
        //ejercicio2("A"); 
        //ejercicio3(); 
        //ejercicio4(); 
        //ejercicio5();
        //ejercicio6(); 
        //ejercicio7(); 
        //ejercicio8(); 
        //ejercicio9(75963598); 
        //ejercicio10();
        
    }
}  
