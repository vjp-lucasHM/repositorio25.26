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
    private Socio[] socios;
    
    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0F;
        this.socios = new Socio[3];
    }
    
    public Pelicula(String titulo, double costeLicencia, Socio[] vistas) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = new Socio[3];
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

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", costeLicencia=" + costeLicencia + ", socios=" + socios + '}';
    }
    
    public void mostrarSocios() {
        for(Socio socio : socios) {
            System.out.println(socio.toString());
        }
    }
    
}
