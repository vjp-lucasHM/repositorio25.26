/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarResultado(pedir());
    }
    
    public static boolean comprobar(int numero) {
        if(numero > 1) return false;
        else return true;
    } 
    
    public static int pedir() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Por favor, introduce un numero:");
            
            try {
                numero = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Introduce un numero valido! Tiene que ser un numero entero. El numero será puesto como 10 por defecto");
                numero = 10;
            }
            
            if(comprobar(numero)) {
                System.out.println("Por favor, introduce un nunero valido. (mayor que 1)");
            }
        } while(comprobar(numero));
        
        return numero;
    }
    
    public static void mostrarResultado(int numero) {
        for(int i = 1; i < numero; i++) {
            System.out.println(i);
        }
    }
    
}
