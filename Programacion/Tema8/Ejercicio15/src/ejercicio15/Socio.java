/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author tumba
 */
public class Socio {
    
    private String nombre;
    private float precioAbonado;

    public Socio() {
        this.nombre = "";
        this.precioAbonado = 0F;
    }

    public Socio(String nombre, float precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecioAbonado() {
        return precioAbonado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioAbonado(float precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", precioAbonado=" + precioAbonado + '}';
    }
    
    
    
}
