/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author tumba
 */
public class Dia {
    
    private String nombreDia;
    private int temperatura;
    
    public Dia() {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    
    public String getNombreDia() {
        return this.nombreDia;
    }
    
    public int getTemperatura() {
        return this.temperatura;
    }
    
    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }
    
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
}
