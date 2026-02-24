/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarConstEuler();
        mostrarPi();
        mostrarNumero(Math.log(5));
    }
    
    public static void mostrarPi() {
        System.out.println(Math.PI);
    }
    
    public static void mostrarConstEuler() {
        System.out.println(Math.E);
    }
    
    public static void mostrarNumero(double numero) {
        System.out.println(numero);
    }
    
}
