/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author tumba
 */
public class Empleado {
    
    private String nombre;
    private int horas;
    private int tarifa;
    
    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    
    public Empleado(String nombre, int horas, int tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
