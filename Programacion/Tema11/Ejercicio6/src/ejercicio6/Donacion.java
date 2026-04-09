/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class Donacion {
    
    // Atributos
    
    private String nombre;
    private float cantidad;
    
    //Constructores
    public Donacion() {
        nombre = "";
        cantidad = 0f;
    }

    public Donacion(String nombrePersona, float cantidad) {
        this.nombre = nombrePersona;
        this.cantidad = cantidad;
    }
    
    // GEtters y setters

    public float getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // toString()

    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
}
