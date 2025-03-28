package BucleArray;

public class E_Array {

    public static void main(String[] args) {
        // Llamar a cada método de los ejercicios
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // 1. Crear un array de 5 enteros e imprimirlos uno a uno.
    public static void ejercicio1() {
        System.out.println("Ejercicio 1: Array de 5 enteros");
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
        separador();
    }

    // 2. Crear un array de 3 Strings con nombres e imprimirlos.
    public static void ejercicio2() {
        System.out.println("Ejercicio 2: Array de 3 Strings");
        String[] nombres = {"Juan", "María", "Pedro"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
        }
        separador();
    }

    // 3. Crear un array de 4 booleanos con valores alternos y mostrarlos.
    public static void ejercicio3() {
        System.out.println("Ejercicio 3: Array de 4 booleanos");
        boolean[] booleanos = {true, false, true, false};
        for (int i = 0; i < booleanos.length; i++) {
            System.out.println("Booleano " + (i + 1) + ": " + booleanos[i]);
        }
        separador();
    }

    // 4. Crear un array de caracteres que contenga las vocales.
    public static void ejercicio4() {
        System.out.println("Ejercicio 4: Array de vocales");
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vocales.length; i++) {
            System.out.println("Vocal " + (i + 1) + ": " + vocales[i]);
        }
        separador();
    }

    // 5. Crear un array de 10 enteros sin inicializar, asignar los valores del 1 al 10 y mostrarlos.
    public static void ejercicio5() {
        System.out.println("Ejercicio 5: Array de 10 enteros");
        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
            System.out.println("Entero " + (i + 1) + ": " + enteros[i]);
        }
        separador();
    }

    // 6. Crear un array de 6 números dobles e imprimir el doble de cada valor.
    public static void ejercicio6() {
        System.out.println("Ejercicio 6: Array de 6 números dobles");
        double[] numerosDobles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        for (int i = 0; i < numerosDobles.length; i++) {
            System.out.println("Doble de " + numerosDobles[i] + ": " + (numerosDobles[i] * 2));
        }
        separador();
    }

    // 7. Crear un array con los días de la semana e imprimir solo los días laborables.
    public static void ejercicio7() {
        System.out.println("Ejercicio 7: Días laborables");
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < diasSemana.length; i++) {
            if (i < 5) { // Días laborables
                System.out.println("Día laborable " + (i + 1) + ": " + diasSemana[i]);
            }
        }
        separador();
    }

    // 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.
    public static void ejercicio8() {
        System.out.println("Ejercicio 8: Array de bytes");
        byte[] bytes = {10, 20, 30, 40, 50};
        for (int i = 0; i < bytes.length; i++) {
            System.out.println("Byte " + (i + 1) + ": " + bytes[i]);
        }
        separador();
    }

    // 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.
    public static void ejercicio9() {
        System.out.println("Ejercicio 9: Array de floats mayores a 2.5");
        float[] flotantes = {1.1f, 2.2f, 3.3f, 4.4f};
        for (int i = 0; i < flotantes.length; i++) {
            if (flotantes[i] > 2.5f) {
                System.out.println("Flotante mayor a 2.5: " + flotantes[i]);
            }
        }
        separador();
    }

    // 10. Crear un array de enteros con valores negativos y contar cuántos hay.
    public static void ejercicio10() {
        System.out.println("Ejercicio 10: Contar números negativos");
        int[] negativos = {-1, -2, -3, -4, -5};
        int contadorNegativos = 0;
        for (int i = 0; i < negativos.length; i++) {
            if (negativos[i] < 0) {
                contadorNegativos++;
            }
        }
        System.out.println("Cantidad de números negativos: " + contadorNegativos);
        separador();
    }

    // Método para imprimir un separador entre ejercicios
    private static void separador() {
        System.out.println("========================================");
    }
}