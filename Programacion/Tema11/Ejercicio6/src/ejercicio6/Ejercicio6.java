/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se crea una campaña que gestiona todas las donaciones
        Campania camp = new Campania();

        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: // Añadir donaciones
                    camp.aniadirDonacion();
                    break;
                case 2: // Mostrar todas las donaciones
                    camp.mostrarDonaciones();
                    break;
                case 3: // Buscar por nombre
                    camp.buscarPorNombre();
                    break;
                case 4: // Mostrar el total de donaciones
                    System.out.print("\nNumero de donaciones: " + camp.getDonaciones().size() + "\n");
                    break;
                case 5: // Mostrar el total recaudado
                    System.out.print("\nTotal recaudado: " + camp.totalRecaudado() + " Euros" + "\n");
                    break;
                case 6: // Ordenar las donaciones
                    camp.ordenarDonaciones();
                    break;
                case 7: // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo");
                    break;
            }
        } while (opcion != 7);
    }

    //Metodo que muestra por pantalla el menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Añadir donacion");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Mostrar el numero de donaciones");
        System.out.println("5. Mostrar el total recaudado");
        System.out.println("6. Mostrar las donaciones ordenadas");
        System.out.println("7. Salir del programa");
        System.out.print("Elige una opcion: ");
    }
}
