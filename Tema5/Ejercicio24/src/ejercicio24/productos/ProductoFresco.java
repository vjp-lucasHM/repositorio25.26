/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24.productos;

import ejercicio24.Producto;

/**
 *
 * @author tumba
 */

// Creamos otra subclase de Producto, en este caso, ProductoFresco
public class ProductoFresco extends Producto {
    
    // Definimos los atributos necesarios para esta clase.
    private String fechaEnvasado, paisOrigen;

    // Definimos los constructores necesarios
    public ProductoFresco() {
        this.fechaEnvasado = "";
        this.paisOrigen = "";
    }

    public ProductoFresco(String fechaEnvasado, String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    
    // Definimos los getters y los setters necesarios
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
    // Definimos el metodo toString para imprimir las instancias de esta clase a consola.
    @Override
    public String toString() {
        return "ProductoFresco{" + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    
}
