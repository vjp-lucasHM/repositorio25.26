/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocajafuerte;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoCajaFuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CajaFuerte cajaFuerte = new CajaFuerte();
        int opcion;
        
        do {
            mostrarMenu();
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    cajaFuerte.rellenarCompartimento();
                    break;
                case 2:
                    cajaFuerte.mostrarMonedaMaterial();
                    break;
                case 3:
                    cajaFuerte.mostrarMasValiosa();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida! Intentalo otra vez");
            }
            
        } while(opcion != 4);
    }
    
    public static void mostrarMenu() {
        System.out.println("---- MENU DE OPCIONES ----");
        System.out.println("1. - Rellenar la caja fuerte de monedas");
        System.out.println("2. - Mostrar todas las monedas fabricadas con un material determinado");
        System.out.println("3. - Mostrar la moneda mas valiosa"); //
        System.out.println("4. - Salir del programa..."); //
    }
    
}
