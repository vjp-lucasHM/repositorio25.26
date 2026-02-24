/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        
        rellenarVector(vector);
        ordenarMayorMenor(vector);
        System.out.println("El elemento mas grande del array es " + vector[vector.length - 1] + " y el menor es " + vector[0]);
        elementoRepetido(vector);
        mediaArray(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = generarRandom(10, 80);
        }
    }
    
    public static void ordenarMayorMenor(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                
                if (vector[j] < vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
                
            }
        }
    }
    
    public static void elementoRepetido(int[] array) {
        int masRepetido = array[0];
        int maxVeces = 0;

        for (int i = 0; i < array.length; i++) {
            int contador = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador++;
                }
            }

            if (contador > maxVeces) {
                maxVeces = contador;
                masRepetido = array[i];
            }
        }
        
        System.out.println("El elemento mas repetido en este array es " + masRepetido + " repetido " + maxVeces + " veces.");
    }
    
    public static void mediaArray(int[] array) {
        int suma = 0;
        
        for(int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        
        int media = (int) suma / array.length;
        
        System.out.println("La media total de los elementos del array es " + media);
    }
    
    public static int generarRandom(int min, int max) {
        int random = (int) ((((max - min) + 1) * Math.random()) + min);
        return random;
    }
    
}
