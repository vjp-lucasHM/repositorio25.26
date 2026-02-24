/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author alumno
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio = (int) Math.floor(Math.random()*100+1);
        
        if(aleatorio % 2 == 0) {
            System.out.println("El numero aleatorio " + aleatorio + " es par.");
        } else {
            System.out.println("El numero aleatorio " + aleatorio + " es impar.");
        }
    }
    
}
