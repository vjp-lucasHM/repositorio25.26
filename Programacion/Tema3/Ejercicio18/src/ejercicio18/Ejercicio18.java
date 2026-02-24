/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contraseña = 1234;
        int input;
        int intentos = 0;
        
        boolean correcto = false;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            if(intentos == 3) {
                System.out.println("Has alcanzado el numero máximo de intentos.");
                intentos = 0;
            }
            
            System.out.println("Por favor, introduce una contraseña:");
            input = scanner.nextInt();
            
            if(input == contraseña) {
                System.out.println("Has introducido una contraseña correcta.");
                correcto = true;
            } else {
                System.out.println("Has introducido una contraseña incorrecta. ");
                intentos++;
            }
        } while(intentos <= 3 || input != contraseña || correcto);
    }
    
}
