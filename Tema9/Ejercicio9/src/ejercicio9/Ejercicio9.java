/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = scanner.nextLine();

        String contrasena;
        boolean valida = false;

        do {
            System.out.print("Introduce tu contraseña: ");
            contrasena = scanner.nextLine();

            if (esContraseñaValida(contrasena, usuario)) {
                System.out.println("Contraseña valida! :)");
                valida = true;
            } else {
                System.out.println("La contraseña no cumple con los requisitos. Intentalo de nuevo.\n");
            }
        } while (!valida);
        
    }
    
    public static boolean esContraseñaValida(String pwd, String usr) {
        boolean valida = true;
        
        if(pwd.length() < 6) {
            valida = false;
            System.out.println(" - La contraseña debe de tener al menos 6 caracteres.");
        }
        
        if(pwd.toLowerCase().contains(usr.toLowerCase())) {
            valida = false;
            System.out.println(" - La contraseña no puede formar parte del usuario.");
        }
        
        int contador = 0;
        for(char c : pwd.toCharArray()) {
            if(Character.isDigit(c)) {
                contador++;
            }
        }
        
        if(contador < 2) {
            valida = false;
            System.out.println(" - La contraseña debe de tener al menos 2 digitos.");
        }
        
        return valida;
    }
    
}
