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

    /**
     * @param args the command line arguments
     */
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
            }
        } while(!exit);
    }
    
    public static int hacerMediaAlumnos(int[][] matriz) {
        return 0;
    }
    
    public static void mostrarNotas(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("[ Alumno Numero " + (i+1) + " - Asignatura Numero " + (j+1) + " ] -> " + matriz[i][j]);
            }
        }
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
        System.out.println("Que nos diga que alumno es el mejor de la clase.");
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
