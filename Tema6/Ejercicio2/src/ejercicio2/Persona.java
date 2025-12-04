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

    // Constructor: esto es para inicializar el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada subclase debe implementarlo
    public abstract String saludar();
    
}
