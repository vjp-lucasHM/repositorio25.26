/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        System.out.println("------------ NUMEROS SIN ORDENAR ----------------");
        rellenarMatriz(vector);
        mostrarNumeros(vector);
        System.out.println("------------ NUMEROS ORDENADOS ----------------");
        ordenarMayorMenor(vector);
        mostrarNumeros(vector);
    }

    // Metodo usado para rellenar el vector con numeros aleatorios del 1-10
    public static void rellenarMatriz(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    // Metodo usado para mostrar vectores
    public static void mostrarNumeros(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + "");
        }
    }

    // En este metodo, usamos el metodo de burbuja para ordenar los numeros que están dentro del vector
    // de menor a mayor
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

}
