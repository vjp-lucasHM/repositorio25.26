/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        
        for(int i = 111; i<222; i++) {
            if(i % 2 != 0) suma += i;
        }
        
        System.out.println("La suma de todos los numeros impares entre 111 y 222 es " + suma + ".");
    }
    
}
