/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    
    public static int INTENTOS = 0;
    
    public static final int random = (int) (Math.floor(Math.random()*(122-97+1)+97)); // Generamos un numero aleatorio entre 97 y 122
    public static final char letraRandom = (char) random; // La convertimos en una letra.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comprobarLetra(); // Invocamos el metodo para pedir la letra y que la compruebe
    }
    
    public static char pedirLetra() {
        Scanner scanner = new Scanner(System.in);
        char letra;
        
        try {
            System.out.println("Introduce una letra (a-z)");
            letra = scanner.nextLine().charAt(0);
        } catch(InputMismatchException exception) {
            letra = 'a';
            System.out.println("Introduce una letra válida! (a-z) (La letra será 'a' por defecto)");
        } // Le pedimos una letra al usuario y si da un tipo de dato invalido, le damos un valor por defecto y le tiramos un error.
        
        return letra;
    }
    
    public static void comprobarLetra() {
        char letra;
        
        do {
            letra = pedirLetra();
            INTENTOS++;
        } while (letra != letraRandom);
        
        // Seguimos pidiendo una letra e incrementando el numero de intentos mientras no adivine la letra.
        
        System.out.println("Has adivinado la letra! Te ha tomado " + INTENTOS + " intentos."); // Decimos al usuario que ha adivinado la letra y los intentos que le ha tomado cuando la adivine.
    } 
    
}
