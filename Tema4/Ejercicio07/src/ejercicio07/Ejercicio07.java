/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos una instancia del objeto Scanner y pedimos los numeros correspondientes
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un primer numero");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce un segundo numero");
        int num2 = scanner.nextInt();
        
        System.out.println("Introduce un tercer numero.");
        int num3 = scanner.nextInt();
        
        System.out.println("Introduce un cuarto numero.");
        int num4 = scanner.nextInt();
        
        // Invocamos al metodo que nos imprimira los numeros ordenados por consola.
        mostrarOrdenados(num1, num2, num3, num4);
    }
    
    // Definimos el metodo para ordenar los numeros de menor a mayor
    public static void mostrarOrdenados(int a, int b, int c, int d) {
        int aux;

        // Hacemos la implementacion del metodo burbuja
        for (int i = 0; i < 4; i++) {
            if (a > b) { aux = a; a = b; b = aux; }
            if (b > c) { aux = b; b = c; c = aux; }
            if (c > d) { aux = c; c = d; d = aux; }
        }

        // Los imprimimos por la consola ordenados
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(a + " " + b + " " + c + " " + d);
    }
    
}
