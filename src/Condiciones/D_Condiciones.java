package Condiciones;

public class D_Condiciones {

    // 1. Verificar si un número es positivo
    public static void ejercicio1() {
        int num = 5;
        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        } else {
            System.out.println("El número " + num + " es negativo");
        }


    }

    // 2. Verificar si un número es negativo
    public static void ejercicio2() {
        int num = -5;
        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        } else {
            System.out.println("El número " + num + " es negativo");
        }

    }

    // 3. Verificar si un número es cero
    public static void ejercicio3() {
        int num = 0;
        if (num == 0) {
            System.out.println("El número " + num + " es cero");
        } else {
            System.out.println("El número " + num + " no es cero");
        }

    }

    // 4. Comprobar si un número es par
    public static void ejercicio4() {
        int num = 5;
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }

    }

    // 5. Comprobar si un número es impar
    public static void ejercicio5() {
      int num = 6;
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }

    }

    // 6. Verificar si una persona es mayor de edad
    public static void ejercicio6() {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
            System.out.println();
        }

    }

    // 7. Comparar dos números
    public static void ejercicio7() {
        int num1 = 5;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor que " + num2);
        } else {
            System.out.println("Los números son iguales");
        }

    }

    // 8. Validar si un número está en un rango
    public static void ejercicio8() {
        int num = 5;
        int min = 0;
        int max = 10;
        if (num >=min && num <= max) {
            System.out.println("El número " + num + " está en el rango");
        } else {
            System.out.println("El número " + num + " no está en el rango");
        }

    }

    // 9. Verificar si un carácter es una vocal
    public static void ejercicio9() {
        String vocal = "5";
        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
            System.out.println("El carácter " + vocal + " es una vocal");
        } else {
            System.out.println("El carácter " + vocal + " no es una vocal");
        }

    }

    // 10. Determinar si un año es bisiesto
    public static void ejercicio10() {
        int anio = 2024;
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }

    }

    // 11. Evaluar si un número es positivo, negativo o cero
    public static void ejercicio11() {
        int num = 0;
        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        } else if (num < 0) {
            System.out.println("El número " + num + " es negativo");
        } else {
            System.out.println("El número " + num + " es cero");
        }
            

    }

    // 12. Determinar si se puede acceder a un evento (mayor de edad y con entrada)
    public static void ejercicio12() {
        int edad =18;
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }

    }

    // 13. Verificar si un número es divisible entre 3 y 5
    public static void ejercicio13() {
        int num = 15;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El número " + num + " es divisible entre 3 y 5");
        } else {
            System.out.println("El número " + num + " no es divisible entre 3 y 5");
        }

    }

    // 14. Comprobar si un número no está en un rango
    public static void ejercicio14() {
        int num = 5;
        int min = 0;
        int max = 10;
        if (num < min || num > max) {
            System.out.println("El número " + num + " no está en el rango");
        } else {
            System.out.println("El número " + num + " está en el rango");
        }

    }

    // 15. Determinar el mayor de tres números
    public static void ejercicio15() {
        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número " + num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número " + num2 + " es el mayor");
        } else {
            System.out.println("El número " + num3 + " es el mayor");
        }


    }

    // 16. Verificar si una persona puede votar (edad >= 18)
    public static void ejercicio16() {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("La persona puede votar");
        } else {
            System.out.println("La persona no puede votar");
        }

    }

    // 17. Clasificar un número como positivo par, positivo impar, negativo par o negativo impar
    public static void ejercicio17() {
        int num = 5;
        if (num > 0 && num % 2 == 0) {
            System.out.println("El número " + num + " es positivo par");
        }else if (num < 0 && num % 2 !=0) {
            System.out.println("El número " + num + " es positivo impar");
        } 
        else if (num > 0 && num % 2 != 0) {
            System.out.println("El número " + num + " es negativo par");
        } else {
            System.out.println("El número " + num + " es negativo impar");
        }

    }

    // 18. Validar si una persona tiene acceso VIP (edad > 21 o paga extra)
    public static void ejercicio18() {
        int edad = 22;
        boolean pagaExtra = false;
        if (edad > 21 || pagaExtra) {
            System.out.println("La persona tiene acceso VIP");
        } else {
            System.out.println("La persona no tiene acceso VIP");
        }

    
    }

    // 19. Evaluar si dos variables booleanas son verdaderas
    public static void ejercicio19() {
        boolean var1 = true;
        boolean var2 = true;
        if (var1 && var2) {
            System.out.println("Las dos variables son verdaderas");
        } else {
            System.out.println("Al menos una de las variables es falsa");
        }

    }

    // 20. Clasificar la nota de un examen
    public static void ejercicio20() {
        int nota = 5;
        if (nota >= 0 && nota <= 5) {
            System.out.println("Muy deficiente");
        } else if (nota >= 6 && nota <= 6) {
            System.out.println("Insuficiente");
        } else if (nota >= 7 && nota <= 7) {
            System.out.println("Suficiente");
        } else if (nota >= 8 && nota <= 8) {
            System.out.println("Bien");
        } else if (nota >= 9 && nota <= 9) {
            System.out.println("Notable");
        } else if (nota >= 10 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no válida");
        }

    }

    // 21. Determinar si una letra es mayúscula
    public static void ejercicio21() {
        String letra = "A";
        if (letra.equals(letra.toUpperCase())) {
            System.out.println("La letra " + letra + " es mayúscula");
        } else {
            System.out.println("La letra " + letra + " es minúscula");
        }


    }

    // 22. Verificar si una letra es minúscula
    public static void ejercicio22() {
        String letra = "a";
        if (letra.equals(letra.toLowerCase())) {
            System.out.println("La letra " + letra + " es minúscula");
        } else {
            System.out.println("La letra " + letra + " es mayúscula");
        }

    }

    // 23. Validar si dos contraseñas son iguales
    public static void ejercicio23() {
        String paswordString1 = "1234";
        String paswordString2 = "1234";
        if (paswordString1.equals(paswordString2)) {
            System.out.println("Las contraseñas son iguales");
        } else {
            System.out.println("Las contraseñas no son iguales");
        }

    }

    // 24. Verificar si un número está dentro de varios rangos posibles
    public static void ejercicio24() {
        int num = 5;
        int min1 = 0;
        int max1 = 10;
        int min2 = 20;
        int max2 = 30;
        if ((num >= min1 && num <= max1) || (num >= min2 && num <= max2)) {
            System.out.println("El número " + num + " está en uno de los rangos");
        } else {
            System.out.println("El número " + num + " no está en ninguno de los rangos");
        }

    }
    // 25. Llamar todos los ejercicios desde un método separado
    public static void llamarEjercicios() {
        
        // Aquí puedes llamar a los ejercicios si es necesario
    }
    public static void main(String[] args) {
        // Llamar a los ejercicios
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
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        ejercicio19();
        ejercicio20();
        ejercicio21();
        ejercicio22();
        ejercicio23();
        ejercicio24();
    }
}  