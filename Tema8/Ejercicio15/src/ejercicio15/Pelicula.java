/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author tumba
 */
public class Pelicula {
    
    private String titulo;
    private double costeLicencia;
    private Socio[] vistas;
    
    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0F;
        this.vistas = new Socio[3];
    }
    
    public Pelicula(String titulo, double costeLicencia, Socio[] vistas) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.vistas = new Socio[3];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socio[] getVistas() {
        return vistas;
    }

    public void setVistas(Socio[] vistas) {
        this.vistas = vistas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", costeLicencia=" + costeLicencia + ", vistas=" + vistas + '}';
    }
    
    
    
}
