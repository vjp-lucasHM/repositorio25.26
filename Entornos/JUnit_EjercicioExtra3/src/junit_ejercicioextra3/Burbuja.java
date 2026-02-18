/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit_ejercicioextra3;

/**
 *
 * @author tumba
 */
public class Burbuja {
    
    public static boolean burbuja(int[] array) {
        boolean ordenado = true;
        int elementoActual, elementoSiguiente;
        
        for(int i = 0; i < array.length; i++) { // instruccion 1 - nodo 1
            for(int j = 0; j < array.length - 1; j++) { // instruccion 2 - nodo 2
                elementoActual = array[j]; // instruccion 3 - nodo 3
                elementoSiguiente = array[j+1]; // instruccion 4
                
                if(elementoActual > elementoSiguiente) { // instruccion 5 - nodo 4
                    array[j] = elementoSiguiente; // instruccion 6 - nodo 5
                    array[j+1] = elementoActual; // instruccion 7
                    ordenado = false; // instruccion 8
                } // instruccion 8 - nodo 6
            } // instruccion 9 - nodo 7
        } // instruccion 10 - nodo 8
        
        return ordenado; // instruccion 11 - nodo 9
    }
    
}
