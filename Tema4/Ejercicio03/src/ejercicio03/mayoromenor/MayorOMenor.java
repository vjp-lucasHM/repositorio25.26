/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03.mayoromenor;

/**
 *
 * @author alumno
 */
public class MayorOMenor {
    
    public static void elegirNumeroMayor(int num1, int num2, int num3) {
        
        int num;
        
        if(num1 > num2 && num1 > num3) {
            num = num1; 
        } else if(num2 > num1 && num2 > num1) {
            num = num2;
        } else {
            num = num3;
        }
        
        System.out.println("El numero mayor de entre los 3 introducidos es " + num + ".");
    }
    
}
