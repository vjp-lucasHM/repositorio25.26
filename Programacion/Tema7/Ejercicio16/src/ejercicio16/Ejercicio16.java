/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][4];
        boolean exit = false;
        
        // Creamos los vectores de asignaturas y alumnos los cuales
        // pasaremos a ciertos metodos en el menu
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};

        // Mientras el usuario no quiera salir del programa, seguiremos ejecutando
        // el programa en un bucle
        do {
            mostrarMenu();
            int opcion = pedirOpcion();

            switch (opcion) {
                case 1: // Opcion 1: rellenamos matriz
                    rellenarMatriz(matriz);
                    break;
                case 2: // Opcion 2: mostramos las notas de la matriz
                    mostrarNotas(matriz);
                    break;
                case 3: // Opcion 3: imprimo a pantalla el alumno con mejor media
                    hacerMejorMedia(matriz, alumnos);
                    break;
                case 4: // Opcion 4: imprimo a pantalla el alumno que tiene mas suspensos
                    getAlumnoMasSuspensos(matriz, alumnos);
                    break;
                case 5: //  Opcion 5: imprimo a pantalla la asignatura mas dificl (media mas baja)
                    sacarAsignaturaMasDificil(matriz, asignaturas);
                    break;
                case 6: // Opcion 6: salimos del programa
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
            }
        } while(!exit);
    }
    
    // Sacamos el alumno con la mejor media de todos 
    // con un metodo de comparacion entre todos ellos
    // Luego, imprimo a la terminal su nombre (el cual sabemos por el vector del alumnos que le hemos pasado como parametro al metodo) y media.
    public static void hacerMejorMedia(int[][] matriz, String[] alumnos) {        
        int mejorMedia = 0;
        String mejorAlumno = "";
        
        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;
            
            for(int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            
            int media = (int) suma / matriz.length;
            
            if(media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = alumnos[i];
            }
        }
        
        System.out.println("El alumno con mejor nota es " + mejorAlumno + " con una media de " + mejorMedia);
    }
    
    // Hacemos un recuento de todos los alumnos y todos los suspensos que tienen.
    // Luego hacemos una comparacion para saber cual es el alumno que mas suspensos tiene
    // Y imprimimos a pantalla su nombre (el cual sabemos por el vector de alumnos que le hemos pasado como parametro) y cantidad de suspenso
    public static void getAlumnoMasSuspensos(int[][] matriz, String[] alumnos) {
        int numSuspensos = -1000;
        String alumno = "";
        
        for(int i = 0; i < matriz.length; i++) {
            int suspensos = 0;
            
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < 5) {
                    suspensos++;
                }
            } 
            
            if(suspensos > numSuspensos) {
                numSuspensos = suspensos;
                alumno = alumnos[i];
            }
        }
        
        System.out.println("El alumno con mas suspensos es " + alumno + " con un total de " + numSuspensos + " suspensos.");
    }
    
    // Metodo basico para imprimir la matriz a la pantalla de una forma relativamente legible
    public static void mostrarNotas(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("[ Alumno Numero " + (i+1) + " - Asignatura Numero " + (j+1) + " ] -> " + matriz[i][j]);
            }
        }
    }
    
    // Hacemos un bucle anidado para sacar la media de cada asignatura y luego compararlas con el resto de medias
    // Luego, imprimo un mensaje a la terminal con el nombre de la asignatura y la media de la asignatura.
    public static void sacarAsignaturaMasDificil(int[][] matriz, String[] asignaturas) {
        int peorMedia = 999;
        String peor = "";
        
        for(int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            
            for(int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            
            int media = suma / matriz.length;
            
            if(media < peorMedia) {
                peorMedia = (int) media;
                peor = asignaturas[j];  
            }
        }
        
        System.out.println("La asignatura con peor media es " + peor + " con una media de " + peorMedia);
    }

    // Metodo usado para pedirle la opcion del menu al usuario con control de excepciones, y bucles.
    public static int pedirOpcion() {
        boolean valido = false;
        int numero = 0;

        do {
            System.out.println("Introduce una opcion valida! (1-6)");
            Scanner scanner = new Scanner(System.in);

            try {
                int aux = scanner.nextInt();

                if (aux >= 1 && aux <= 6) {
                    numero = aux;
                    valido = true;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida! (1-7)");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }

    // Metodo usado en el programa para mostrarle las opciones al usuario
    public static void mostrarMenu() {
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar las notas introducidas en el punto anterior.");
        System.out.println("3. Que nos diga que alumno es el mejor de la clase.");
        System.out.println("4. Que nos diga el alumno con mas suspensos.");
        System.out.println("5. Que nos diga cual es la asignatura mas dificil (nota media mas baja)");
    }

    // Metodo usado para rellenar la matriz con numeros del 0-10
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarRandom(0, 10);
            }
        }
    }

    // Metodo usado para generar numeros aleatorios con determinado rango
    public static int generarRandom(int min, int max) {
        int random = (int) ((((max - min) + 1) * Math.random()) + min);
        return random;
    }

}
