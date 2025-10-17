/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce el primer numero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Por favor, introduce el segundo numero:");
        int num2 = scanner.nextInt();
        
        int resultado;
        
        try {
            resultado = num1 / num2;
            
            System.out.println("El resultado es" + resultado);
        } catch(ArithmeticException e) {
            System.out.println("Introduce un numero valido.");
        } 
    }
    
}
