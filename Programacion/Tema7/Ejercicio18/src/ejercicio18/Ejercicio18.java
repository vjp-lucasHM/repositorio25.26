/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author tumba
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        
        rellenarArray(arr1);
        rellenarArray(arr2);
        
        int[] arrayOrdenado = unirYOrdenar(arr1,arr2);
        
        System.out.println("Primer array:");
        mostrarArray(arr1);
        System.out.println("Segundo array:");
        mostrarArray(arr2);
        System.out.println("Array combinado y ordenado");
        mostrarArray(arrayOrdenado);
        
    }

    public static int[] unirYOrdenar(int[] a, int[] b) {
        int[] resultado = new int[10];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            resultado[i + a.length] = b[i];
        }

        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    int aux = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = aux;
                }
            }
        }

        return resultado;
    }
    
    public static void mostrarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
    
    public static void rellenarArray(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = generarRandom(0, 25);
        }
    }
    
    public static int generarRandom(int min, int max) {
        int random = (int) ((((max-min)+1)*Math.random())+min);
        return random;
    }

}
