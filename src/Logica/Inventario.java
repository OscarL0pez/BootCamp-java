package Logica;

import java.util.Scanner;

public class Inventario {

    static final int MAX_PRODUCTOS = 10;
    static String[] nombres = new String[MAX_PRODUCTOS];
    static int[] cantidades = new int[MAX_PRODUCTOS];
    static double[] precios = new double[MAX_PRODUCTOS];
    static int totalProductos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    añadirProducto(scanner);
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    buscarProducto(scanner);
                    break;
                case 4:
                    actualizarStock(scanner);
                    break;
                case 5:
                    calcularValorInventario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

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

    public static void añadirProducto(Scanner scanner) {
        if (totalProductos >= MAX_PRODUCTOS) {
            System.out.println("El inventario está lleno. No puedes añadir más productos.");
            return;
        }

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer

        nombres[totalProductos] = nombre;
        cantidades[totalProductos] = cantidad;
        precios[totalProductos] = precio;

        totalProductos++;
        System.out.println("Producto añadido correctamente.");
    }

    public static void mostrarProductos() {
        if (totalProductos == 0) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (int i = 0; i < totalProductos; i++) {
            System.out.printf("%d. %s | Cantidad: %d | Precio: %.2f€\n",
                    (i + 1), nombres[i], cantidades[i], precios[i]);
        }
    }

    public static void buscarProducto(Scanner scanner) {
        System.out.print("Nombre del producto a buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < totalProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.printf("Producto encontrado: %s | Cantidad: %d | Precio: %.2f€\n",
                        nombres[i], cantidades[i], precios[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void actualizarStock(Scanner scanner) {
        System.out.print("Nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < totalProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                System.out.print("Nueva cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
                cantidades[i] = nuevaCantidad;
                System.out.println("Cantidad actualizada.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void calcularValorInventario() {
        double valorTotal = 0;

        for (int i = 0; i < totalProductos; i++) {
            valorTotal += cantidades[i] * precios[i];
        }

        System.out.printf("Valor total del inventario: %.2f€\n", valorTotal);
    }
}
