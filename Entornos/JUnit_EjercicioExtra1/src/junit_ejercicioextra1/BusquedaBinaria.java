/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit_ejercicioextra1;

/**
 *
 * @author tumba
 */
public class BusquedaBinaria {
    
    static int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
   
    
    public static int busquedaBinaria(int numero){
        int umbral_inferior = 0;
        int umbral_superior = array.length - 1;
        int respuesta = -1;
        int index;
        
        while(umbral_inferior <= umbral_superior) { // Instruccion 1 - nodo 1
            index = (umbral_inferior + umbral_superior) / 2; // Instruccion 2 - nodo 2
            
            if(array[index] == numero) { // Instruccion 3 - nodo 3
                respuesta = index; // Instruccion 4 -
                umbral_inferior = umbral_superior + 1; // Instruccion 5 - nodo 4
            } else if(array[index] < numero) { // Instruccion 6 - nodo 5
                umbral_inferior = index + 1; // Instruccion 7 - nodo 6
            } else { // Instruccion 8 - nodo 7
                umbral_superior = index - 1; // Instruccion 9 - nodo 8
            } // Instruccion 10 - nodo 9
        } // Instruccion 11 - nodo 10
        
        return respuesta; // Instruccion 12 - nodo 11
    } // main
    
} 
