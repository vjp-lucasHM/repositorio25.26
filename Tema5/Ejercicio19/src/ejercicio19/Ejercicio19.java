/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- EMPLEADO 1 ---");
        Empleado empleado1 = pedirInfoEmpleado();
        
        System.out.println("--- EMPLEADO 2 ---");
        Empleado empleado2 = pedirInfoEmpleado();
        
        System.out.println("--- EMPLEADO 3 ---");
        Empleado empleado3 = pedirInfoEmpleado();
        
        System.out.println("El sueldo bruto de " + empleado1.getNombre() + " por trabajar " + empleado1.getHoras() + " horas es un total de " + empleado1.getTarifa() + " euros");
        System.out.println("El sueldo bruto de " + empleado2.getNombre() + " por trabajar " + empleado2.getHoras() + " horas es un total de " + empleado2.getTarifa() + " euros");
        System.out.println("El sueldo bruto de " + empleado3.getNombre() + " por trabajar " + empleado3.getHoras() + " horas es un total de " + empleado3.getTarifa() + " euros");
    }
    
    public static Empleado pedirInfoEmpleado() {
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        int horas, tarifa;
        
        System.out.println("Por favor, introduce el nombre del empleado");
        nombre = scanner.nextLine();
        
        System.out.println("Por favor, introduce el numero de horas de este empleado:");
        horas = scanner.nextInt();
        
        System.out.println("Por favor, introduce la tarifa de este empleado.");
        tarifa = scanner.nextInt();
        
        return new Empleado(nombre, horas, tarifa);
    }
    
}
