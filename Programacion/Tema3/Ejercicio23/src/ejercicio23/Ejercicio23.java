/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Por favor, introduce un numero.");
            num = scanner.nextInt();
            
            for(int i = 1; i<num; i++) {
                System.out.println(i);
            }
        } while(num<=1);
    }
    
}
