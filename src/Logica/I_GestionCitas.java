import java.util.ArrayList;
import java.util.Scanner;

public class I_GestionCitas {
    // Lista para almacenar las citas
    static ArrayList<String> nombresPacientes = new ArrayList<>();
    static ArrayList<String> horasCitas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=== Gestión de Citas Médicas ===");

        // Bucle principal del menú
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> agregarCita(scanner); // Agregar una nueva cita
                case 2 -> verCitas(); // Ver todas las citas
                case 3 -> cancelarCita(scanner); // Cancelar una cita
                case 4 -> System.out.println("Saliendo del programa..."); // Salir
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close(); // Cerrar el scanner
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n[1] Agregar cita");
        System.out.println("[2] Ver citas");
        System.out.println("[3] Cancelar cita");
        System.out.println("[4] Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para agregar una nueva cita
    public static void agregarCita(Scanner scanner) {
        System.out.print("Introduce el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce la hora de la cita (formato HH:MM): ");
        String hora = scanner.nextLine();

        // Guardar los datos en las listas
        nombresPacientes.add(nombre);
        horasCitas.add(hora);

        System.out.println("Cita agregada correctamente.");
    }

    // Método para ver todas las citas
    public static void verCitas() {
        if (nombresPacientes.isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            System.out.println("\n=== Lista de Citas ===");
            for (int i = 0; i < nombresPacientes.size(); i++) {
                System.out.println((i + 1) + ". Paciente: " + nombresPacientes.get(i) + " | Hora: " + horasCitas.get(i));
            }
        }
    }

    // Método para cancelar una cita
    public static void cancelarCita(Scanner scanner) {
        if (nombresPacientes.isEmpty()) {
            System.out.println("No hay citas para cancelar.");
            return;
        }

        verCitas(); // Mostrar las citas disponibles

        System.out.print("Introduce el número de la cita que deseas cancelar: ");
        int numeroCita = scanner.nextInt();

        // Validar el número de cita
        if (numeroCita < 1 || numeroCita > nombresPacientes.size()) {
            System.out.println("Número de cita inválido.");
        } else {
            // Eliminar la cita seleccionada
            nombresPacientes.remove(numeroCita - 1);
            horasCitas.remove(numeroCita - 1);
            System.out.println("Cita cancelada correctamente.");
        }
    }
}