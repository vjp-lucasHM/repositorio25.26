/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    
    // Atributo común
    private String nombre;

    // Defino los constructores de persona
    public Persona() {
        this.nombre = "";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto
    public abstract String saludar();
    
}
