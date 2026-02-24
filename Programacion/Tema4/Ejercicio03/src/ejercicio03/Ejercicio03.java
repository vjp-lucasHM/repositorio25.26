/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import ejercicio03.mayoromenor.MayorOMenor;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un primer numero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Por favor, introduce un segundo numero:");
        int num2 = scanner.nextInt();
        
        System.out.println("Por favor, introduce un tercer numero:");
        int num3 = scanner.nextInt();
        
        MayorOMenor.elegirNumeroMayor(num1, num2, num3);
    }
    
}
