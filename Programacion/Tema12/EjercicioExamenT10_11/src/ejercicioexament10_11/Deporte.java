/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexament10_11;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Deporte {
    
    // Atributos
    private String nombre;
    private Set<Equipo> equipos;
    
    // Constructores
    public Deporte() {
        this.nombre = "";
        this.equipos = new HashSet<>();
    }
    
    public Deporte(String nombre) {
        this.nombre = nombre;
        this.equipos = new HashSet<>();
    }

    public Deporte(String nombre, Set<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }
    
    // Getters y setters
    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Deporte{" + "nombre=" + nombre + ", equipos=" + equipos + '}';
    }
    
}
