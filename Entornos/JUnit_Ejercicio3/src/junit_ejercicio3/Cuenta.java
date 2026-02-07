/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit_ejercicio3;

/**
 *
 * @author alumno
 */
public class Cuenta {
    
    private String titular;
    private double cantidad;

    public Cuenta() {
        this.titular = "";
        this.cantidad = 0D;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double ingresar(double cantidad) {
        if(cantidad > 0) {
            this.cantidad += cantidad;
        }
        
        return this.cantidad;
    }
    
    public double retirar(double cantidad) {
        this.cantidad -= cantidad;
        
        if(this.cantidad < 0) {
            this.cantidad = 0;
        }
        
        return this.cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
}
