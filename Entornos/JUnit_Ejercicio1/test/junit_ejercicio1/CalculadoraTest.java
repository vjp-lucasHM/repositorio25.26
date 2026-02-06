/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junit_ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CalculadoraTest {
   
        /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(13,calc.suma(), 2f);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(5,calc.resta(), 0f);
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(50,calc.multiplicacion(), 0f);
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(2,calc.division(), 0f);

    }
 
}
