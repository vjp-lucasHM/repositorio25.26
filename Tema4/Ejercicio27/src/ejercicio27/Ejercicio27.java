/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {
    
    public static final int RANDOM = (int) (Math.random()*2);
    public static String CARA_O_CRUZ = asignarCaraOCruz();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correcto = false;
        int intentos = 1;
        
        do {
            System.out.println("Di lo que crees que sea (cara o cruz)");
            String respuesta = scanner.nextLine();
            
            if(respuesta.equalsIgnoreCase(CARA_O_CRUZ)) {
                System.out.println("Enhorabuena!! Has adivinado!! Te ha tomado " + intentos + " intentos.");
                correcto = true;
            } else if(!respuesta.equalsIgnoreCase(CARA_O_CRUZ)) {
                System.out.println("No has adivinado. Intenta otra vez.");
                intentos++;
            } else {
                System.out.println("Introduce una opción valida.");
            }
        } while(!correcto);
    }
    
    public static String asignarCaraOCruz() {
        return (RANDOM == 1) ? "cara" : "cruz";
    }
    
}
