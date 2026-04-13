/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
            try {
                mostrarMenu();
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        añadirContacto(agenda);
                        break;
                    case 2:
                        visualizarContactos(agenda);
                        break;
                    case 3:
                        eliminarContacto(agenda);
                        break;
                    case 4:
                        mostrarOrdenadosPorEdad(agenda);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número válido.");
                opcion = 0;
            } catch (InputMismatchException e) {
                System.out.println("Error de entrada. Intente de nuevo.");
                scanner.nextLine();
                opcion = 0;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                opcion = 0;
            }
        } while (opcion != 5);
    }
    
    public static void visualizarContactos(Set<Contacto> agenda) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        }
        
        System.out.println("\n--- LISTA DE CONTACTOS ---");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
    
    public static void mostrarOrdenadosPorEdad(Set<Contacto> agenda) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía");
        }
        
        List<Contacto> ordenados = new ArrayList<>(agenda);
        ordenados.sort(Comparator.comparingInt(Contacto::getEdad));
        
        System.out.println("\n--- CONTACTOS ORDENADOS POR EDAD ---");
        for (Contacto contacto : ordenados) {
            System.out.println(contacto);
        }
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
    
    private static void eliminarContacto(Set<Contacto> agenda) {
        System.out.print("Introduce el número de teléfono del contacto a eliminar: ");
        Scanner scanner = new Scanner(System.in);
        String movil = scanner.nextLine();
        
        boolean eliminado = false;
        for (Iterator<Contacto> iterator = agenda.iterator(); iterator.hasNext(); ) {
            Contacto contacto = iterator.next();
            if (contacto.getTelefono().equals(movil)) {
                iterator.remove();
                eliminado = true;
                System.out.println("Contacto eliminado correctamente.");
                break;
            }
        }
        
        if (!eliminado) {
            System.out.println("No se encontro ningun contacto con ese número de telefono");
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
