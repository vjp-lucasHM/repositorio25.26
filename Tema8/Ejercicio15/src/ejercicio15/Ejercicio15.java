/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula[] peliculas = new Pelicula[2];
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default: 
                    System.out.println("Elige una opcion valida! (1-7)");
                    break;
            }
        } while(!exit);
    }
    
    public static void mostrarMenu() {
        System.out.println("1. Rellenar las peliculas junto con los socios que han acudido a verla");
        System.out.println("2. Mostrar las peliculas y los socios que la han visto");
        System.out.println("3. Mostrar pelicula mas rentable");
        System.out.println("4. Mostrar pelicula menos rentable");
        System.out.println("5. Pedeir el nombre de una pelicula y mostrar el beneficio neto y toda la informacion de los socios que han acudido a verla.");
        System.out.println("6. Contar el numero de socios que han abonado una cantidad mayor a la pedida por pantalla.");
        System.out.println("7. Salir del programa.");
    }
    
    public static void mostrarPeliculasYSocios() {}
    
}
