/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio6 {

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
            
            switch(opcion) {
                case 1:
                    rellenarVentas(lista);
                    break;
                case 2:
                    mostrarVentas(lista,meses);
                    break;
                case 3:
                    mostrarVentasInverso(lista,meses);
                    break;
                case 4:
                    sumarVentas(lista);
                    break;
                case 5:
                    ventasMesesA(lista,meses);
                    break;
                case 6:
                    mesConMasVentas(lista,meses);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default: 
                    System.out.println("Opcion invalida! Intentalo de nuevo.");
            }
        } while(opcion != 7);
    }
    
    public static void rellenarVentas(ArrayList<Integer> ventas){
        Scanner entrada = new Scanner(System.in);
        ventas.clear();
        System.out.println("Introduce las ventas de coches de cada uno de los 12 meses del año: ");
        
        for(int i = 0; i < 12; i++){
            System.out.print("Ventas del mes nº" + (i+1) + ": ");
            int valor = entrada.nextInt();
            ventas.add(valor);
        }
    }
    
    public static void mostrarVentas(ArrayList<Integer> ventas, String[] meses){
        if(ventas.size() != 12){
            System.out.println("Introduce todas las ventas primero");
        } else {
            for(int i = 0; i < 12; i++){
                System.out.println(meses[i] + ": " + ventas.get(i));
            }
        }
    }
    
    public static void mostrarVentasInverso(ArrayList<Integer> ventas, String[] meses){
        if(ventas.size() != 12){
            System.out.println("Introduce todas las ventas primero");
        } else {
            for(int i = ventas.size(); i < 0; i--) {
                System.out.println(meses[i] + ": " + ventas.get(i));
            }
        }
    }
    
    public static void sumarVentas(ArrayList<Integer> lista) {
        int suma = 0;
        
        for(int venta : lista) {
            suma += venta;
        }
        
        System.out.println("La suma total de las ventas de este año es " + suma);
    }
    
    public static void ventasMesesA(ArrayList<Integer> lista, String[] meses) {
        
        if(lista.size() != 12) {
            System.out.println("Introduce todas las ventas primero.");
        } else {
            int suma = 0;
            
            for(int i = 0; i < 12; i++) {
                if(meses[i].toLowerCase().contains("a")) {
                    suma += lista.get(i);
                }
            }
            
            System.out.println("Ventas totales de los meses que contengan 'a' en su nombre: " + suma);
        }
    }
    
    public static void mesConMasVentas(ArrayList<Integer> lista, String[] meses) {
        if(lista.size() != 12) {
            System.out.println("Introduce todas las ventas primero.");
        } else {
            int max = lista.get(0);
            
            for(int venta : lista) {
                if(venta > max) {
                    max = venta;
                }
            }
            
            System.out.println("Mes o meses con mas ventas (" + max + "):");
            
            for(int i = 0; i < lista.size(); i++) {
                if(lista.get(i) == max) {
                    System.out.println(meses[i]);
                }
            }
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("Introducir las ventas de coches de cada uno de los 12 meses del año");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior");
        System.out.println("3. Mostrar las ventas introducidas al revés");
        System.out.println("4. Que muestre la suma total de ventas al año");
        System.out.println("5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra a");
        System.out.println("6. Que muestre el nombre del mes (o meses) con más ventas");
        System.out.println("7. Salir del programa");
    }
    
}
