/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es primo:");
        int numero = scanner.nextInt();
        
        if(esPrimo(numero)) {
            System.out.println("Tu numero es primo.");
        } else {
            System.out.println("Tu numero no es primo.");
        }
    }
    
    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        int i = 2;
        
        while(i < numero && esPrimo) {
            esPrimo = false;
        }
        
        return esPrimo;
    }
    
}
