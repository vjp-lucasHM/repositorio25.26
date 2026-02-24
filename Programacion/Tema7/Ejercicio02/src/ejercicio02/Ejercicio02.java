/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[7];
        
        rellenarArray(numeros);
        mostrarArray(numeros);
        
        System.out.println();
        intercambiarValoresArray(numeros);
        mostrarArray(numeros);
        
    }
    
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vamos a rellenar un array de " + array.length + " posiciones.");
        
        for(int i = 0; i < array.length; i++) {
            System.out.println("Introduce un valor para la posicion " + i + " del array.");
            array[i] = scanner.nextInt();
        }
    }
    
    public static void intercambiarValoresArray(int[] array) {
        int aux;
        
        aux = array[1];
        array[1] = array[3];
        array[3] = aux;
    }
    
    public static void mostrarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
