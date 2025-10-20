/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int random = (int) (Math.random()* 100 + 1);
        int intentos = 0;
        int num = 0;
        
        do {
            System.out.println("Intenta adivinar un número entre 1 y 100:");
            
            try {
                num = scanner.nextInt();
            } catch (Exception e) {
                if(e instanceof InputMismatchException) {
                    System.out.println("Has introducido un tipo de dato invalido.");
                    num = 0;
                }
            }
            
            if(random < num) {
                System.out.println("El numero es menor.");
            } else if (random > num) {
                System.out.println("El numero es mayor.");
            } else if (random == num) {
                System.out.println("Has acertado!");
            }
            
            intentos++;
            
        } while(num != random);
        
        System.out.println("Has intentado adivinar " + intentos + " veces.");
    }
    
}
