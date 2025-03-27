import java.util.Scanner;

public class DE_Condicionespro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> ejecutarDiaSemana(sc);
                case 2 -> ejecutarCalificacion(sc);
                case 3 -> ejecutarMenuJuego(sc);
                case 4 -> ejecutarEstacion(sc);
                case 5 -> ejecutarFigura(sc);
                case 6 -> ejecutarMoneda(sc);
                case 7 -> ejecutarMes(sc);
                case 8 -> ejecutarEtapaEscolar(sc);
                case 9 -> ejecutarLetraDNI(sc);
                case 10 -> ejecutarSemaforo(sc);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("""
        ==== MENÚ ====
        1. Día de la semana
        2. Calificación
        3. Menú juego
        4. Estación del año
        5. Tipo de figura
        6. Tipo de moneda
        7. Nombre del mes
        8. Etapa escolar por edad
        9. Letra del DNI
        10. Estado del semáforo
        0. Salir
        Elige una opción:
        """);
    }

    public static void ejecutarDiaSemana(Scanner sc) {
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = sc.nextInt();
        String resultado = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número no válido";
        };
        System.out.println("Día: " + resultado);
    }

    public static void ejecutarCalificacion(Scanner sc) {
        System.out.print("Introduce una calificación (A, B, C, D): ");
        String nota = sc.nextLine().toUpperCase();
        String mensaje = switch (nota) {
            case "A" -> "Excelente";
            case "B" -> "Notable";
            case "C" -> "Aprobado";
            case "D" -> "Insuficiente";
            default -> "Calificación no válida";
        };
        System.out.println(mensaje);
    }

    public static void ejecutarMenuJuego(Scanner sc) {
        System.out.print("Selecciona opción de juego (1-3): ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> System.out.println("Seleccionaste Nueva partida");
            case 2 -> System.out.println("Seleccionaste Cargar partida");
            case 3 -> System.out.println("Seleccionaste Salir");
            default -> System.out.println("Opción inválida");
        }
    }

    public static void ejecutarEstacion(Scanner sc) {
        System.out.print("Introduce una estación (Verano, Invierno, etc.): ");
        String estacion = sc.nextLine().toLowerCase();
        switch (estacion) {
            case "verano", "invierno", "otoño", "primavera" ->
                System.out.println("Estás en " + estacion);
            default -> System.out.println("Estación no válida");
        }
    }

    public static void ejecutarFigura(Scanner sc) {
        System.out.print("Introduce número de lados (3-6): ");
        int lados = sc.nextInt();
        String figura = switch (lados) {
            case 3 -> "Triángulo";
            case 4 -> "Cuadrado o Rectángulo";
            case 5 -> "Pentágono";
            case 6 -> "Hexágono";
            default -> "Figura no reconocida";
        };
        System.out.println("Figura: " + figura);
    }

    public static void ejecutarMoneda(Scanner sc) {
        System.out.print("Introduce código de moneda (USD, EUR, etc.): ");
        String moneda = sc.nextLine().toUpperCase();
        switch (moneda) {
            case "USD" -> System.out.println("Dólar");
            case "EUR" -> System.out.println("Euro");
            case "GBP" -> System.out.println("Libra");
            case "JPY" -> System.out.println("Yen");
            default -> System.out.println("Moneda desconocida");
        }
    }

    public static void ejecutarMes(Scanner sc) {
        System.out.print("Introduce un número del 1 al 12: ");
        int mes = sc.nextInt();
        String nombreMes = switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes no válido";
        };
        System.out.println("Mes: " + nombreMes);
    }

    public static void ejecutarEtapaEscolar(Scanner sc) {
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        String etapa = switch (edad) {
            case 3, 4, 5 -> "Infantil";
            case 6, 7, 8, 9, 10, 11 -> "Primaria";
            case 12, 13, 14, 15 -> "ESO";
            case 16, 17 -> "Bachillerato";
            case 18, 19, 20, 21 -> "Universidad";
            default -> edad >= 22 ? "Persona formada" : "Edad no válida";
        };
        System.out.println("Etapa: " + etapa);
    }

    public static void ejecutarLetraDNI(Scanner sc) {
        System.out.print("Introduce tu número de DNI: ");
        int dni = sc.nextInt();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(dni % 23);
        System.out.println("Letra del DNI: " + letra);
    }

    public static void ejecutarSemaforo(Scanner sc) {
        System.out.print("Introduce el color del semáforo (Rojo, Verde, Naranja): ");
        String color = sc.nextLine().toLowerCase();
        switch (color) {
            case "rojo" -> System.out.println("Detente");
            case "verde" -> System.out.println("Avanza");
            case "naranja", "amarillo" -> System.out.println("Precaución");
            default -> System.out.println("Color no reconocido");
        }
    }
}
