/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        int[] vector = new int[12];
        
        do {
            mostrarMenu();
            int opcion = pedirOpcion();

            switch (opcion) {
                case 1:
                    rellenarArray(vector);
                    break;
                case 2:
                    mostrarArray(vector);
                    break;
                case 3:
                    mostrarArrayReverse(vector);
                    break;
                case 4:
                    int suma = sumarArray(vector);
                    System.out.println("Las ventas totales de este año son " + suma);
                    break;
                case 5:
                    int sumaMesesPares = sumaVentasMesesPares(vector);
                    System.out.println("Las ventas totales de los meses pares de este año son " + sumaMesesPares);
                    break;
                case 6:
                    System.out.println("El mes con mas ventas de este año es " + mostrarMesConMasVentas(vector));
                    break;
                case 7:
                    exit = true;
                    System.out.println("Gracias por usar el programa...");
                    break;
            }
        } while (!exit);
        
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar un array de 12 posiciones con las ventas de coches mensuales. Estas ventas seran numeros aleatorios entre 20 y 200");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
        System.out.println("3. Mostrar las ventas introducidas al reves.");
        System.out.println("4. Mostrar la suma total de las ventas del año");
        System.out.println("5. Mostrar las ventas totales de los meses pares.");
        System.out.println("6. Mostrar el nombre del mes con mas ventas");
        System.out.println("7. Salir del programa");
    }

    public static int pedirOpcion() {
        boolean valido = false;
        int numero = 0;

        do {
            System.out.println("Introduce una opcion valida! (1-7)");
            Scanner scanner = new Scanner(System.in);

            try {
                int aux = scanner.nextInt();

                if (aux >= 1 && aux <= 7) {
                    numero = aux;
                    valido = true;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida! (1-7)");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }
    
    public static int sumarArray(int[] vector) {
        int suma = 0;
        
        for(int num : vector ){
            suma += num;
        }
        
        return suma;
    }
    
    public static int sumaVentasMesesPares(int[] vector) {
        int suma = 0;
        for(int i = 0; i < vector.length - 1 || (i == 0 || i % 2 == 0); i++) {
            suma += vector[i];
        }
        
        return suma;
    }
    
    public static void rellenarArray(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = generarRandom(20, 200);
        }
    }
    
    public static void mostrarArray(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void mostrarArrayReverse(int[] vector) {
        for(int i = vector.length; i > 0; i--) {
            System.out.println(vector[i - 1]);
        }
    }
    
    public static int generarRandom(int min, int max) {
        int random = (int) ((((max-min)+1)*Math.random())+min);
        return random;
    }
    
    public static String mostrarMesConMasVentas(int[] vector) {
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        int max = vector[0];
        int index = 0;
        
        for(int i = 1; i < vector.length; i++) {
            if(vector[i] > max) {
                index = i;
            }
        }
        
        return meses[index];
    }

}