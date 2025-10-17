/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;

/**
 *
 * @author alumno
 */
public class Ejercicio22 {
    
    public static String ERROR = "Tipo de dato no valido. Introduce un numero.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        System.out.println("Introduce el primer numero:");
        
        try {
            num1 = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println(ERROR);
            return;
        }
        
        System.out.println("Introduce el segundo numero:");
        
        try {
            num2 = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println(ERROR);
            return;
        }
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        
        
    }
    
}
