import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class B_BuclesArrayList {

    public static void main(String[] args) {
        // Llamadas a los métodos (puedes descomentar para probar)
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
         //ejercicio6();
        ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
    }

    public static void ejercicio1() {
        // 1. Comprobar si un array está ordenado de forma ascendente
        // El método tiene que recibir un array de int
        // devuelve true si están ordenados ascendentemente
        int[] array = {1, 2, 3, 4, 5}; 
        boolean ordenado = true;

        for (int i = 0; i < array.length - 1; i++){
            if ( array[i] > array[i + 1]) {
                ordenado = false;
                break;
            }
        }

        System.out.println("¿esta ordenado ascendentemente? " + ordenado);
        
    }



    public static void ejercicio2() {
    // 2. Comprobar si un array es palíndromo
    int[] array = {1, 2, 3, 2, 1};
    boolean palindromo = true;
    int longitud = array.length;
    for (int i = 0; i < longitud / 2; i++) {
        if (array[i] != array[longitud - 1 - i]) {
            palindromo = false;
            break;
        }
    }
    System.out.println("¿Es el array un palíndromo? " + palindromo);
    }
    
    public static void ejercicio3() {
        // 3. Buscar el valor máximo y mínimo en un array
        // No puedes utilizar los métodos de Arrays
        int[] array = {5, 2, 8, 1, 4};
        int maximo = array[0];
        int minimo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }


    // 4. Sumar dos matrices 3x3
    // Crea una matriz con la suma de ambas
    public static void ejercicio4() {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] suma = new int[3][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimir la matriz resultante
        for (int[] fila : suma) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // 5. Transponer una matriz 3x3
    // cambiar filas por columnas
    public static void ejercicio5() {
        int[][] matriz = new int[3][3];
        // Inicializar la matriz con valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * 3 + j + 1; // Ejemplo de inicialización
            }
        }
        // Imprimir la matriz original
        System.out.println("Matriz original:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        // Transponer la matriz
        int[][] transpuesta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }

    public static void ejercicio6() {
        // 6. Eliminar duplicados de un ArrayList
        // Deja solo una copia de cada valor
        // Crea un ArrayList con algunos elementos duplicados
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(10);
        lista.add(30);
        lista.add(20);
        lista.add(40);

        System.out.println("Lista original: " + lista);

        // Usar un Set para eliminar duplicados
        Set<Integer> sinDuplicados = new LinkedHashSet<>(lista);

        lista = new ArrayList<>(sinDuplicados);
        System.out.println("Lista sin duplicados: " + lista);

    }

    
        public static void ejercicio7() {
            // 7. Eliminar ceros consecutivos duplicados
            // Elimina la repetición de ceros dejando uno solo

            // Crea un ArrayList con algunos elementos duplicados
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(0);
            lista.add(0);
            lista.add(1);
            lista.add(0);
            lista.add(0);
            lista.add(2);
            lista.add(0);

            System.out.println("Lista original: " + lista);
            // Usar un Set para eliminar duplicados

            List<Integer> borrarCeros = new ArrayList<>();

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == 0) {
                    if (borrarCeros.isEmpty() || borrarCeros.get(borrarCeros.size() - 1) != 0) {
                        borrarCeros.add(0);
                    }
                } else {
                    borrarCeros.add(lista.get(i));
                }
            }
            lista = (ArrayList<Integer>) borrarCeros;
            System.out.println("Lista sin ceros consecutivos: " + lista);
        }

        public static void ejercicio8() {
        // 8. Contar elementos mayores al promedio
        // calcula el promedio de los números que hay en un array
        // muestra los números que son superiores a ese promedio

        int[] array = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        double promedio = (double) suma / array.length;
        System.out.println("Promedio: " + promedio);
        System.out.print("Números mayores al promedio: ");
        for (int num : array) {
            if (num > promedio) {
                System.out.print(num + " ");
            }
        }
    }

    public static void ejercicio9() {
        // 9. Sumar los dígitos de cada número en un ArrayList<Integer>
        // Implementa aquí tu solución
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(123);
        lista.add(456);
        lista.add(789);
        System.out.println("Lista original: " + lista);
        ArrayList<Integer> sumaDigitos = new ArrayList<>();
        for (int num : lista) {
            int suma = 0;
            while (num > 0) {
                suma += num % 10;
                num /= 10;
            }
            sumaDigitos.add(suma);
        }
        System.out.println("Suma de dígitos: " + sumaDigitos);
    }

    public static void ejercicio10() {
        // 10. Simular tablero 3x3 con letras aleatorias
        // Implementa aquí tu solución
        char[][] tablero = new char[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = (char) ('A' + Math.random() * 26);
            }
        }
        // Imprimir el tablero
        System.out.println("Tablero:");
        for (char[] fila : tablero) {
            for (char letra : fila) {
                System.out.print(letra + " ");
            }
            System.out.println();
        }
    }
}
