/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularTabla(pedirNumero());
    }
    
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero:");
        
        return scanner.nextInt();
    }
    
    public static void calcularTabla(int numero) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
    }
    
}
