/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Set;

/**
 *
 * @author alumno
 */
public class Persona implements Transformable {
    
    private String nombre, apellido, apodo;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.apodo = "";
    }

    public Persona(String nombre, String apellido, String apodo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", apodo=" + apodo + '}';
    }

    @Override
    public String concadenarTodo() {
        return nombre + "#" + apellido +  "#" + apodo;
    }

    @Override
    public String obtenerIniciales() {
        return nombre.charAt(0) + " " + apellido.charAt(0) + " " + apodo.charAt(0);
    }

    @Override
    public int contarVocales() {
        return contarVocalesString(nombre) + contarVocalesString(apellido) + contarVocalesString(apodo);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        if(nombre.length() > apellido.length() && nombre.length() > apodo.length()) {
            return nombre;
        } else if(apellido.length() > nombre.length() && apellido.length() > apodo.length()) {
            return apellido;
        } else {
            return apodo;
        }
    }

    @Override
    public boolean buscarCadena(String s) {
        return nombre.equalsIgnoreCase(s) || apellido.equalsIgnoreCase(s) || apodo.equalsIgnoreCase(s);
    }
    
    public int contarVocalesString(String s) {
        int vocales = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(0));
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        
        return vocales;
    }
    
}
