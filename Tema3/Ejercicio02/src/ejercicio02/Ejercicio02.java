/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int num2 = scanner.nextInt();
        
        String operacion = "";
        int resultado;
        
        if(num1 > 10) {
            operacion = "producto";
            resultado = num1*num2;
        } else {
            operacion = "suma";
            resultado = num1+num2;
        }
        
        System.out.println("La operacion que se realizo es " + operacion + " y su resultado es " + resultado);
        
    }
    
}
