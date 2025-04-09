package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class _03_HashMap {
    // Declaración de un HashMap global llamado diccionario
    static HashMap<String, String> diccionario = new HashMap<>();

    public static void main(String[] args) {
        // 1. Crear un diccionario y añadir pares clave-valor
        diccionario.put("manzana", "fruta roja");
        diccionario.put("pera", "fruta verde");
        diccionario.put("naranja", "fruta naranja");
        diccionario.put("kiwi", "fruta marrón");
        diccionario.put("sandía", "fruta grande");
        diccionario.put("mango", "fruta amarilla");
        diccionario.put("mora", "fruta morada");
        diccionario.put("frambuesa", "fruta roja");
        diccionario.put("uva", "fruta pequeña");

        // Llamar a los ejercicios
        // ejercicio1();
        ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
    }

    public static void ejercicio1() {
        // Mostrar la lista completa de claves y valores
        System.out.println("Diccionario completo:");
        diccionario.forEach((clave, valor) -> System.out.println(clave + ": " + valor));

        // Consultar y modificar un valor
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave que quieres consultar:");
        String clave = sc.nextLine();
        String valor = diccionario.get(clave);
        if (valor != null) {
            System.out.println("El valor de " + clave + " es: " + valor);
        } else {
            System.out.println("La clave " + clave + " no existe en el diccionario.");
        }

        // Modificar el valor
        System.out.println("Introduce el nuevo valor para " + clave + ":");
        String nuevoValor = sc.nextLine();
        diccionario.put(clave, nuevoValor);
        System.out.println("El valor de " + clave + " ha sido modificado a: " + nuevoValor);

        // Mostrar la lista completa de claves y valores después de la modificación
        System.out.println("Diccionario completo después de la modificación:");
        diccionario.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void ejercicio2() {
        // 2. Comprobar existencia de clave o valor
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave que quieres comprobar:");
        String clave = sc.nextLine();
        if (diccionario.containsKey(clave)) {
            System.out.println("La clave " + clave + " existe en el diccionario.");
        } else {
            System.out.println("La clave " + clave + " no existe en el diccionario.");
        }

        // Comprobar existencia de un valor
        System.out.println("Introduce el valor que quieres comprobar:");
        String valor = sc.nextLine();
        if (diccionario.containsValue(valor)) {
            System.out.println("El valor " + valor + " existe en el diccionario.");
        } else {
            System.out.println("El valor " + valor + " no existe en el diccionario.");
        }
    }

    public static void ejercicio3() {
        // 3. Consultar un valor
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave que quieres consultar:");
        String clave = sc.nextLine();
        String valor = diccionario.get(clave);
        if (valor != null) {
            System.out.println("El valor de " + clave + " es: " + valor);
        } else {
            System.out.println("La clave " + clave + " no existe en el diccionario.");
        }
    }

    public static void ejercicio4() {
        // 4. Eliminar una entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave que quieres eliminar:");
        String clave = sc.nextLine();
        if (diccionario.remove(clave) != null) {
            System.out.println("La clave " + clave + " ha sido eliminada del diccionario.");
        } else {
            System.out.println("La clave " + clave + " no existe en el diccionario.");
        }
    }

    public static void ejercicio5() {
        // 5. Mostrar todas las claves y los valores
        System.out.println("Diccionario completo:");
        diccionario.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }

    public static void ejercicio6() {
        // 6. Contar caracteres en una frase
        String frase = "me estoy peleando con HashMap";
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (c != ' ') {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " caracteres (sin contar espacios).");
    }

    public static void ejercicio7() {
        // 7. Agrupar nombres por inicial
        String[] listaNombres = {"Ana", "Andrés", "Bea", "Carlos", "Carmen"};
        HashMap<Character, HashMap<String, String>> agrupados = new HashMap<>();
        for (String nombre : listaNombres) {
            char inicial = nombre.charAt(0);
            agrupados.putIfAbsent(inicial, new HashMap<>());
            agrupados.get(inicial).put(nombre, nombre);
        }
        System.out.println("Nombres agrupados por inicial:");
        agrupados.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void ejercicio8() {
        // 8. Invertir un HashMap (valores únicos)
        HashMap<String, String> original = new HashMap<>();
        original.put("manzana", "fruta roja");
        original.put("pera", "fruta verde");
        original.put("naranja", "fruta naranja");
        HashMap<String, String> invertido = new HashMap<>();
        for (String clave : original.keySet()) {
            invertido.put(original.get(clave), clave);
        }
        System.out.println("HashMap invertido:");
        invertido.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void ejercicio9() {
        // 9. HashMap con claves nombres y anidaciones
        // Cada clave es un nombre, y el valor es otro HashMap con "tlfn" y "email"
        HashMap<String, HashMap<String, String>> agenda = new HashMap<>();
        HashMap<String, String> contacto1 = new HashMap<>();
        contacto1.put("tlfn", "123456789");
        contacto1.put("email", "ana@example.com");
        agenda.put("Ana", contacto1);

        HashMap<String, String> contacto2 = new HashMap<>();
        contacto2.put("tlfn", "987654321");
        contacto2.put("email", "carlos@example.com");
        agenda.put("Carlos", contacto2);

        System.out.println("Agenda:");
        agenda.forEach((nombre, datos) -> {
            System.out.println(nombre + " -> Teléfono: " + datos.get("tlfn") + ", Email: " + datos.get("email"));
        });
    }

    // 10. Agenda simple con búsqueda
    public static void ejercicio10() {
        // Implementar una agenda con búsqueda de contactos
    }
}