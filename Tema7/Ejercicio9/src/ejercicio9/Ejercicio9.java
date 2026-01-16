/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[3];
        int[] arr = dividirEnCifras(pedirNumero(), numero);
        mostrarArray(arr);
    }
    
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        do {
            System.out.println("Introduce un numero de 3 cifras (100-999)");

            try {
                int aux = scanner.nextInt();

                if (aux >= 100 && aux <= 999) {
                    valido = true;
                    numero = aux;
                } else {
                    System.out.println("Introduce un numero valido! (100-999)");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce un numero valido! (100-999)");
                scanner.next();
            }

        } while (!valido);

        return numero;
    }
    
    public static int[] dividirEnCifras(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero % 10;
            numero /= 10;
        }

        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
