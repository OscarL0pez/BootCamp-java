
import java.util.Scanner;

public class B_Bucles {
    public static void ejercicio1() {
        // suma todos los elementos de un array
        int[] numeros = {3, 5, 7, 2, 8};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma es: " + suma);
    }
        
        
        
    
    public static void ejercicio2() {
        // muestra los valores de un array bidimensional
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(); // salto de linea al terminar cada fila
        }
    }


    public static void ejercicio3() {
        // muestra cuántos elementos pares hay en un array
        int[] datos = {1, 4, 6, 9, 12, 15, 18};
        int pares = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                pares++;
            }
            
            
        }

        System.out.println("hay " + pares + " numero pares");

    }



    public static void ejercicio4() {
        // calcula la suma de cada fila de una matriz
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i <numeros.length; i ++) {
            int suma = 0;

            for (int j = 0; j <numeros.length; j++) {
                
                    suma += numeros[i][j];

                }
                System.out.println("suma de la fila " + i + ": " + suma);
            }
            
        }
        

    public static void ejercicio5() {
        // pide al usuario un número e indica
        // si está dentro de una matriz de 3x3
        // si está muestra su posición (fila y columna)
        int[][] matriz = {
            {5, 8, 3},
            {7, 2, 9},
            {1, 6, 4}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println(" introduce un numero: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == numero) {
                    System.out.println("el numero" + numero + " está en la fila " + i + ", columna " + j + ".");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }

        if (!encontrado) {
            System.out.println("el numero " + numero + " no se encuentra en la matriz");
        }

        scanner.close();
        
    }


    public static void ejercicio6() {
        // crea una matriz de 4x4 con bucles anidados
        // en la diagonal principal tiene 1, el resto 0
        int [][] matriz = new int [4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println(); 
        }
        
    }

    public static void ejercicio7() {
        // reemplaza los valores negativos por 0
        int[] valores = {4, -3, 5, -1, 0, 6, -7};
        System.out.println("Array original");
        for (int valor : valores) {
            System.out.print(valor + " ");

        }

        for (int i = 0; i < valores.length; i ++){
            if (valores[i] < 0){
                valores[i] = 0;
            }
        }
        System.out.println("\nArray Modificado:");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }



    }

    public static void ejercicio8() {
        // imprime los elementos de esta matriz
        // como si fuera una tabla, separados por espacio
        int[][] tabla = {
            {10, 20, 30, 40},
            {50, 60, 70, 80}
        };

        for (int i = 0; i < tabla.length; i ++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
        System.out.println();
        
    }

    public static void ejercicio9() {
        // invierte el orden de los números del array
        // no puedes utilizar otro array
        int[] original = {1, 2, 3, 4, 5};
        
        System.out.println("Array original");
        for (int num : original) {
            System.out.print(num + " ");
            
        }
        //invertir un array sin usar otro arry

        int n = original.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = original[i];
            original[i] = original[n - 1 - i];
            original[n -1 -i] = temp;
        }
        System.out.println("\nArray invertido");
        for (int num : original) {
            System.out.println(num + " ");
        }
        System.out.println();

            
    }

    public static void ejercicio10() {
        // cuántas veces aparece un número en una matriz
        int[][] matriz = {
            {1,3,5},
            {8,5,2},
            {5,5,3}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero a buscar: ");
        int numero = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == numero) {
                    contador++;
                }
            }
        }
        System.out.println("el numero " + numero + " aparece " + contador + " veces");

        scanner.close();


    }

    public static void main(String[] args) {
        ejercicio10();;
    
    }
    
}
