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
public class ProductoFresco extends Producto {
    
    private String fechaEnvasado, paisOrigen;

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

    @Override
    public String toString() {
        return "ProductoFresco{" + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    
}
