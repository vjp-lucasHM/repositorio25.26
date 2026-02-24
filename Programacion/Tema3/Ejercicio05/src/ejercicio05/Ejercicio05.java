/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero:");
        int num = scanner.nextInt();
        
        boolean isPar = num % 2 == 0;
        
        if(isPar) System.out.println("El numero que has introducido es par");
        else System.out.println("El numero que has introducido no es par.");
    }
    
}
