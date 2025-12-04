/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {
    
    private String grupo;

    // Definimos los constructores de esta clase
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    public Alumno() {
        super();
        this.grupo = "";
    }

    // Defino los getters y los setters
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }    

    // Sobreescribo el metodo saludar de persona
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + getNombre() + " y estoy en el grupo de " + grupo + ".";
    }
    
}
