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
        imprimirNombre(pedirNombre());
    }
    
    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce tu nombre:");
        
        return scanner.nextLine();
    }
    
    public static void imprimirNombre(String nombre) {
        for(int i = 0; i<= 4; i++) {
            System.out.println(nombre);
        }
    }
    
}
