/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        rellenarMatriz(matriz);
        System.out.println(mostrarParesMatriz(matriz));
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarRandom(100, 200);
            }
        }
    }
    
    public static String mostrarParesMatriz(int[][] matriz) {
        String numeros = "";
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0) {
                    numeros += matriz[i][j] + " ";
                }
            }
        }
        
        return numeros;
    }
    
    public static int generarRandom(int min, int max) {
        int random = (int) ((((max-min)+1)*Math.random())+min);
        return random;
    }
    
}
