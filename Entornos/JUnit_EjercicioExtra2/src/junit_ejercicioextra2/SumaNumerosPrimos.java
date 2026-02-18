/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit_ejercicioextra2;

/**
 *
 * @author tumba
 */
public class SumaNumerosPrimos {
    public static int sumaPrimos(int numeroMaximo) {
        int acumulador = 0;
        int numero = 2;
        int contador;
        boolean primo;
        
        do { // instruccion 1 - nodo 1
            System.out.println(numero); // instruccion 2 - nodo 2
            contador = 2; // instruccion 3
            primo = true; // instruccion 4
            
            while((primo) && (contador != numero)) { // instruccion 5 - nodo 3
                if(numero % contador == 0) { // instruccion 6 - nodo 4
                    primo = false; // instruccion 7 - nodo 5
                } // instruccion 8 - nodo 6
                
                contador++; // instruccion 9 - nodo 7
            } // instruccion 10 - nodo 8
            
            if(primo) { // instruccion 11 - nodo 9
                acumulador += numero; // instruccion 12 - nodo 10
            } // instruccion 13 - nodo 11
            
            numero++; // instruccion 14 - nodo 12
        } while(numero <= numeroMaximo); // instruccion 15 - nodo 13
        
        return acumulador; // instruccion 16 - nodo 14
    }
}
