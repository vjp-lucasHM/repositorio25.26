/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularRaiz(pedirNumero());
    }
    
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero:");
        
        return scanner.nextInt();
    }
    
    public static void calcularRaiz(int numero) {
        double resultado =  Math.sqrt((double) numero);
        
        System.out.println("El resultado de la raiz de " + numero + " es " + resultado);
    }
    
}
