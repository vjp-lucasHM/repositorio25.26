/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        
        System.out.println("Vamos a rellenar el array de " + array.length + " posiciones.");
        
        rellenarArray(array);
        mostrarArray(array);
    }
    
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++) {
            System.out.println("Introduce un valor para la posicion " + i + " del array.");
            array[i] = scanner.nextInt();
        }
    }
    
    public static void mostrarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    
}
