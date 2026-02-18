/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package junit_ejercicioextra2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author tumba
 */
public class SumaNumerosPrimosTest {

    @Test
    public void testSumaPrimos1_cajaNegra() {
        assertEquals(SumaNumerosPrimos.sumaPrimos(11), 28);
    }
    
    @Test
    public void testSumaPrimos2_cajaNegra() {
        assertEquals(SumaNumerosPrimos.sumaPrimos(10), 18);
    }
    
}
