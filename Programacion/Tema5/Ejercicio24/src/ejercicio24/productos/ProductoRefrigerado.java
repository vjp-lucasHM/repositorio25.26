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

// Creamos la ultima subclase de Producto, en este caso ProductoRefrigerado
public class ProductoRefrigerado extends Producto {

    // Definimos el atributo necesario para esta clase
    private String codigoOrganismo;

    // Creamos los constructores necesarios para esta clase.
    public ProductoRefrigerado() {
        super();
        this.codigoOrganismo = "";
    }

    public ProductoRefrigerado(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public ProductoRefrigerado(String codigoOrganismo, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    // Definimos los getters y los setters para la clase
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    // Escribimos el metodo toString para luego imprimir las instancias de este objeto a consola.
    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "codigoOrganismo=" + codigoOrganismo + '}';
    }
    
}
