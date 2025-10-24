/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {
    
    public static final String CONTRASENA = "hola1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        resultadoComprobacion();
    }
    
    public static String pedirContraseña() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce una contraseña.");
        return scanner.nextLine();
    }
    
    public static boolean comprobarContraseña(String contraseña) {
        if(contraseña.equals(CONTRASENA)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void resultadoComprobacion() {
        int intentos = 0;
        String input = "";
        boolean correcto = true;
        
        do {
            input = pedirContraseña();
            
            if(!input.equals(CONTRASENA)) {
                intentos++;
                System.out.println("No has introducido una contraseña correcta. Tienes " + (3-intentos) + " intentos restantes.");
            } else {
                System.out.println("Contraseña correcta!");
                correcto = false;
            }
        } while(correcto && intentos != 3);
        
        
    }
    
}
