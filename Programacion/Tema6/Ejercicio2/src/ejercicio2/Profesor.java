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

    public Profesor() {
        super();
        this.especialidad ="";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Sobreescribo el metodo saludar de persona
    public String saludar() {
        return "Hola, soy el profesor " + getNombre() + " y soy de la especialidad de " + especialidad + ".";
    }
    
}
