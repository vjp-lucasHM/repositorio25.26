/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4;
        
        System.out.println("Por favor, introduce el primer numero:");
        num1 = scanner.nextInt();
        
        System.out.println("Por favor, introduce el segundo:");
        num2 = scanner.nextInt();
        
        System.out.println("Introduce el tercer numero:");
        num3 = scanner.nextInt();
        
        System.out.println("Por favor, introduce el cuarto numero:");
        num4 = scanner.nextInt();
        
        if(num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }
        
        if(num2 > num3) {
            int aux = num3;
            num3 = num2;
            num2 = aux;
        }
        
        if(num3 > num4) {
            int aux = num4;
            num4 = num3;
            num3 = aux;
        }
        
        System.out.println("El orden de los numeros introducidos es el siguiente: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
}
