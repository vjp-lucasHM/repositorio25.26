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
        
        System.out.println("Por favor, introduce la nota de algun alumno:"); // pedimos el numero de la nota
        int nota = scanner.nextInt();
        String calificacion = "";
        
        if(nota < 0 || nota > 10) { // si la nota no esta comprendida entre 0 y 10, cerramos el programa
            System.out.println("La nota debe de estar comprendida entre 0 y 10");
            return;
        }
        
        if(nota >= 0 && nota <= 4) calificacion = "suspenso"; // si está comprendida entre 0 y 4 es un suspenso
        else if(nota >= 5 && nota <= 6) calificacion = "bien"; // si esta comprendida entre 5 y 6 es un bien 
        else if(nota >= 7 && nota <= 8) calificacion = "notable"; // si esta comprendida entre 7 y 8 es un notable
        else if(nota >= 9 && nota <= 10) calificacion = "sobresaliente"; // si esta comprendida entre un 9 y un 10 es un sobresaliente
        
        
        System.out.println("La nota de este alumno es un " + calificacion); // mensaje final
    }
    
}
