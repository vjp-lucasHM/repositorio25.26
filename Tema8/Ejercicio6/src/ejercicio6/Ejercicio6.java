/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // preguntamos al usuario cuantos empleados hay para saber el tamaño del vector
        System.out.println("¿Cuantos empleados hay en tu empresa?");
        int num = scanner.nextInt();
        scanner.nextLine(); // limpiamos el buffer
        
        // creamos el vector de trabajadores con el tamaño que nos ha dicho el usuario
        Trabajador[] trabajadores = new Trabajador[num];
        
        // recorremos el vector y lo rellenamos con la informacion de empleados que el usuario quiera
        for(int i = 0; i < trabajadores.length; i++) {
            System.out.println("--- Empleado numero " + i + " ---");
            
            System.out.println("Introduce el nombre del empleado");
            String nombre = scanner.nextLine();
            
            System.out.println("Cual es la tarifa de " + nombre + "?");
            double tarifa = scanner.nextDouble();
            
            System.out.println("Cuantas horas ha trabajado este mes " + nombre + "?");
            int horas = scanner.nextInt();
            
            scanner.nextLine(); // Limpiamos el buffer otra vez
            
            trabajadores[i] = new Trabajador(nombre,horas,tarifa);
            
            // mensaje de feedback para que el usuario sepa que se ha guardado con exito
            System.out.println("Empleado numero " + i + " ha sido guardado");
        }
        
        // mostramos el sueldo correspondiente de todos los trabajadores
        for(Trabajador trabajador : trabajadores) {
            trabajador.mostrarSueldo();
        }
    }
    
    
    
}
