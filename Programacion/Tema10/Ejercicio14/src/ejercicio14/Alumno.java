/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    private String nombre;
    private Asignatura[] asignaturas;

    public Alumno() {
        this.nombre = "";
        this.asignaturas = new Asignatura[3];
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[3];
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }
    
}
