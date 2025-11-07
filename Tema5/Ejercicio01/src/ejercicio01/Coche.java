/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Coche {
    
    private String marca;
    private String color;
    private String modelo;
    private int velocidad;
    private boolean motorEncendido = false;
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }
    
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche() {
        velocidad += 20;
    }
    
    public void frenarCoche() {
        velocidad -= 6;
    }
    
    public void obtenerEstado() {
        System.out.println("--- ESTADO DEL COCHE ---");
        System.out.println("La marca es " + marca);
        System.out.println("El color es " + color);
        System.out.println("El modelo es " + modelo);
        System.out.println("La velocidad es " + velocidad);
        System.out.println("El motor" + (motorEncendido ? "" : " no") + " esta encendido");
    }
    
}
