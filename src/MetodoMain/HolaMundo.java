package MetodoMain;
/* 
 * ====EXPLICACION====
 * Todo en Java va a necesitar un archivo con una clase.
 * El nombre del archivo es el mismo que el nombre de la clase.
 * Solo puede haber una clase pública por archivo, ya lo veremos.
 * En un proyecto, la clase principal tendrá el método main()
 * El método main siempre se escribe de la misma manera.
 * 
 * Dentro del método main() haz que el programa pueda mostrar por pantalla
 * "Hola Mundo"
 * 
 * ====RECORDATORIOS====
 * La clase necesita las palabras clave public class <nombre>
 * El scope de la clase va entre llaves {}
 * 
 * El método main requiere las palabras clave public static void <nombre>
 * Los parámetros de main son una array de String que recibe como nombre args
 * Los parámetros va entre paréntesis ()
 * El scope del método main va entre llaves {}
 */

//==================
//=    EJERCICIO   =
//==================

// Declara la clase en la siguiente línea

    // Declara el método main en la siguiente línea (ten cuidado con las llaves de la clase)
    // Una llave abre, pero la llave que cierra tiene que estar DESPUES del método main

        // Instancia para imprimir "Hola Mundo", empieza algo así como System.out.............
        // Ten cuidado con las llaves del método main, la que cierra ciene que estar después del Hola Mundo


        public class HolaMundo {
        
            public static void main(String[] args) {
                System.out.println("Hola Mundo");
            }
        
        }
        

/*
 * ==================
 * =   COMPILANDO   =
 * ==================
 * 
 * Una vez tengas preparado el ejercicio llega el momento de ver si funciona correctamente.
 * Hay que compilar.
 * IDEs como Eclipse, que conoceremos a lo largo del curso, lo hacen automáticamente.
 * Otros necesitan instrucciones desde la terminal.
 * 
 * ====TERMINAL====
 * Abre una terminal, lo mismo da que sea la interna de Visual Studio Code o externa.
 * Si abres la de VSC tienes el botón arriba, en la esquina superior derecha.
 * El botón es un cuadrado partido horizontalmente.
 * Te abrirá una partición inferior con varias opciones, selecciona la que pone terminal.
 * Necesitas navegar hasta donde esté el archivo que vas a compilar
 * 
 * ----RECORDATORIO----
 * ls --> lista de archivos que hay en el directorio en el que estoy
 * cd <nombre directorio> --> accede a la carpeta
 * cd .. --> sube de nivel, a la carpeta que se encuentra en un nivel superior
 * 
 * ====COMPILAR====
 * javac --> así llamamos a la herramienta para compilar el programa que acabamos de crear
 *           $ javac nombre_archivo.java
 * 
 * java --> así ejecutamos el programa que acabamos de crear y nos mostrará por pantalla
 *          lo que se haya habilitado para ello
 *          $ java nombre_archivo
 * 
 * ----CONSIDERACIONES----
 * Para compilar necesitas la extensión del archivo *.java
 * Si todo va bien no te mostrará ningún error.
 * Si se detectan problemas te mostrará el error en la línea correspondiente.
 * Cuando ya hayas compilado y ejecutes el programa debería salir en la terminal
 * Hola Mundo 
 */