/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit_ejercicio1;

/**
 *
 * @author alumno
 */
public class Calculadora {

    private double a;
    private double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double suma() {
        return a + b;
    }

    public double resta() {
        return a - b;
    }

    public double multiplicacion() {
        return a * b;
    }

    public double division() {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
