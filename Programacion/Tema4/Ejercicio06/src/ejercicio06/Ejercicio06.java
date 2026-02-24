/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nota;
        
        do {
            System.out.println("Por favor, introduce la nota de tu alumno.");
            nota = scanner.nextInt();
            
            if(nota < 0 || nota > 10) {
                System.out.println("Por favor, introduce una nota entre 0 y 10.");
            }
        } while(nota <0 || nota > 10);
        
        calificarAlumno(nota);
    }
    
    public static void calificarAlumno(int nota) {
        if(nota >= 0 && nota <= 4) {
            System.out.println("Este alumno tiene un suspenso.");
        } else if(nota >= 5 && nota <= 6){
            System.out.println("Este alumno tiene un bien");
        } else if(nota >= 7 && nota <= 8) {
            System.out.println("Este alumno tiene un notable.");
        } else if(nota >= 9 && nota <= 10) {
            System.out.println("Este alumno tiene un sobresaliente.");
        }
    }
    
}
