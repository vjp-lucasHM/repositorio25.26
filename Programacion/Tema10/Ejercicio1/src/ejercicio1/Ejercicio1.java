/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        rellenarNombres(lista);
        mostrarLista(lista);
    }
    
    public static void rellenarNombres(ArrayList<String> lista) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce algun nombre:");
            String nombre = scanner.nextLine();
            lista.add(nombre);
            System.out.println("Quieres añadir otro nombre a la lista? S/N");
            respuesta = scanner.nextLine();
        } while(respuesta.equalsIgnoreCase("s"));
    }
    
    public static void mostrarLista(ArrayList<String> lista) {
        for(String nombre : lista) {
            System.out.println(nombre);
        }
    }
    
}
