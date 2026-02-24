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
    
    // Rellenamos el array con numeros aleatorios 1-9
    public static void rellenarArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int random = (int) Math.random()*9;
            vector[i] = random;
        }
    }
    
    // Metodo usado para mostrar el array en la terminal
    public static void mostrarArray(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+ "");
        }
    }
    
    // Este metodo sera el que usaremos para el objetivo principal del programa: convertir todos los numeros repetidos a 0
    // Hacemos bucles anidados para recorrer el array y comprobamos si el numero en cuestion esta repetido.
    // Si esta repetido, convertimos a 0 el numero repetido y el original
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
