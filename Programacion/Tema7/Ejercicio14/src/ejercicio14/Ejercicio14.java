/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        int[][] matriz = new int[4][7];

        do {
            mostrarMenu();
            int opcion = pedirOpcion();

            switch (opcion) {
                case 1:
                    rellenarMatriz(matriz);
                    break;
                case 2:
                    mostrarTemperaturas(matriz);
                    break;
                case 3:
                    temperaturaMedia(matriz);
                    break;
                case 4:
                    diasMasCalurosos(matriz);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarRandom(-5, 40);
            }
        }
    }

    public static void mostrarTemperaturas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[Semana " + (i + 1) + " Día " + (j + 1) + "] -> " + matriz[i][j] + "ºC");
            }
        }
    }

    public static void temperaturaMedia(int[][] matriz) {
        int media = 0;

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            media = suma / matriz.length;
        }

        System.out.println("La temperatura media del mes es " + media);
    }

    public static void diasMasCalurosos(int[][] matriz) {
        int max = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        
        System.out.println("La temperatura mas calurosa del mes han sido " + max + " grados.");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == max) {
                    System.out.println("Fila " + i + ", Columna " + j);
                }
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualiza la temperatura media del mes");
        System.out.println("4. Día o días mas calurosos del mes");
        System.out.println("5. Salir del programa");
    }

    public static int pedirOpcion() {
        boolean valido = false;
        int numero = 0;

        do {
            System.out.println("Introduce una opcion valida! (1-5)");
            Scanner scanner = new Scanner(System.in);

            try {
                int aux = scanner.nextInt();

                if (aux >= 1 && aux <= 7) {
                    numero = aux;
                    valido = true;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida! (1-5)");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }

    public static int generarRandom(int min, int max) {
        int random = (int) ((((max - min) + 1) * Math.random()) + min);
        return random;
    }

}
