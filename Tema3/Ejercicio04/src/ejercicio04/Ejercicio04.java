/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int num2 = scanner.nextInt();
        
        System.out.println("Introduce el tercer numero:");
        int num3 = scanner.nextInt();
        
        int numM;
        
        if(num1 < num2 && num1 < num3) numM = num1;
        else if(num2 < num1 && num2 < num3) numM = num2;
        else numM = num3;
        
        System.out.println("El numero menor es " + numM);
    }
    
}
