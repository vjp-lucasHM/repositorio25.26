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
public class ProductoRefrigerado extends Producto {

    private String codigoOrganismo;

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

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "codigoOrganismo=" + codigoOrganismo + '}';
    }
    
}
