/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        rellenarLista(lista);
        mostrarLista(lista);
        
        eliminarDuplicados(lista);
        mostrarLista(lista);
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        boolean negativo = false;
        
        do {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Introduce un número positivo");
            System.out.println("Si introduces uno negativo se te dejaran de pedir numeros.");
            int numero  = scanner.nextInt();
            
            if(numero > 0) {
                lista.add(numero);
                System.out.println("Se ha introducido el numero " + numero + " a la lista.");
            } else {
                negativo = true;
            }
        } while(!negativo);
    } 
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for(int i : lista) {
            System.out.println(i);
        }
    }
    
    public static void eliminarDuplicados(ArrayList<Integer> lista) {
        for(int i = 0; i < lista.size() - 1; i++) {
            for(int j = i + 1; j < lista.size() - 1; i++) {
                if(lista.get(i) == lista.get(j)) {
                    lista.set(i, 0);
                    lista.set(j, 0);
                }
            }
        }
    }
}
