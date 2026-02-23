/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etdl_examen;

/**
 *
 * @author alumno
 */
public class codigo {
    
    public static boolean ordenarPorSeleccion(int[] listaNumeros) {
        
        int temporal;                                                           // instruccion 1 - nodo 1
        boolean listaOrdenada = true;                                           // instruccion 2
        
        for(int i = 0; i < listaNumeros.length - 1; i++) {                      // instruccion 3 - nodo 2
            for(int j = i + 1; j < listaNumeros.length; j++) {                  // Instruccion 4 - nodo 3
                if(listaNumeros[i] > listaNumeros[j]) {                         // instruccion 5 - nodo 4
                    temporal = listaNumeros[i];                                 // instruccion 6 - nodo 5
                    listaNumeros[i] = listaNumeros[j];                          // instruccion 7
                    listaNumeros[j] = temporal;                                 // instruccion 8
                                
                    listaOrdenada = false;                                      // instruccion 9
                }                                                               // fin del if - instruccion 10 - nodo 6
            }                                                                   // fin del for j - instruccion 11 - nodo 7
        }                                                                       // fin del for i - instruccion 12 - nodo 8
        
        return listaOrdenada;                                                   // instruccion 12 - nodo 9
    }
    
}
