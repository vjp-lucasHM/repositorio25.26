/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author tumba
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[80];
        int numero = 2;
        int contador = 0;
        
        while(contador < 80) {
            if(esPrimo(numero)) {
                numeros[contador] = numero;
                contador++;
            }
            
            numero++;
        }
        
        System.out.println("Contenido de un array unidimensional de 80 posiciones con numeros primos:");
        
        for(int i = 0; i < numeros.length - 1; i++) {
            System.out.println("[" + i + "] -> " + numeros[i]);
        }
    }
    
    public static boolean esPrimo(int numero) {

    if (numero < 2) return false;

    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;
}
    
}
