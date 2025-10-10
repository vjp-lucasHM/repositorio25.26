/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        do {
            System.out.println("Introduce el numero del que quieres calcular la raiz:");
            numero = scanner.nextInt();
        
            System.out.println("Debes introducir un número positivo");
        } while(numero < 0);
        
        System.out.println("La raiz de " + numero + " es: " + Math.sqrt(numero));
    }
    
}
