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
    
    // Definimos los atributos
    private String nombre;
    private int horas;
    private int tarifa;
    
    
    // Constructores
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

    
    // Getters y setters
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
    
    //Metodo de calcular el sueldo de cada empleado
    public double calcularSueldo() {
        if(horas <= 40) {
            return horas*tarifa;
        } else {
            double sueldo = 0D;
            
            horas -= 40;
            sueldo += 40*tarifa;
            sueldo += horas*(tarifa*1.5);
            
            return sueldo;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + '}';
    }
    
}
