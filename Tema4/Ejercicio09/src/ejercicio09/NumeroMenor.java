/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author alumno
 */
public class NumeroMenor {
    
    public static int numeroMenor(int num1, int num2, int num3) {
        
        int numero;
        
        if(num1 < num2 && num1 < num3) {
            numero = num1;
        } else if(num2 < num1 && num2 < num3) {
            numero = num2;
        } else {
            numero = num3;
        }
        
        return numero;
    }
    
}
