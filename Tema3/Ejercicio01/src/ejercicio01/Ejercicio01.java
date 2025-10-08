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
        
        System.out.println("Por favor, introduce un numero:");
        int numero = scanner.nextInt();
        
        String posOrNeg;
        
        if(numero < 0)  {
            posOrNeg = "negativo"; // si el numero es menor que 0, es negativo
        } else {
            posOrNeg = "positivo"; // si el numero es mayor que 0, es positivo
        }
        
        System.out.println("El numero introducido es " + posOrNeg + ".");
    }
    
}
