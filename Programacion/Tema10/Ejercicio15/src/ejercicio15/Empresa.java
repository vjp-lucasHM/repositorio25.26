/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Empresa {
    
    // Atributos
    
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    // Constructores
    
    public Empresa() {
        this.nombre = "";
        this.empleados = new ArrayList<>();
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleado> empleados) {
        this.nombre = nombreEmpresa;
        this.empleados = empleados;
    }
    
    public Empresa(String nombreEmpresa) {
        this.nombre = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    // Getters/Setters
    
    public String getNombreEmpresa() {
        return this.nombre;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombre = nombreEmpresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    // Metodos
    
    public void introducirEmpleado() {
        
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce el nombre del empleado.");
            String nombre = scanner.nextLine();
            
            int sueldo = scanner.nextInt();
            scanner.nextLine();
            
            empleados.add(new Empleado(nombre,sueldo));
            
            System.out.println("Deseas introducir mas empleados? (s/n)");
            respuesta = scanner.nextLine();
        } while(respuesta.equalsIgnoreCase("s"));
    }
    
    public void mostrarEmpleados() {
        System.out.println("Empleados de la empresa " + this.nombre);
        
        if(this.empleados.isEmpty()) {
            System.out.println("No hay ningun empleado registrado en esta empresa.");
        } else {
            for(Empleado e : this.empleados) {
                System.out.println(e.toString());
            }
        }
    }
    
    public static void empleadosOrdenados(ArrayList<Empleado> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay ningun empleado registrado");
        } else {
            for (int i = 0; i < listaEmpleados.size() - 1; i++) {
                for (int j = i + 1; j < listaEmpleados.size(); j++) {
                    //Si el sueldo del empleado j es mayor que el de i, se intercambian
                    if (listaEmpleados.get(j).getSueldo() > listaEmpleados.get(i).getSueldo()) {
                        Empleado aux = listaEmpleados.get(i);
                        listaEmpleados.set(i, listaEmpleados.get(j));
                        listaEmpleados.set(j, aux);
                    }
                }
            }
            //Se muestra la lista ya ordenada
            System.out.println("\n--Empleados ordenados por sueldo--");
            for (Empleado emple : listaEmpleados) {
                System.out.println(emple.toString());
            }
        }
    }
    
}
