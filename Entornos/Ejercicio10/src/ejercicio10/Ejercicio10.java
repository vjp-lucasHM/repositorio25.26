/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void rellenarArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int random = (int) Math.random()*9;
            vector[i] = random;
        }
    }
    
    public static void mostrarArray(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+ "");
        }
    }
    
    public static void convertirRepetidosA0(int[] vector) {
        boolean repetido = false;
        
        for(int i = 0; i < vector.length; i++) {
            for(int j = i + 1; j < vector.length; j++) {
                if(vector[i] == vector[j]) {
                    vector[j] = 0;
                    repetido = true;
                }
            }
            
            if(repetido == true) {
                vector[i] = 0;
                repetido = false;
            }
        }
    }
    
}
