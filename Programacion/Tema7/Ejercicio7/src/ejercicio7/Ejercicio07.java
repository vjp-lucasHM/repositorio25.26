/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Arrays;

/**
 *
 * @author tumba
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[15];
        
        for(int i = 0; i < numeros.length; i++) {
            int random = (int) (((50-1)+1)*Math.random()) + 1;
            numeros[i] = random;
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Numeros generados:");
        for(int num : numeros) {
            System.out.println(num + " ");
        }
        
        System.out.println("\n\nLos 10 mayores:");
        for (int i = numeros.length - 1; i >= numeros.length - 10; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    
}
