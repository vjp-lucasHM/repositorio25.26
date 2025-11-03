/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {
    
    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre:");
        return scanner.nextLine();
    }
    
    public static int pedirEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad:");
        return scanner.nextInt();
    }
    
    public static void mayorDeEdad(int edad) {
        System.out.println("Eres " + ((edad >= 18) ? "mayor" : "menor") + " de edad.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tu nombre es " + pedirNombre());
        mayorDeEdad(pedirEdad());
    }
    
}
