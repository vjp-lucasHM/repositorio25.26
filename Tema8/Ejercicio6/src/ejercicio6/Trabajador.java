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
    
    private String nombre;
    private int numHoras;
    private double tarifa;

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

    public String getNombre() {
        return nombre;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", numHoras=" + numHoras + ", tarifa=" + tarifa + '}';
    }
    
    public static void mostrarSueldo(Trabajador trabajador) {
        double sueldo = 0D;
        if(trabajador.getNumHoras() > 40) {
            sueldo += trabajador.getTarifa()*40;
            sueldo += (trabajador.getTarifa() * 1.5)*(trabajador.getNumHoras()-40);
        } else {
            sueldo += trabajador.getTarifa()*trabajador.getNumHoras();
        }
        
        System.out.println(trabajador.getNombre() + " trabajo " + trabajador.getNumHoras() + ", cobra " + trabajador.getTarifa() + " la hora por lo que le corresponde un sueldo de " + sueldo + " euros.");
    }
    
}
