/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        raizCuadrada(64);
        ochoAlCubo(8,3);
        exp(2);
        log(Math.E);
        min(2,3);
        round(-4.5);
        seno(45);
    }
    
    public static void seno(int num) {
        System.out.println("Seno de 45 grados: " + Math.sin(num));
    }
    
    public static void round(double num) {
        System.out.println("Redondeando " + num + " con ROUND: " + Math.round(num));
    }
    
    public static void valorAbs(double num) {
        System.out.println("Valor absoluto de" + num + ": " + Math.abs(num));
    }
    
    public static void min(int num1, int num2) {
        System.out.println("Menor valor entre " + num1 + " y " + num2 + ": " + Math.min(num1, num2));
    }
    
    public static void log(double num) {
        System.out.println("Logaritmo de " + num + ": " + Math.log(num));
    }
    
    public static void exp(int num) {
        System.out.println("Exponencial de " + num + ": " + Math.exp(num));
    }
    
    public static void raizCuadrada(int num) {
        System.out.println("Raiz cuadrada de " + num + ": " + Math.sqrt(num));
    }
    
    public static void ochoAlCubo(int base, int exponente) {
        System.out.println(base + " elevado a " + exponente +": " + Math.pow(base,exponente));
    }
    
}
