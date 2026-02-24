/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        do {
            System.out.println("Por favor, introduce un numero mayor a 0");
            num = scanner.nextInt();
        } while(num <= 0);
        
        for(int i = 1; i <= num; i++) {
            if(i % 3 == 0) System.out.println(i);
        }
    }
    
}
