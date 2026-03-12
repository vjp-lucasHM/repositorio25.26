/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista donde se guarda los numeros introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        //Se pide que rellene la lista y que se muestre
        rellenarLista(numeros);
        System.out.println("La lista original es la siguiente:");
        mostrarLista(numeros);
        
        //Se busca el indice mayor del Par y el indice menor del Impar
        int par = indiceMayorPar(numeros);
        int impar = indiceMenorImpar(numeros);
        
        //Si alguno no existe, no se puede hacer el intercambio
        if(par == -1 || impar == -1){
            System.out.println("No hay suficientes pares/impares para hacer el intercambio");
        }else{
            //Se muestra los valores encontrados
            System.out.println("Mayor que: " + numeros.get(par));
            System.out.println("Menor que: " + numeros.get(impar));
            //Se intercambian las posiciones en la lista y se vuelve a mostrar
            intercambiar(numeros, par, impar);
            System.out.println("Lista modificada");
            mostrarLista(numeros);
        }
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner scanner = new Scanner(System.in);
        
        String respuesta;
        int numero;
        
        do {
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();
            
            lista.add(numero);
            scanner.nextLine();
            
            System.out.print("Deseas introducir otro numero (s/n)");
            respuesta = scanner.nextLine();
        }while(respuesta.equalsIgnoreCase("s"));
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Lista: ");
        
        for(int n : lista) {
            System.out.println(n);
        }
    }
    
    public static int indiceMayorPar(ArrayList<Integer> lista) {
        int indice = 0;
        
        while(indice < lista.size() && lista.get(indice) % 2 != 0){
            indice++;
        }
        
        if(indice == lista.size()){
            return -1;
        }
        
        for(int i = indice + 1; i < lista.size(); i++){
            int valor = lista.get(i);
            if(valor % 2 == 0 && valor > lista.get(indice)){
                indice = i;
            }
        }
        
        return lista.get(indice);
    }
    
    public static int indiceMenorImpar(ArrayList<Integer> lista) {
        int indice = 0;
        while(indice < lista.size() && lista.get(indice) % 2 == 0){
            indice++;
        }
        
        if(indice == lista.size()){
            return -1;
        }

        for(int i = indice + 1; i < lista.size(); i++){
            int valor = lista.get(i);
            if(valor % 2 != 0 && valor < lista.get(indice)){
                indice = i;
            }
        }
        return lista.get(indice);
    }
    
    public static void intercambiar(ArrayList<Integer> lista, int i, int j){
        int aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }
    
}
