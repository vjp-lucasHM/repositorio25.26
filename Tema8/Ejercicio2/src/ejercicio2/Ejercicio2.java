/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[pedirOpcion()];
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*6);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        for(int num : vector) {
            System.out.println(num);
        }
    }
    
    public static int pedirOpcion() {
        boolean valido = false;
        int numero = 0;

        do {
            System.out.println("Introduce una opcion valida!");
            Scanner scanner = new Scanner(System.in);

            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida!");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }
    
}
