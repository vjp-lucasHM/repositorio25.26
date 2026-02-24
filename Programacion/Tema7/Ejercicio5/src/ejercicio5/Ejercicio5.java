/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][2];
        
        rellenarMatriz(matriz);
        mostrarMatrizAtractiva(matriz);
        mostrarMayor(matriz);
        mostrarMenor(matriz);
        mostrarSuma(matriz);
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a rellenar una matriz de 4x2");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void mostrarMatrizAtractiva(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + i + j + "] -> " + matriz[i][j]);
            }
            
            System.out.println("\n");
        }
    }
    
    public static void mostrarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        
        System.out.println("El numero mayor de la matriz es " + mayor);
    } 
    
    public static void mostrarMenor(int[][] matriz) {
        int menor = matriz[0][0];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("El numero menor de la matriz es " + menor);
    } 
    
    public static void mostrarSuma(int[][] matriz) {
        int suma = 0;
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma de todos los elementos de la matriz es" + suma);
    } 
    
    
    
}
