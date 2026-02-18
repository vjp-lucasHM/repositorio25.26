/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junit_ejercicioextra1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author tumba
 */
public class BusquedaBinariaTest {
    
    // Test de un número no encontrado
    @Test
    public void testBusquedaBinaria1_cajaNegra() {
        assertEquals(BusquedaBinaria.busquedaBinaria(33), -1);
    }
    
    @Test
    public void testBusquedaBinaria2_cajaNegra() {
        assertEquals(BusquedaBinaria.busquedaBinaria(1), 0);
    }
    
}
