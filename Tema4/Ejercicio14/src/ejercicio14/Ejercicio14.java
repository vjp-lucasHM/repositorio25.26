/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarResultado(pedir()); // invocamos el metodo para imprimir el resultado a consola, y a la vez, pedimos el numero al usuario.
    }
    
    public static boolean comprobar(int numero) {
        if(numero > 1) return false;
        else return true;
    }   
    
    public static int pedir() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        // Creamos una nueva instancia dle objeto scanner y creamos una variable de numero entero para almacenar el numero que diga el usuario
        
        do {
            System.out.println("Por favor, introduce un numero:"); 
            
            try {
                numero = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Introduce un numero valido! Tiene que ser un numero entero. El numero será puesto como 10 por defecto");
                numero = 10;
            } // Le pedimos un numero al usuario y si introduce un tipo de dato invalido, hacemos que el numero sea 10 por defecto.
            
            if(comprobar(numero)) {
                System.out.println("Por favor, introduce un nunero valido. (mayor que 1)");
            }
        } while(comprobar(numero)); // Si el numero es menor que 1, le damos un mensaje de error al usuario y se lo volvemos a pedir
        
        return numero;
    }
    
    // Si el resto del numero entre 3 es 0, es multiplo de 3, en el otro caso, no lo es.
    public static boolean esMultiploDeTres(int numero) {
        if(numero % 3 == 0) {
            return true;
        } 
        
        return false;
    } 
    
    // Hacemos un bucle entre 1 y el número pasado por la funcion y si es multiplo de tres lo imprimimos por pantalla
    public static void mostrarResultado(int numero) {
        System.out.println("Numeros multiplos de 3 entre 1 y " + numero);
        for(int i = 1; i < numero; i++) {
            if(esMultiploDeTres(i)) {
                System.out.println(i);
            }
        }
    }
    
}
