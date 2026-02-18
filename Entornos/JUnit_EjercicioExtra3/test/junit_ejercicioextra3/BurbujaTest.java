/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package junit_ejercicioextra3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author tumba
 */
public class BurbujaTest {
    
    public BurbujaTest() {
    }

    /**
     * Test of burbuja method, of class Burbuja.
     */
    @Test
    public void testBurbujaOrdenado_cajaNegra() {
        assertEquals(Burbuja.burbuja(new int[]{1,2,3,4,5,6,7,8,9,10}), true);
    }
    
    @Test
    public void testBurbujaDesordenado_cajaNegra() {
        assertEquals(Burbuja.burbuja(new int[]{2,1,3,6,5,4,7,8,10,9}), false);
    }
    
}
