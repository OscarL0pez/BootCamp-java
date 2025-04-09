package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class _02_HashSet {

    // Declaración de un HashSet global llamado frutas
    static HashSet<String> frutas = new HashSet<>();
    
    public static void main(String[] args) {

        // 1. Agregar frutas a un HashSet y mostrarlas
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("naranja");
        frutas.add("kiwi");
        frutas.add("sandía");
        frutas.add("mango");
        frutas.add("mora");
        frutas.add("frambuesa");

        // Mostrar las frutas añadidas
        System.out.println("Frutas en el HashSet: " + frutas);

        // 2. Comprobar existencia de un elemento dentro de frutas
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una fruta para comprobar si existe:");
        String fruta = sc.nextLine();
        if (frutas.contains(fruta)) {
            System.out.println("La fruta " + fruta + " existe en el HashSet.");
        } else {
            System.out.println("La fruta " + fruta + " no existe en el HashSet.");
        }

        // 3. Eliminar un elemento de frutas
        System.out.println("Introduce una fruta para eliminar:");
        String frutaEliminar = sc.nextLine();
        if (frutas.remove(frutaEliminar)) {
            System.out.println("La fruta " + frutaEliminar + " ha sido eliminada del HashSet.");
        } else {
            System.out.println("La fruta " + frutaEliminar + " no existe en el HashSet.");
        }

        // 4. Comprobar el tamaño del HashSet frutas
        System.out.println("El tamaño del HashSet frutas es: " + frutas.size());

        // 5. Limpiar el HashSet frutas
        frutas.clear();
        System.out.println("El HashSet frutas ha sido limpiado.");

        // 5. Crear un HashSet nuevo llamado frutas2
        HashSet<String> frutas2 = new HashSet<>();
        frutas2.add("mora");
        frutas2.add("frambuesa");
        frutas2.add("sandía");
        frutas2.add("kiwi");
        frutas2.add("mango");

        // Crear un HashSet nuevo llamado union que contenga los elementos de frutas y frutas2
        HashSet<String> union = new HashSet<>(frutas);
        union.addAll(frutas2); // Unir ambos conjuntos
        System.out.println("Unión de frutas y frutas2: " + union);

        // 6. Intersección de conjuntos entre frutas y frutas2
        HashSet<String> interseccion = new HashSet<>(frutas);
        interseccion.retainAll(frutas2); // Retener solo los elementos comunes
        System.out.println("Intersección de frutas y frutas2: " + interseccion);

        // 7. Diferencia entre conjuntos entre frutas y frutas2
        HashSet<String> diferencia = new HashSet<>(frutas);
        diferencia.removeAll(frutas2); // Eliminar los elementos de frutas2
        System.out.println("Diferencia entre frutas y frutas2: " + diferencia);

        // 8. Convertir a ArrayList y ordenar
        ArrayList<String> listaFrutas = new ArrayList<>(frutas);
        Collections.sort(listaFrutas); // Ordenar alfabéticamente
        System.out.println("Frutas ordenadas: " + listaFrutas);

        // 9. Eliminar elementos con condición (longitud < 6)
        listaFrutas.removeIf(f -> f.length() < 6); // Eliminar frutas con longitud menor a 6
        System.out.println("Frutas después de eliminar las de longitud < 6: " + listaFrutas);

        sc.close(); // Cerrar el Scanner
    }
}