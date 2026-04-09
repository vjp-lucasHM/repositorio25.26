/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author tumba
 */
public class Sede {
    
    // Atributos
    
    private String nombreSede;
    private double ingresos;
    
    //Constructores
    
    public Sede() {
        nombreSede = "";
        ingresos = 0;
    }

    public Sede(String nombreSede, double ingresos) {
        this.nombreSede = nombreSede;
        this.ingresos = ingresos;
    }
    
    // Getters y setters
    
    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    // toString

    @Override
    public String toString() {
        return "Sede{" + "nombreSede=" + nombreSede + ", ingresos=" + ingresos + '}';
    }
    
    
}
