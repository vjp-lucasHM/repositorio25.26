/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[5];
        int[] arr = dividirEnCifras(pedirNumero(), numero);
        mostrarArray(arr);
    }

    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean valido = false;

        do {
            System.out.println("Introduce un numero de 5 cifras (10000-99999)");

            try {
                numero = scanner.nextInt();

                if (numero >= 10000 && numero <= 99999) {
                    valido = true;
                    return numero;
                } else {
                    System.out.println("Introduce un numero valido! (10000-99999)");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce un numero valido! (10000-99999)");
            }

        } while (!valido);

        return 0;
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
