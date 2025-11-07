/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocarniceria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCarniceria {
    
    public static int NUMERO_COMPRA = 0;
    public static int NUMERO_PEDIDO = 0;

    // Le presentamos las opciones al usuario, manejamos la selección 
    // de opciones del usuario y hacemos que el programa siga corriendo
    // a no ser que el usuario elija la opcion numero 3 para salir del programa.
    public static void main(String[] args) {
        boolean exit = true;
        
        int opcion = 4;
        
        do {
            mostrarMenu();
            
            try {
                opcion = pedirOpcion();
            } catch (InputMismatchException ex) {
                System.out.println("Has elegido una opcion invalida!");
            }
            
            switch (opcion) {
                case 1:
                    System.out.println("Su numero de espera es: " + generarNumeroEsperaCompra());
                    System.out.println("Sera atendido en el mostrador " + generarLetraAleatoria('a','c'));
                    break;
                case 2:
                    System.out.println("Su numero de espera es: " + generarNumeroEsperaPedido());
                    System.out.println("Sera atendido en el mostrador " + generarLetraAleatoria('a','c'));
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    exit = false;
                    break;  
            }
        } while(exit);
    }
    
    // Creamos un metodo que le diga al usuario las opciones que tiene
    public static void mostrarMenu() {
        System.out.println("Por favor, elige una de las siguientes opciones:\n1. - Comprar\n2. - Hacer pedido\n3. - Salir del programa");
    }
    
    // Creamos un metodo que nos devuelva la opción que diga el usuario.
    public static int pedirOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            opcion = scanner.nextInt();
            
        } while (opcion <= 0 || opcion > 3);
        
        return opcion;
    }
     
    // Creamos un metodo que reciba 2 datos de tipo char y genere una letra aleatoria
    // entre ellos usando el código ASCII.
    public static char generarLetraAleatoria(char inicio, char finnal) {
        int randomnNum = (int) (Math.floor(Math.random()*(finnal-inicio+1)+inicio));
        return (char) randomnNum;
    }
    
    // Definimos un metodo para incrementar el número de la compra
    public static void incrementarNumeroCompra() {
        NUMERO_COMPRA++;
    }
    
    // Definimos un metodo para incrementar el numero del pedido
    public static void incrementarNumeroPedido() {
        NUMERO_PEDIDO++;
    }
    
    // Definimos un metodo que nos devuelva un String que incremente el numero de compra
    // y que nos genere un numero de espera de compra.
    public static String generarNumeroEsperaCompra() {
        incrementarNumeroCompra();
        return  "C-" + NUMERO_COMPRA;
    }
    
    // Definimos un metodo que nos devuelva un String que incremente el numero de pedido
    // y que nos genere un numero de espera de pedido.
    public static String generarNumeroEsperaPedido() {
        incrementarNumeroPedido();
        return "P-" + NUMERO_PEDIDO;
    }
    
}
