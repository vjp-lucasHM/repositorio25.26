/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:");
        int numero = scanner.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " por " + i + " es igual a " + numero*i);
        }
    }
    
}
