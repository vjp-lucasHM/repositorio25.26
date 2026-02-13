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

        // le pedimos al usuario su contraseña.
        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = scanner.nextLine();
        
        boolean valida = false;

        // hasta que la contraseña que introduzca el usuario no sea valida,
        // se la seguimos pidiendo
        do {
            System.out.print("Introduce tu contraseña: ");
            contrasena = scanner.nextLine();

            // si la contraseña es valida, nos salimos del bucle
            if (esContraseñaValida(contrasena, usuario)) {
                System.out.println("Contraseña valida! :)");
                valida = true;
            } else { // si no lo es, le seguimos pidiendo la contraseña al usuario.
                System.out.println("La contraseña no cumple con los requisitos. Intentalo de nuevo.");
            }
        } while (!valida);
        
    }
    
    public static boolean esContraseñaValida(String pwd, String usr) {
        boolean valida = true;
        
        // si la contraseña tiene menos de 6 caracteres, no es valida
        if(pwd.length() < 6) {
            valida = false;
            System.out.println(" - La contraseña debe de tener al menos 6 caracteres.");
        }
        
        // si la contraseña contiene el usuario, la contraseña no es valida
        if(pwd.toLowerCase().contains(usr.toLowerCase())) {
            valida = false;
            System.out.println(" - La contraseña no puede formar parte del usuario.");
        }
        
        
        // hacemos un for-each con un array de chars del string y si el char es un digito, incrementamos nuestra
        // variable contador por 1
        int contador = 0;
        for(char c : pwd.toCharArray()) {
            if(Character.isDigit(c)) {
                contador++;
            }
        }
        
        // si no hay 2 digitos, la contraseña es invalida
        if(contador < 2) {
            valida = false;
            System.out.println(" - La contraseña debe de tener al menos 2 digitos.");
        }
        
        return valida;
    }
    
}
