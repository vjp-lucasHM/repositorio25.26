/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona {
    
    private String especialidad;

    // Defino el constructor de profesor
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    // Esto es para devolver el saludo del profesor
    public String saludar() {
        return "Hola, soy el profesor " + getNombre() + " y soy de la especialidad de " + especialidad + ".";
    }
    
}
