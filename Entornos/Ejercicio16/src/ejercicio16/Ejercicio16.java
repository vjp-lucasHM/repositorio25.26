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
    
    String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};

    public static void main(String[] args) {
        int[][] matriz = new int[6][4];
        boolean exit = false;

        do {
            mostrarMenu();
            int opcion = pedirOpcion();

            switch (opcion) {
                case 1:
                    rellenarMatriz(matriz);
                    break;
                case 2:
                    mostrarNotas(matriz);
                    break;
                case 3:
                    hacerMejorMedia(matriz);
                    break;
                case 4:
                    getAlumnoMasSuspensos(matriz);
                    break;
                case 5:
                    sacarAsignaturaMasDificil(matriz);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
            }
        } while(!exit);
    }
    
    public static void hacerMejorMedia(int[][] matriz) {
        
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        
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
    
    public static void getAlumnoMasSuspensos(int[][] matriz) {
        int numSuspensos = -1000;
        String alumno = "";
        
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        
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
    
    public static void mostrarNotas(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("[ Alumno Numero " + (i+1) + " - Asignatura Numero " + (j+1) + " ] -> " + matriz[i][j]);
            }
        }
    }
    
    public static void sacarAsignaturaMasDificil(int[][] matriz) {
        int peorMedia = 999;
        String peor = "";
        
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        for(int i = 0; i < matriz.length; i++) {
            int suma = 0;
            
            for(int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            
            int media = suma / matriz.length;
            
            if(media < peorMedia) {
                peorMedia = (int) media;
                peor = asignaturas[i];  
            }
        }
        
        System.out.println("La asignatura con peor media es " + peor + " con una media de " + peorMedia);
    }

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

    public static void mostrarMenu() {
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar las notas introducidas en el punto anterior.");
        System.out.println("3. Que nos diga que alumno es el mejor de la clase.");
        System.out.println("4. Que nos diga el alumno con mas suspensos.");
        System.out.println("5. Que nos diga cual es la asignatura mas dificil (nota media mas baja)");
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarRandom(0, 10);
            }
        }
    }

    public static int generarRandom(int min, int max) {
        int random = (int) ((((max - min) + 1) * Math.random()) + min);
        return random;
    }

}
