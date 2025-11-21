/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio24;

import ejercicio24.productos.*;

/**
 *
 * @author Lucas
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoCongelado congelado = new ProductoCongelado(15, "21/11/2025", 15);
        ProductoFresco fresco = new ProductoFresco("16/10/2025", "España", "21/11/2025", 15);
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("SDIFU&6", "21/11/2025", 15);
        
        System.out.println(congelado);
        System.out.println(fresco);
        System.out.println(refrigerado);
    }

}
