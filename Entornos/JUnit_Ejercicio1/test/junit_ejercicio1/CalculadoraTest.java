/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package junit_ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumno
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(15,calc.suma());
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(2,calc.resta());
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(50,calc.multiplicacion());
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora(10, 5);
        assertEquals(2,calc.division());
    }
    
}
