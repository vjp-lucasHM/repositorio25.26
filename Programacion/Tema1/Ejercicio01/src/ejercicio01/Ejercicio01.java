/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Lucas
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos las variables de dato1  y dato2
        int dato1 = 20;
        int dato2 =  10;
        
        // Definimos la variable de resultado y hacemos la operacion de sumar
        int resultado = dato1 + dato2;
        System.out.println(dato1 + " + " + dato2 + " = " + resultado);
        
        //Hacemos la operacion de restar
        resultado = dato1 - dato2;
        System.out.println(dato1 + " - " + dato2 + " = " + resultado);
        
        // Hacemos la operacion de multiplicar
        resultado = dato1 * dato2;
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);
        
        // Hacemos la operacion de dividir
        resultado = dato1 / dato2;
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
}
