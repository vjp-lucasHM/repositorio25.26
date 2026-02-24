/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author tumba
 */
public class Producto {
    
    // Definimos todos los atributos de la clase
    private String fechaCaducidad;
    private int numeroLote;

    // Definimos los constructores de esta clase, ya sean por defecto o parametrizados.
    public Producto() {
        this.fechaCaducidad =  "";
        this.numeroLote = 0;
    }

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    // Definimos los getters y los setters
    public int getNumeroLote() {
        return numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    // Sobreescribimos el metodo toString por defecto para luego imprimir los objetos instanciados a consola.
    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + '}';
    }
    
}
