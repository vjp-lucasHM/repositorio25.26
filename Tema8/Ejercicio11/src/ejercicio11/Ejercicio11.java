/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ejercicio 11
        Mueble mueble1 = new Mueble();
        mueble1.setDescripcion("Silla de comedor"); 
        Mueble mueble2 = new Mueble("Mueble de salon", 134);
        
        System.out.println("----- Mueble 1 -------");
        System.out.println(mueble1);
        
        System.out.println("------ Mueble 2 ------");
        System.out.println(mueble2);
        
        System.out.println();
        
        mueble1.setDescripcion("Silla de cocina");
        System.out.println(mueble1);
        
        mueble2.setDescripcion("Mueble de cocina");
        System.out.println(mueble2);
        
        // ejercicio 12
        
        Scanner scanner = new Scanner(System.in);
        
        Mueble[] muebles = new Mueble[3];
        boolean exit = false;
        
        do {
            mostrarMenu();
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1: // rellenar los muebles
                    rellenarMuebles(muebles);
                    break;
                case 2: // mostrar todos los muebles
                    mostrarMuebles(muebles);
                    break;
                case 3: // mostrar muebles con un precio por debajo de uno que el usuario elija
                    mostrarPorPrecio(muebles);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default: // si el usuario elige una opcion invalida
                    System.out.println("Has introducido una opcion no valida! Intentalo de neuvo.");
            }
        } while(!exit); // Seguir ejecutando el programa hasta que el usuario quiera
    }
    
    // metodo que usaremos para mostrar el menu de opciones al usuario
    public static void mostrarMenu() {
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir del programa");
    }
    
    // metodo que usaremos para que el usuario rellene el vector con 
    // los muebles con la informacion que el usuario elija
    public static void rellenarMuebles(Mueble[] muebles) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < muebles.length; i++) {
            System.out.println("Mueble numero " + (i+1));
            
            System.out.println("Introduce la descripcion:");
            String descripcion = scanner.nextLine();
            
            System.out.println("Introduce el precio del mueble:");
            float precio = scanner.nextFloat();
            
            scanner.nextLine();
            
            muebles[i] = new Mueble(descripcion,precio);
            System.out.println("Mueble numero " + (i+1) + " rellenado correctamente.");
        }
    }
    
    // recorremos el vector de muebles y imprimimos a la terminal
    // las celdas de muebles que no sean nulas.
    public static void mostrarMuebles(Mueble[] muebles) {
        for(int i = 0; i < muebles.length; i++) {
            if(muebles[i] != null) {
                System.out.println("Mueble numero " + (i+1));
                System.out.println(muebles[i]);
            } else {
                System.out.println("Mueble numero" + (i+1));
                System.out.println("Esta vacio! :(");
            }
        }
    }
    
    // hacemos una busqueda de precio por debajo de uno establecido que el usuario
    // nos pondrá por la consola y si encontramos algun mueble, lo imprimimos a la consola
    // si no hay ningun mueble por debajo del precio establecido, le pondremos un mensaje al usuraio.
    public static void mostrarPorPrecio(Mueble[] muebles) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un precio limite para los muebles que quieras buscar:");
        double max = scanner.nextDouble();
        
        boolean encontrado = false;
        int i = 0;
        
        while(!encontrado && i < muebles.length) {
            if(muebles[i] != null && max >= muebles[i].getPrecio()) {
                System.out.println(muebles[i]);
                encontrado = true;
            } else {
                i++;
            }
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado ningún mueble con precio por debajo del establecido.");
        }
        
    }
}
