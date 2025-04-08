package src.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
public class _01_ArrayList {
    public static ArrayList<String> nombres = new ArrayList<>();

    public static void ejercicio1() {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");

        System.out.println("Los nombres son: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
                //Crea un ArrayList de String de 5 elementos
             //Muéstralos 1 a 1
        }


    public static void ejercicio2() {

        HashSet<String> nombres = new HashSet<>();
        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Alberto");

        System.out.println(nombres);
        

        if (nombres.contains("Alberto")) {
            System.out.println("El nombre Alberto existe en el ArrayList");
        } else {
            System.out.println("El nombre Alberto no existe en el ArrayList");
        }


        //Añade varios nombres al array nombres.
        //Comprueba si existe dentro del ArrayList "Alberto".
    }

    public static void ejercicio3() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Alberto");
        nombres.add("Alberto");

        System.out.println("antes de eliminar: " + nombres);

        nombres.remove("Alberto");
        System.out.println("después de eliminar: " + nombres);

        //Elimina un nombre del ArrayList nombres
    }

    public static void ejercicio4() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Cristian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Alberto");
        nombres.add("Fernando");

        System.out.println("antes de ordenar: " + nombres);
        ArrayList<String> nombresList = new ArrayList<>(nombres);
        nombresList.sort(String::compareTo);

        System.out.println("después de ordenar: " + nombres);
        //Ordena alfabéticamente los nombres del ArrayList nombres
    }

    public static void ejercicio5() {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Oscar");
        nombres.add("pepe");
        nombres.add("maria");
        nombres.add("Rocio");
      

        System.out.println("antes: " + nombres);

        nombres.add(4, "Antonio");

        System.out.println("Despues: " + nombres);

        //Añade en la posición 4 un nombre a nombres.

    }

    public static void ejercicio6() {

        ArrayList<String> original = new ArrayList<>();

        original.add("Oscar");
        original.add("Ana");
        original.add("pedro");

        ArrayList<String> copia = new ArrayList<>(original);

        System.out.println("original: " + original);
        System.out.println("copia: " + copia);

        if (original == copia) {
            System.out.println("son el mismo objeto");
        }else{
            System.out.println("son objetos distinto");
        }
    }

        //Crea una copia de ArrayList y comprueba que son objetos distintos.


    public static void ejercicio7() {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("pepe");
        nombres.add("antonio");
        nombres.add("carla");
        nombres.add("pepe");

        HashMap<String, Integer> contador = new HashMap<>();

        for (String nombre : nombres) {
            if (contador.containsKey(nombre)) {
                contador.put(nombre, contador.get(nombre) + 1);
            }else{
                contador.put(nombre, 1);
            }
        }

            for (String nombre : contador.keySet()) {
                System.out.println(nombre + " aparece " + contador.get(nombre) + " veces ");
            }
    }


        //Comprueba cuántas veces aparece cada nombre en ArrayList
    

    public static void ejercicio8() {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Oscar");
        nombres.add("Pepe");
        nombres.add("Antonio");
        nombres.add("Carla");

        System.out.println("original: " + nombres);

        Collections.reverse(nombres);

        System.out.println("después: " + nombres);



        //Invierte el orden de ArrayList nombres
    }

    public static void main(String[] args) {
        
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
        //ejercicio8();
    }

}
