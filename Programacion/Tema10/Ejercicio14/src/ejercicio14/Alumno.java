/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    // Atributos
    
    private String nombre;
    private Asignatura[] asignaturas;

    // Constructores
    
    public Alumno() {
        this.nombre = "";
        this.asignaturas = new Asignatura[3];
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[3];
    }
    
    // Getters y setters

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
    
    // Métodos
    
    public float calcularMeida() {
        float suma = 0;
        
        for(Asignatura a : asignaturas) {
            suma += a.getNota();
        }
        
        return suma / asignaturas.length;
    }
    
    public void rellenarNotas(String[] asig) {
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < asig.length; i++) {
            System.out.print("Introduce la nota de " + asig[i] + ": ");
            float nota = entrada.nextFloat();
            asignaturas[i] = new Asignatura(asig[i], nota);
        }
    }
    
    public float getNotaPorPosicion(int pos) {
        return asignaturas[pos].getNota();
    }
    
    // Mostrar

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }
    
}
