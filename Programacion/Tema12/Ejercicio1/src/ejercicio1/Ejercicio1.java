/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import com.sun.source.util.TreeScanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Contacto> agenda = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    añadirContacto(agenda);
                    break;
                case 2:
                    mostrarContactos(agenda);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida! Intentalo de nuevo");
            }
        } while (opcion != 5);
    }

    public static void añadirContacto(Set<Contacto> agenda) {
        String nombre = pedirNombre();
        int edad = pedirEdad();
        String numero = pedirNumero();
        
        agenda.add(new Contacto(nombre,edad,numero));
    }
    
    public static void mostrarContactos(Set<Contacto> agenda) {
        int n = 0;
        
        if(!agenda.isEmpty()) {
            for(Contacto contacto : agenda) {
            System.out.println("Contacto número " + (n+1));
            System.out.println(" - Nombre: " + contacto.getNombre());
            System.out.println(" - Edad: " + contacto.getEdad());
            System.out.println(" - Numero: " + contacto.getTelefono());
        }
        } else {
            System.out.println("No hay ningun contacto registrado.");
        }
    }
    
    public static void eliminarContacto(Set<Contacto> agenda) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el numero del contacto que quieras eliminar.");
        String numero = scanner.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while(!encontrado) {
            for(Contacto contacto : agenda) {
                if(contacto.getTelefono().equalsIgnoreCase(numero)) {
                    encontrado = true;
                }
            }
        }
    }
    
    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de este nuevo contacto:");
        return scanner.nextLine();
    }
    
    public static int pedirEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la edad de este nuevo contacto.");
        return scanner.nextInt();
    }
    
    public static String pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de este nuevo contacto.");
        return scanner.nextLine();
    }
    
    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. - Añadir contacto a la agenda");
        System.out.println("2. - Visualizar la lista de contacos");
        System.out.println("3. - Eliminar contactos de la lista");
        System.out.println("4. - Mostrar todos los contactos ordenados por su edad.");
        System.out.println("5. - Salir del programa");
    }
    
}
