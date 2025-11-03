/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        System.out.println("El resultado de " + num1 + " elevado a " + num2 + " es " + calcularPotencia(num1, num2));
    }
    
    public static double calcularPotencia(int num1, int num2) {
        return Math.pow(num1, num2);
    }
    
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Por favor, introduce un numero mayor a 0");
            num = scanner.nextInt();
        } while(num<=0);
        
        return num;
    }
    
}
