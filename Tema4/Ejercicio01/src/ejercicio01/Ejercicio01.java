/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero.");
        int numero = scanner.nextInt();
        
        positivoOrNegativo(numero);
    }
    
    public static void positivoOrNegativo(int numero) {
        if(numero >= 0) { 
            System.out.println("El numero " + numero + " es positivo.");
        } else {
            System.out.println("El numero " + numero + " es negativo.");
        }
    }
    
}
