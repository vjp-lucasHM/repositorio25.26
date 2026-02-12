/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junit_ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CuentaTest {
    
    Cuenta cuenta;
    
    public CuentaTest() {
        this.cuenta = new Cuenta("Lucas", 200D);
    }

    /**
     * Test of ingresar method, of class Cuenta.
     */
    @Test
    public void testIngresar() {
        assertEquals(this.cuenta.ingresar(-200D), this.cuenta.getCantidad(), 0D);
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        cuenta.retirar(40.0);
        assertEquals(160.0, cuenta.getCantidad() , 0);
    }

    /**
     * Test of toString method, of class Cuenta.
     */
    @Test
    public void testToString() {
        String esperado = "Cuenta={titular=Lucas, cantidad=200.0}";
        assertEquals(esperado, this.cuenta.toString());
    }
}
