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
public class ProductoCongelado extends Producto {
    
    private int temperaturaRecomendada;

    public ProductoCongelado() {
        super();
        this.temperaturaRecomendada = 0;
    }

    public ProductoCongelado(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public ProductoCongelado(int temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "temperaturaRecomendada=" + temperaturaRecomendada + '}';
    }
    
}
