/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package etdl_examen;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class codigoTest {
    
    public codigoTest() {
    }

    /**
     * Test of ordenarPorSeleccion method, of class codigo.
     */
    @Test
    public void testOrdenarPorSeleccion_cajaNegra() {
        assertTrue(codigo.ordenarPorSeleccion(new int[]{1,2,3,4,5,6,7,8,9,10}));
        assertEquals(false, codigo.ordenarPorSeleccion(new int[]{1,3,2,5,4,7,6,9,8,10}));
    }
    
    @Test
    public void testOrdenarPorSeleccion_cajaBlanca() {
        assertTrue(codigo.ordenarPorSeleccion(new int[]{1,2,3,4,5,6,7,8,9,10})); // 1 - 2 - 3 - 7 - 8 - 2 - 9 (Lista ordenada)
        assertTrue(codigo.ordenarPorSeleccion(new int[]{}));                     // 1 - 2 - 8 - 2 - 9 (Lista vacia)
        assertTrue(codigo.ordenarPorSeleccion(new int[]{1,2}));                  // 1 - 2 - 3 - 7 - 8 - 2 - 9 (Lista de 2 elementos ordenada)
        assertTrue(codigo.ordenarPorSeleccion(new int[]{0,1}));                  // 1 - 2 - 3 - 4 - 6 - 7 - 8 - 2 - 9 (Lista de 2 elementos sin ordenar)
    }
    
}
