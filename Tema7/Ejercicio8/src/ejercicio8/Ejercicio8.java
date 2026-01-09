/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = dividirEnCifras(pedirNumero());
        mostrarArray(arr);
    }
    
    public static int pedirNumero() {
        int toReturn = 0;
        boolean valido = false;
        
        do {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Introduce un numero de 5 cifras (10000-99999)");
            
            try {
                if(scanner.nextInt() >= 10000 && scanner.nextInt() <= 99999) {
                    toReturn = scanner.nextInt();
                    valido = true;
                } else {
                    System.out.println("Introduce un numero valido! (10000-99999)");
                }
            } catch(InputMismatchException ex) {
                System.out.println("Introduce un numero valido! (10000-99999)");
            }
        } while(!valido);
        
        return toReturn;
    }
    
    public static int[] dividirEnCifras(int numero) {
        int[] array = new int[5];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = numero % 10;
            numero /= 10;
        }

        return array;
    }
    
    public static void mostrarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
