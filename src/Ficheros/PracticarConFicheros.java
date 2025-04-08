package Ficheros;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class PracticarConFicheros {

    // Ejercicio 1: Crear archivo con saludo personalizado
    // Debe indicar si el archivo se ha creado o no.
    // Ejemplo: Hola NOMBRE. Bienvenido.
    @SuppressWarnings("ConvertToTryWithResources")
    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        String contenido = "Hola " + nombre + ". Bienvenido.";

        try {
            FileWriter escritor = new FileWriter("saludo.txt");
            escritor.write(contenido);
            escritor.close(); // Muy importante cerrar el archivo
            System.out.println("Archivo creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        scanner.close(); // También importante cerrar Scanner
    }



    

    // Ejercicio 2: Añadir líneas a un diario personal
    // Recuerda que no quieres reescribir el archivo. (true...)
    public static void ejercicio2() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Escribe una nueva entrada para tu diario: ");
            String entrada = scanner.nextLine();
            try {
                try (FileWriter escritor = new FileWriter("diario.txt", true)) {
                    escritor.write(entrada + "\n");
                }
                System.out.println("Entrada añadida al diario con exito.");
                
            } catch (IOException e ) {
                System.out.println("error al escribir en el diario: " + e.getMessage());
            }
        }
    }


        


    // Ejercicio 3: Eliminar archivo de prueba
    // Crea un archivo que se llame borrar.txt que contenga al menos una frase de texto
    // Elimina el archivo que acabas de crear.
    public static void ejercicio3() {
        String nombreArchivo = "borrar.txt";

        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write("Este es un archivo de prueba.\nSerá eliminado justo despues de ser creado.");
            System.out.println("archivo creado con éxito");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        //eliminar el archivo
        File archivo = new File(nombreArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudeo eliminar el archivo");

        }
    }    

    

    // Ejercicio 4: Menú interactivo para manejar ficheros
    /*
    Mostrar un menú con las opciones:
        1.Crear archivo
        2.Escribir texto
        3.Añadir más texto
        4.Ver contenido
        5.Eliminar archivo
    Usar switch y try-catch para manejar errores.
    En la opción 1: simplemente crea el archivo.
    En la opción 2: escribe texto en él.
    En la opción 3: cuidado, no quieres reescribir el archivo, quieres añadir texto.
    En la opción 4: lectura de archivo (hasNextLine...)
    En la opción 5: eliminar archivo. 
    */
    public static void ejercicio4() {
        try (Scanner scanner = new Scanner(System.in)) {
            File archivo = new File("archivo.txt");

            System.out.println("1. Crear archivo");
            System.out.println("2. Escribir texto");
            System.out.println("3. Añadir texto");
            System.out.println("4. Ver contenido");
            System.out.println("5. Eliminar archivo");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            try {
                switch (opcion) {
                    case 1 -> {
                        archivo.createNewFile();
                        System.out.println("Archivo creado (o ya existía).");
                    }

                    case 2 -> {
                        System.out.print("Texto a escribir: ");
                        String texto1 = scanner.nextLine();
                        new FileWriter(archivo).write(texto1 + "\n");
                        System.out.println("Texto escrito.");
                    }

                    case 3 -> {
                        System.out.print("Texto a añadir: ");
                        String texto2 = scanner.nextLine();
                        new FileWriter(archivo, true).write(texto2 + "\n");
                        System.out.println("Texto añadido.");
                    }

                    case 4 -> {
                        try (Scanner lector = new Scanner(archivo)) {
                            while (lector.hasNextLine()) {
                                System.out.println(lector.nextLine());
                            }
                        }
                    }


                    case 5 -> {
                        if (archivo.delete()) {
                            System.out.println("Archivo eliminado.");
                        } else {
                            System.out.println("No se pudo eliminar.");
                        }
                    }

                    default -> System.out.println("Opción no válida.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            scanner.close();
        }
    }


    // Ejercicio 5: Copiar contenido de un archivo a otro
    public static void ejercicio5() throws IOException {
        String origen = "origen.txt";
        String destino = "copia.txt";

        try (
            Scanner lector = new Scanner(new File(origen));
            FileWriter escritor = new FileWriter(destino);

        ) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                escritor.write(linea + "\n");
            }
            System.out.println("Contenido copiado correctamente de " + origen + " a " + destino + " . ");
        } catch (IOException e) {
            System.out.println("Error al copiar el contenido: " + e.getMessage());
        }

    }

    // Ejercicio 6: Crear archivo con varios nombres (nombre1, nombre2, nombre3)
    public static void ejercicio6() {
        String[] nombres = {"Juan", "Lucía", "Carlos", "María", "Óscar"};

        try (FileWriter escritor = new FileWriter("nombres.txt")) {
            for (String nombre : nombres) {
                escritor.write(nombre + "\n");
            }
            System.out.println("Archivo 'nombres.txt' creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        /////// CREAR VARIOS TXT POR GRUPOS

        String[][] grupos = {
            {"Ana", "Luis", "Carlos"}, // GRUPO 1
            {"María", "Óscar", "Lucía"}, // GRUPO 2 
            {"Pedro", "Elena", "Javi"}  // GRUPO 3
        };

        for (int i = 0; i < grupos.length; i++) {
            String nombreArchivo = "grupo" + (i + 1) + ".txt";

            try (FileWriter escritor = new FileWriter(nombreArchivo)) {
                for (String nombre : grupos[i]) {
                    escritor.write(nombre + "\n");
                }
                System.out.println("Archivo '" + nombreArchivo + "' creado con éxito.");
            } catch (IOException e) {
                System.out.println("Error al crear " + nombreArchivo + ": " + e.getMessage());
            }
        }

    }


    // Ejercicio 7: Leer archivo línea por línea con número de línea
    // ejemplo: Linea X: texto_de_la_línea
    public static void ejercicio7() {
        File archivo = new File("archivo.txt");

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (Scanner lector = new Scanner(archivo)) {
            int numLinea = 1;

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("Línea " + numLinea + ": " + linea);
                numLinea++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
        



    

    // Ejercicio 8: Borrar contenido del archivo pero sin eliminar el archivo
    public static void ejercicio8() {
        String nombreArchivo = "archivo.txt";

        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            // Sobrescribir el archivo con una cadena vacía
            escritor.write("");
            System.out.println("Contenido del archivo borrado.");
        } catch (IOException e) {
            System.out.println("Error al borrar el contenido: " + e.getMessage());
        }

    }

    // Ejercicio 9: Contador de líneas
    public static void ejercicio9() {
        File archivo = new File("archivo.txt");

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (Scanner lector = new Scanner(archivo)) {
            int contadorLineas = 0;

            while (lector.hasNextLine()) {
                lector.nextLine();
                contadorLineas++;
            }
            System.out.println("El archivo tiene " + contadorLineas + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al contar las líneas: " + e.getMessage());
        }
    }

    // Método principal para probar ejercicios
    public static void main(String[] args) throws IOException {
        // Llama aquí al ejercicio que quieras probar
        ejercicio6();
       

    }
}
