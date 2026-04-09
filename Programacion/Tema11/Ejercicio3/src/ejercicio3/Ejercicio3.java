/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autobus[] parking = new Autobus[6];
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch(opcion) {
                case 1:
                    aparcarBus(parking);
                    break;
                case 2:
                    mostrarPlazasLibres(parking);
                    break;
                case 3:
                    buscarAutobus(parking);
                    break;
                case 4:
                    buscarConductor(parking);
                    break;
                case 5: 
                    busConMasConductores(parking);
                    break;
                case 6:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opcion invalida! Intenta de nuevo.");
            }
        } while(opcion != 6);
    }
    
    // Metodo que usaremos para mostrar el menu de opciones al usuario.x
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aparcar un autobus");
        System.out.println("2. Mostrar plazas libres");
        System.out.println("3. Buscar un autobus por matricula");
        System.out.println("4. Buscar un conductor");
        System.out.println("5. Buscar el autobus con mas conductores");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion:");
    }
    
    public static void aparcarBus(Autobus[] plazas) {
        Scanner scanner = new Scanner(System.in);
        
        int pos;
        
        do {
            System.out.println("Introduce la posicion para aparcar el bus (0-5)");
            pos = scanner.nextInt();
        } while (pos < 0 || pos > 5 || plazas[pos] != null);
        
        Autobus bus = new Autobus(pedirMatricula());
        System.out.print("Cuantos conductores quieres añadir?: ");
        int num = scanner.nextInt();
        
        //Se añade los conductores al HashMap del autobus
        for (int i = 0; i < num; i++) {
            bus.addConductor(pedirDni(), pedirNombre());
        }
        plazas[pos] = bus;
        System.out.println("Autobus aparcado con exito.");
    }
    
    public static void mostrarPlazasLibres(Autobus[] plazas) {
        boolean libre = false;
        
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                System.out.println("La plaza nº " + (i+1) + " libre");
                libre = true;
            }
        }
        if (!libre) {
            System.out.println("No hay darsenas libres");
        }
    }
    
    public static void buscarAutobus(Autobus[] plazas) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la matricula a buscar: ");
        String matricula = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < plazas.length && !encontrado) {
            if (plazas[i] != null && plazas[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Autobus encontrado en darsena: " + i);
                System.out.println("Conductores asignados: " + plazas[i].getConductores());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun autobus con esa matricula");
        }
    }
    
    public static void buscarConductor(Autobus[] plazas) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el DNI del conductor: ");
        String dni = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        //Se recorre cada autobus buscando su DNI en su HashMap
        while (i < plazas.length && !encontrado) {
            if (plazas[i] != null && plazas[i].getConductores().containsKey(dni)) {
                System.out.println("El conductor trabaja en el autobus con matricula: " + plazas[i].getMatricula());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun conductor con ese DNI");
        }
    }
    
    public static void busConMasConductores(Autobus[] plazas) {
        System.out.println();
        
        int max = 0;
        int posicion = 0;
        
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] != null) {
                int cantidad = plazas[i].getConductores().size();
                if (cantidad > max) {
                    max = cantidad;
                    posicion = i;
                }
            }
        }
        if (max == 0) {
            System.out.println("No hay autobuses aparcados o ninguno tiene conductores");
        } else {
            System.out.println("El autobus con mas conductores esta en la darsena " + posicion);
        }
    }
    
    public static String pedirMatricula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la matricula del autobus: ");
        String matricula = scanner.nextLine();
        return matricula;
    }
    
    public static String pedirDni() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el DNI del conductor: ");
        String dni = scanner.nextLine();
        return dni;
    }
    
    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del conductor: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    
}
