/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un dia de la semana.");
        String dia = scanner.nextLine();
        
        String numero = "";
        
        if(dia.equalsIgnoreCase("Lunes")) numero = "primer";
        if(dia.equalsIgnoreCase("Martes")) numero = "segundo";
        if(dia.equalsIgnoreCase("Miercoles")) numero = "tercer";
        if(dia.equalsIgnoreCase("Jueves")) numero = "cuarto";
        if(dia.equalsIgnoreCase("Viernes")) numero = "quinto";
        if(dia.equalsIgnoreCase("Sabado")) numero = "sexto";
        if(dia.equalsIgnoreCase("Domingo")) numero = "septimo";
        
        System.out.println(dia + " es el " + numero + " dia de la semana.");
    }
    
}
