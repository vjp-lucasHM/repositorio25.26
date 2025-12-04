/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora suma = new Suma(19, 6);
        Calculadora multiplicacion = new Multiplicacion(7, 3);
        Calculadora potencia = new Potencia(7, 2);

        // Aquí invocamos el método de cada objeto
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
    }
    
}
