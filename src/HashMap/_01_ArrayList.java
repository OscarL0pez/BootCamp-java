package HashMap;

import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class _01_ArrayList {

    // Ejercicio 1: Crear un HashSet de nombres y mostrarlos uno a uno
    public static void ejercicio1() {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");

        System.out.println("Los nombres son: ");
        for (String nombre : nombres) {
            System.out.println(nombre); // Mostrar cada nombre
        }

        // Crea un HashSet de String de 5 elementos
        // Muestra los nombres uno a uno
    }

    // Ejercicio 2: Comprobar si un nombre existe en el HashSet
    public static void ejercicio2() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Alberto");

        System.out.println(nombres);

        if (nombres.contains("Alberto")) {
            System.out.println("El nombre Alberto existe en el HashSet");
        } else {
            System.out.println("El nombre Alberto no existe en el HashSet");
        }

        // Añade varios nombres al HashSet nombres
        // Comprueba si existe dentro del HashSet "Alberto"
    }

    // Ejercicio 3: Eliminar un nombre del HashSet
    public static void ejercicio3() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Alberto");
        nombres.add("Alberto"); // Los HashSet no permiten duplicados

        System.out.println("Antes de eliminar: " + nombres);

        nombres.remove("Alberto"); // Eliminar el nombre "Alberto"
        System.out.println("Después de eliminar: " + nombres);

        // Elimina un nombre del HashSet nombres
    }

    // Ejercicio 4: Ordenar alfabéticamente los nombres de un HashSet
    public static void ejercicio4() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Alberto");
        nombres.add("Fernando");

        System.out.println("Antes de ordenar: " + nombres);

        // Convertir el HashSet a un ArrayList para poder ordenarlo
        ArrayList<String> nombresList = new ArrayList<>(nombres);
        nombresList.sort(String::compareTo); // Ordenar alfabéticamente

        System.out.println("Después de ordenar: " + nombresList);

        // Ordena alfabéticamente los nombres del HashSet nombres
    }

    // Ejercicio 5: Añadir un nombre en una posición específica de un ArrayList
    public static void ejercicio5() {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Oscar");
        nombres.add("pepe");
        nombres.add("maria");
        nombres.add("Rocio");

        System.out.println("Antes: " + nombres);

        nombres.add(4, "Antonio"); // Añadir "Antonio" en la posición 4

        System.out.println("Después: " + nombres);

        // Añade en la posición 4 un nombre a nombres
    }

    // Ejercicio 6: Crear una copia de un ArrayList y comprobar que son objetos distintos
    public static void ejercicio6() {
        ArrayList<String> original = new ArrayList<>();

        original.add("Oscar");
        original.add("Ana");
        original.add("pedro");

        // Crear una copia del ArrayList original
        ArrayList<String> copia = new ArrayList<>(original);

        System.out.println("Original: " + original);
        System.out.println("Copia: " + copia);

        // Comprobar si son el mismo objeto
        if (original == copia) {
            System.out.println("Son el mismo objeto");
        } else {
            System.out.println("Son objetos distintos");
        }

        // Crea una copia de ArrayList y comprueba que son objetos distintos
    }

    // Ejercicio 7: Contar cuántas veces aparece cada nombre en un ArrayList
    public static void ejercicio7() {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("pepe");
        nombres.add("antonio");
        nombres.add("carla");
        nombres.add("pepe");

        // Usar un HashMap para contar las apariciones de cada nombre
        HashMap<String, Integer> contador = new HashMap<>();

        for (String nombre : nombres) {
            if (contador.containsKey(nombre)) {
                contador.put(nombre, contador.get(nombre) + 1); // Incrementar el contador
            } else {
                contador.put(nombre, 1); // Inicializar el contador
            }
        }

        // Mostrar cuántas veces aparece cada nombre
        for (String nombre : contador.keySet()) {
            System.out.println(nombre + " aparece " + contador.get(nombre) + " veces ");
        }

        // Comprueba cuántas veces aparece cada nombre en ArrayList
    }

    // Ejercicio 8: Invertir el orden de un ArrayList
    public static void ejercicio8() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Oscar");
        nombres.add("Pepe");
        nombres.add("Antonio");
        nombres.add("Carla");

        System.out.println("Original: " + nombres);

        // Invertir el orden del ArrayList
        Collections.reverse(nombres);

        System.out.println("Después: " + nombres);

        // Invierte el orden de ArrayList nombres
    }

    public static void main(String[] args) {
        // Llama a los ejercicios que quieras probar
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        //ejercicio5();
         ejercicio6();
        //ejercicio7();
        // ejercicio8();
    }
}