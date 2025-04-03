package Logica;

import java.util.Scanner;

public class Inventario {

    // Constante que define el número máximo de productos en el inventario
    static final int MAX_PRODUCTOS = 10;

    // Arrays paralelos para almacenar los datos de los productos
    static String[] nombres = new String[MAX_PRODUCTOS]; // Nombres de los productos
    static int[] cantidades = new int[MAX_PRODUCTOS];    // Cantidades de los productos
    static double[] precios = new double[MAX_PRODUCTOS]; // Precios de los productos
    static int totalProductos = 0; // Contador de productos añadidos al inventario

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion; // Variable para almacenar la opción seleccionada por el usuario

        // Bucle principal del menú
        do {
            mostrarMenu(); // Mostrar el menú de opciones
            opcion = scanner.nextInt(); // Leer la opción seleccionada
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Manejar la opción seleccionada usando un switch
            switch (opcion) {
                case 1 -> añadirProducto(scanner); // Añadir un nuevo producto al inventario
                case 2 -> mostrarProductos(); // Mostrar todos los productos del inventario
                case 3 -> buscarProducto(scanner); // Buscar un producto por su nombre
                case 4 -> actualizarStock(scanner); // Actualizar la cantidad de un producto
                case 5 -> calcularValorInventario(); // Calcular el valor total del inventario
                case 0 -> System.out.println("Saliendo del programa..."); // Salir del programa
                default -> System.out.println("Opción no válida."); // Manejar opciones inválidas
            }
        } while (opcion != 0); // Repetir mientras la opción no sea "Salir"

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n===== MENÚ INVENTARIO =====");
        System.out.println("1. Añadir producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Buscar producto por nombre");
        System.out.println("4. Actualizar stock");
        System.out.println("5. Calcular valor total del inventario");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para añadir un nuevo producto al inventario
    public static void añadirProducto(Scanner scanner) {
        // Verificar si el inventario está lleno
        if (totalProductos >= MAX_PRODUCTOS) {
            System.out.println("El inventario está lleno. No puedes añadir más productos.");
            return;
        }

        // Solicitar los datos del producto al usuario
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Guardar los datos del producto en los arrays
        nombres[totalProductos] = nombre;
        cantidades[totalProductos] = cantidad;
        precios[totalProductos] = precio;

        totalProductos++; // Incrementar el contador de productos
        System.out.println("Producto añadido correctamente.");
    }

    // Método para mostrar todos los productos del inventario
    public static void mostrarProductos() {
        // Verificar si el inventario está vacío
        if (totalProductos == 0) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        // Mostrar la lista de productos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (int i = 0; i < totalProductos; i++) {
            System.out.printf("%d. %s | Cantidad: %d | Precio: %.2f€\n",
                    (i + 1), nombres[i], cantidades[i], precios[i]);
        }
    }

    // Método para buscar un producto por su nombre
    public static void buscarProducto(Scanner scanner) {
        System.out.print("Nombre del producto a buscar: ");
        String nombreBuscado = scanner.nextLine(); // Leer el nombre del producto a buscar
        boolean encontrado = false; // Variable para indicar si el producto fue encontrado

        // Buscar el producto en el inventario
        for (int i = 0; i < totalProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) { // Comparar ignorando mayúsculas/minúsculas
                System.out.printf("Producto encontrado: %s | Cantidad: %d | Precio: %.2f€\n",
                        nombres[i], cantidades[i], precios[i]);
                encontrado = true;
                break;
            }
        }

        // Mostrar mensaje si el producto no fue encontrado
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para actualizar la cantidad de un producto
    public static void actualizarStock(Scanner scanner) {
        System.out.print("Nombre del producto a actualizar: ");
        String nombre = scanner.nextLine(); // Leer el nombre del producto a actualizar
        boolean encontrado = false; // Variable para indicar si el producto fue encontrado

        // Buscar el producto en el inventario
        for (int i = 0; i < totalProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) { // Comparar ignorando mayúsculas/minúsculas
                System.out.print("Nueva cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                scanner.nextLine(); 
                cantidades[i] = nuevaCantidad; // Actualizar la cantidad del producto
                System.out.println("Cantidad actualizada.");
                encontrado = true;
                break;
            }
        }

        // Mostrar mensaje si el producto no fue encontrado
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para calcular el valor total del inventario
    public static void calcularValorInventario() {
        double valorTotal = 0; // Variable para almacenar el valor total

        // Calcular el valor total sumando el precio por la cantidad de cada producto
        for (int i = 0; i < totalProductos; i++) {
            valorTotal += cantidades[i] * precios[i];
        }

        // Mostrar el valor total del inventario
        System.out.printf("Valor total del inventario: %.2f€\n", valorTotal);
    }
}