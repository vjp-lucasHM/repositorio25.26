/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Campania {
    
    // Atributos
    
    private Set<Donacion> donaciones;
    private String nombre;
    
    // Constructores

    public Campania() {
        this.donaciones = new HashSet<>();
        this.nombre = "";
    }

    public Campania(Set<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }
    
    // Getters y setters

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    
    // Metodos
    
    public void aniadirDonacion() {
        String nombre = pedirNombre();
        float cantidad = pedirCantidad();
        donaciones.add(new Donacion(nombre, cantidad));
    }
    
    public void mostrarDonaciones() {
        if(donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            for(Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public void buscarPorNombre() {
        String nombreBuscado = nombreABuscar();
        
        boolean encontrado = false;
        
        for (Donacion dona : donaciones) {
            if(dona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La cantidad es de " + dona.getCantidad());
                encontrado = true;
            }
        }
        
        if(!encontrado) {
            System.out.println("No existe ninguna donacion con ese nombre");
        }
    }
    
    public float totalRecaudado() {
        float total = 0;
        for(Donacion dona : donaciones) {
            total += dona.getCantidad();
        }
        return total;
    }
    
    public void ordenarDonaciones() {
        System.out.println();
        if(donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            //Convierto el conjunto en un array para poder ordenarlo
            Donacion[] vDonacion = new Donacion[donaciones.size()];
            
            //Se llena el array con los elementos de la colección
            donaciones.toArray(vDonacion);
            
            //Ordenación de mayor a menor
            for(int i = 1; i < vDonacion.length; i++) {
                Donacion actual = vDonacion[i];
                int j = i - 1;
                
                //Desplazar los elementos menores hacia la derecha
                while(j >= 0 && vDonacion[j].getCantidad() < actual.getCantidad()) {
                    vDonacion[j + 1] = vDonacion[j];
                    j--;
                }
                //Insertar la donacion en su posicion correcta
                vDonacion[j + 1] = actual;
            }
            System.out.print("--DONACIONES ORDENADAS--\n");
            for(int i = 0; i < vDonacion.length; i++) {
                System.out.println(vDonacion[i].toString());
            }
        }
    }
    
    public String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del donante: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    
    public float pedirCantidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad a donar: ");
        float cantidad = scanner.nextFloat();
        return cantidad;
    }
    
    public String nombreABuscar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre a buscar: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    
    // toString()

    @Override
    public String toString() {
        return "Campania{" + "donaciones=" + donaciones + ", nombre=" + nombre + '}';
    }
    
    
    
}
