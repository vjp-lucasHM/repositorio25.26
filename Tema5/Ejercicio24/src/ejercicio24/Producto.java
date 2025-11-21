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
    
    private String fechaCaducidad;
    private int numeroLote;

    public Producto() {
        this.fechaCaducidad =  "";
        this.numeroLote = 0;
    }

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

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

    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + '}';
    }
    
}
