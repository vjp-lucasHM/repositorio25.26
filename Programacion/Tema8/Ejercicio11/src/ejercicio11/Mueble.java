/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author alumno
 */
public class Mueble {
    
    private String descripcion;
    private double precio;

    public Mueble() {
        this.descripcion = "";
        this.precio = 0D;
    }

    public Mueble(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Mueble{" + "descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    
}