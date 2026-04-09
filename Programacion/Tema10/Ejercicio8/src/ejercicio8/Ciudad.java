/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author tumba
 */
public class Ciudad {
    
    // Atributos
    
    private String nombre;
    private Set<Sede> sedes;
    
    //Constructores
    
    public Ciudad() {
        nombre = "";
        sedes = new HashSet<>();
    }

    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new HashSet<>();
    }
    
    //Getters/Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    
    // Metodos
    
    public void aniadirSede() {
        String nombreSede = pedirNombreSede();
        Double ingresos = pedirIngresosSede();
        sedes.add(new Sede(nombreSede, ingresos));
    }
    
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (Sede sede : sedes) {
                System.out.println(sede.toString());
            }
        }
    }
    
    public double ingresosMedios() {
        double total = 0;
        for (Sede sede : sedes) {
            total += sede.getIngresos();
        }
        return total / sedes.size();
    }
    
    public void mostrarSedeSuperioresMedia() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            double media = ingresosMedios();
            System.out.println("La media de los ingresos es: " + media);

            boolean alguna = false;

            for (Sede sede : sedes) {
                if (sede.getIngresos() > media) {
                    System.out.println(" -" + sede.getNombreSede() + "\n -" + sede.getIngresos());
                    alguna = true;
                }
            }
            if (!alguna) {
                System.out.println("Ninguna sede supera la media");
            }
        }
    }
    
    public boolean buscarSede(String nombreSede) {
        boolean encontrado = false;

        for (Sede sede : sedes) {
            if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public String pedirNombreSede() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la sede: ");
        String nombreSede = scanner.nextLine();
        return nombreSede;
    }

    public Double pedirIngresosSede() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        Double ingresos = scanner.nextDouble();
        return ingresos;
    }
    
    // toString

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
    
    
    
}
