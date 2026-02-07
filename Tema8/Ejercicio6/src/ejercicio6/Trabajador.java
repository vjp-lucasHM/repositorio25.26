/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class Trabajador {
    
    // en esta clase definiremos todo lo necesario para la clase Trabajador
    
    // atributos
    private String nombre;
    private int numHoras;
    private double tarifa;

    // constructores
    public Trabajador() {
        this.nombre = "";
        this.numHoras = 0;
        this.tarifa = 0D;
    }

    public Trabajador(String nombre, int numHoras, double tarifa) {
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.tarifa = tarifa;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public double getTarifa() {
        return tarifa;
    }

    
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    // toString()
    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", numHoras=" + numHoras + ", tarifa=" + tarifa + '}';
    }
    
    // metodo que usaremos para mostrar el sueldo del trabajador
    public void mostrarSueldo() {
        double sueldo = 0D;
        if(getNumHoras() > 40) {
            sueldo += getTarifa()*40;
            sueldo += (getTarifa() * 1.5)*(getNumHoras()-40);
        } else {
            sueldo += getTarifa()*getNumHoras();
        }
        
        System.out.println(getNombre() + " trabajo " + getNumHoras() + " horas, cobra " + getTarifa() + " la hora por lo que le corresponde un sueldo de " + sueldo + " euros.");
    }
    
}
