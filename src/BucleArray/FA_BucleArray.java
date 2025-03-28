package BucleArray;

/*
 * Estos ejercicios están diseñados para trabajar únicamente la creación y el acceso básico a arrays en Java,
 * sin usar estructuras más avanzadas o clases adicionales. Luego se incluyen ejercicios con métodos básicos del array.
 */

 public class FA_BucleArray {
    public static void main(String[] args) {
        // Llamar a cada método de los ejercicios
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        //ejercicio18();
        //ejercicio19();
        //ejercicio20();


    }  

    // Método separador para imprimir una línea de separación
    public static void separador() {
        System.out.println("==========================");
    }
        

     // 1. Crear un array de 5 enteros e imprimirlos uno a uno.

     public static void ejercicio1() {
        System.out.println("Ejercicio 1: Array de 5 enteros");
         int[] numeros = {1, 2, 3, 4, 5};
         for (int i = 0; i < numeros.length; i++) {
             System.out.println("Número " + (i) + ": " + numeros[i]);
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
            System.out.println("Ejercicio 7: Array de días de la semana");
            String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            for (int i = 0; i < diasSemana.length; i++) {
                if (i < 5) {
                    System.out.println("Día laborable: " + diasSemana[i]);
                }
            }
            separador();
        }       

        // 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.

        public static void ejercicio8() {
            System.out.println("Ejercicio 8: Array de 5 elementos de tipo byte");
            byte[] bytes = new byte[5];
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (10 + i * 10);
                System.out.println("Elemento " + (i + 1) + ": " + bytes[i]);
            }
            separador();
        }
        
        // 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.

        public static void ejercicio9() {
            System.out.println("Ejercicio 9: Array de 4 float");
            float[] floats = {1.5f, 2.0f, 3.5f, 4.0f};
            for (int i = 0; i < floats.length; i++) {
                if (floats[i] > 2.5) {
                    System.out.println("Número mayor a 2.5: " + floats[i]);
                }
            }
            separador();
        }
        
        // 10. Crear un array de enteros con valores negativos y contar cuántos hay.
        public static void ejercicio10() {
            System.out.println("Ejercicio 10: Array de enteros negativos");
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

        // 11. Usar length para mostrar el tamaño del array declarado en el ejercicio 10.
        
        public static void ejercicio11() {
            System.out.println("Ejercicio 11: Tamaño del array de enteros negativos");
            int[] negativos = {-1, -2, -3, -4, -5};
            System.out.println("Tamaño del array: " + negativos.length);
            separador();
        }

        // 12. Buscar un número dentro de un array usando un bucle.

        public static void ejercicio12() {
            System.out.println("Ejercicio 12: Buscar un número en un array");
            int[] numeros = {1, 2, 3, 4, 5};
            int numeroABuscar = 100;
            boolean encontrado = false;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroABuscar) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("Número " + numeroABuscar + " encontrado en el array.");
            } else {
                System.out.println("Número " + numeroABuscar + " no encontrado en el array.");
            }
            separador();
        }
        
        // 13. Encontrar el valor máximo en un array.

        public static void ejercicio13() {
            System.out.println("Ejercicio 13: Encontrar el valor máximo en un array");
            int[] numeros = {1, 2, 3, 4, 5};
            int maximo = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
            }
            System.out.println("Valor máximo en el array: " + maximo);
            separador();
        }
        
        // 14. Calcular la suma de todos los elementos de un array.

        public static void ejercicio14() {
            System.out.println("Ejercicio 14: Sumar todos los elementos de un array");
            int[] numeros = {1, 2, 3, 4, 5};
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }
            System.out.println("Suma de todos los elementos: " + suma);
            separador();
        }

        // 15. Mostrar los elementos de un array en orden inverso.
        public static void ejercicio15() {
            System.out.println("Ejercicio 15: Mostrar elementos en orden inverso");
            int[] numeros = {1, 2, 3, 4, 5};
            System.out.print("Elementos en orden inverso: ");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
            separador();
        }

        // 16. Duplicar los valores de un array en otro nuevo.

        public static void ejercicio16() {
            System.out.println("Ejercicio 16: Duplicar valores de un array");
            int[] numeros = {1, 2, 3, 4, 5};
            int[] duplicados = new int[numeros.length];
            for (int i = 0; i < numeros.length; i++) {
                duplicados[i] = numeros[i] * 2;
            }
            System.out.print("Array duplicado: ");
            for (int i = 0; i < duplicados.length; i++) {
                System.out.print(duplicados[i] + " ");
            }
            System.out.println();
            separador();
        }
        
        // 17. Comprobar si dos arrays son iguales (elemento a elemento).

        public static void ejercicio17() {
            System.out.println("Ejercicio 17: Comprobar si dos arrays son iguales");
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {1, 2, 3, 4, 5};
            boolean iguales = true;
            if (array1.length != array2.length) {
                iguales = false;
            } else {
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] != array2[i]) {
                        iguales = false;
                        break;
                    }
                }
            }
            if (iguales) {
                System.out.println("Los arrays son iguales.");
            } else {
                System.out.println("Los arrays son diferentes.");
            }
            separador();
        }
        
        // 18. Contar cuántos valores son pares en un array.

        public static void ejercicio18() {
            System.out.println("Ejercicio 18: Contar valores pares en un array");
            int[] numeros = {1, 2, 3, 4, 5, 6};
            int contadorPares = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    contadorPares++;
                }
            }
            System.out.println("Cantidad de números pares: " + contadorPares);
            separador();
        }
        
        // 19. Reemplazar todos los valores menores que 5 con un 0.

        public static void ejercicio19() {
            System.out.println("Ejercicio 19: Reemplazar valores menores que 5 con 0");
            int[] numeros = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] < 5) {
                    numeros[i] = 0;
                }
            }
            System.out.print("Array modificado: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
            separador();
        }
        

        // 20. Copiar manualmente los elementos de un array a otro.

        public static void ejercicio20() {
            System.out.println("Ejercicio 20: Copiar elementos de un array a otro");
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i];
            }
            System.out.print("Array copiado: ");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
            System.out.println();
            separador();
        }
    
}