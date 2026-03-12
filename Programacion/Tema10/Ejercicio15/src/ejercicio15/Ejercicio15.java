/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        ArrayList<Empresa> empresas = new ArrayList<>();
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1 -> introducirEmpresas(empresas);
                case 2 -> mostrarEmpresas(empresas);
                case 3 -> mostrarEmpleadosConA(empresas);
                case 4 -> ordenarEmpleadosSueldo(empresas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida!");
            }
        } while(opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("--- Menu de opciones ---");
        System.out.println("1. - Introducir empresas y empleados.");
        System.out.println("2. - Mostrar empresas y empleados.");
        System.out.println("3. - Mostrar empleados cuyo nombre contiene A");
        System.out.println("4. - Mostrar empleados ordenador por sueldo");
        System.out.println("5. - Salir del programa");
    }
    
    public static void introducirEmpresas(ArrayList<Empresa> listaEmpresas) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce el nombre de la empresa");
            String nombre = entrada.nextLine();
            
            Empresa empresa = new Empresa(nombre);
            empresa.introducirEmpleado();
            
            listaEmpresas.add(empresa);

            System.out.print("Quieres añadir mas empresas a la lista? (s/n)");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }
    
    public static void mostrarEmpresas(ArrayList<Empresa> empresas) {
        if(empresas.isEmpty()) {
            System.out.println("No hay ninguna empresa registrada.");
        } else {
            System.out.println("--- Lista de empresas ---");
            for(Empresa em : empresas) {
                em.mostrarEmpleados();
            }
        }
    }
    
    public static void mostrarEmpleadosConA(ArrayList<Empresa> empresas) {
        for(Empresa em : empresas) {
            boolean encontrado = false;
            
            for(Empleado emp : em.getEmpleados()) {
                if(emp.getNombre().toLowerCase().contains("a")) {
                    System.out.println(" - " + emp.getNombre());
                }
            }
            
            if(!encontrado) {
                System.out.println("No se encontró ningun empleado cuyo nombre contenga A");
            }
        }
    }
    
    public static void ordenarEmpleadosSueldo(ArrayList<Empresa> empresas) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        for(Empresa e : empresas) {
            for(Empleado em : e.getEmpleados()) {
                empleados.add(em);
            }
        }
        
        if(empleados.isEmpty()) {
            System.out.println("No hay ningún empleado en la lista dada.");
        } else {
            for(int i = 0; i < empresas.size() - 1; i++) {
                for(int j = i+1; j < empresas.size(); j++) {
                    if(empleados.get(j).getSueldo() > empleados.get(i).getSueldo()) {
                        Empleado aux = empleados.get(i);
                        empleados.set(i, empleados.get(j));
                        empleados.set(j, aux);
                    }
                }
            }
            
            System.out.println("Empleados ordenados por sueldo:");
            
            for(Empleado e : empleados) {
                System.out.println(e.toString());
            }
        }
    }
}
