/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    rellenarTemperaturas(lista, meses);
                    break;
                case 2:
                    mostrarTemperaturas(lista, meses);
                    break;
                case 3:
                    mostrarTemperaturaMedia(lista);
                    break;
                case 4:
                    diasMasCalurosos(lista, meses);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida! Intentalo den uevo");
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
    }
    
    public static void rellenarTemperaturas(ArrayList<Integer> lista, String[] meses){
        Scanner entrada = new Scanner(System.in);
        lista.clear();
        System.out.println("Introduce las temperaturas de cada uno de los 12 meses del año: ");
        
        for(int i = 0; i < 12; i++){
            System.out.print("Temperatura del mes de " + meses[i] + ": ");
            int valor = entrada.nextInt();
            lista.add(valor);
        }
    }

    public static void mostrarTemperaturas(ArrayList<Integer> lista, String[] meses) {
        if(lista.size() != 12) {
            System.out.println("Introduce todas las temperaturas primero.");
        } else {
            for(int i = 0; i < lista.size(); i++) {
                System.out.println(meses[i] + ": " + lista.get(i));
            }
        }
    }

    public static void mostrarTemperaturaMedia(ArrayList<Integer> lista) {
        int suma = 0;

        for (int num : lista) {
            suma += num;
        }

        suma /= 12;

        System.out.println("La temperatura media de este año ha sido de " + suma);
    }

    public static void diasMasCalurosos(ArrayList<Integer> lista, String[] meses) {
        if (lista.size() != 12) {
            System.out.println("Introduce todas las temperaturas primero.");
        } else {
            int mayor = lista.get(0);

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) > mayor) {
                    mayor = lista.get(i);
                }
            }

            System.out.println("Mes o meses mas calurosos (" + mayor + "):");

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == mayor) {
                    System.out.println(meses[i]);
                }
            }
        }
    }

}
