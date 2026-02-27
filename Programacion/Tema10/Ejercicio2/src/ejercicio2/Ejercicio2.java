/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        if(!lista.isEmpty()){
            mostrarLista(lista);
            sumarLista(lista);
            mayorLista(lista);
            menorLista(lista);
        }else{
            System.out.println("La lista está vacía");
        }
    }
    
    public static void sumarLista(ArrayList<Integer> lista) {
        int suma = 0;
        for(int numero : lista) {
            suma += numero;
        }
        
        System.out.println("La suma total de los elementos de esta lista es " + suma);
    }
    
    public static void mayorLista(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        
        for(int numero : lista) {
            if(numero > mayor) {
                mayor = numero;
            }
        }
        
        System.out.println("El elemento más grande de la lista es " + mayor);
    }
    
    public static void menorLista(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        
        for(int numero : lista) {
            if(numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("El elemento más pequeño de esta lista es " + menor);
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero positivo:");
        int numero = scanner.nextInt();
        
        while(numero >= 0) {
            lista.add(numero);
        }
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for(int nombre : lista) {
            System.out.println(nombre);
        }
    }
    
}
