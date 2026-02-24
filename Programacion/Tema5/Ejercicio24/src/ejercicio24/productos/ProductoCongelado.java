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

// Creamos una subclase de Producto
public class ProductoCongelado extends Producto {
    
    // Creamos los atributos necesarios
    private int temperaturaRecomendada;

    // Creamos los diferentes constructores que necesitemos.
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

    // Definimos los getters y los setters de los atributos definidos.
    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    // Hacemos el metodo toString para luego imprimir los objetos a consola.
    @Override
    public String toString() {
        return "ProductoCongelado{" + "temperaturaRecomendada=" + temperaturaRecomendada + '}';
    }
    
}
