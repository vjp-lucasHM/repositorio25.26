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
        
        System.out.println("Por favor, introduce un primer numero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ahora, introduce un segundo numero:");
        int num2 = scanner.nextInt();
        
        if(num1 > 10) {
            Multiplicar.multiplicar(num1, num2);
        } else {
            Sumar.sumar(num1, num2);
        }
    }
    
}
