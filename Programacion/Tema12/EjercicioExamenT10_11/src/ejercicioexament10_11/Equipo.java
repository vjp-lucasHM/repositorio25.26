/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexament10_11;

/**
 *
 * @author alumno
 */
public class Equipo implements Comparable<Equipo>{
    
    // Atributos
    private String codigo;
    private String nombre;
    private int trofeosGanados;
    
    // Constructores

    public Equipo() {
        this.codigo = "";
        this.nombre = "";
        this.trofeosGanados = 0;
    }

    public Equipo(String codigo, String nombre, int trofeosGanados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.trofeosGanados = trofeosGanados;
    }
    
    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTrofeosGanados() {
        return trofeosGanados;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTrofeosGanados(int trofeosGanados) {
        this.trofeosGanados = trofeosGanados;
    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", trofeosGanados=" + trofeosGanados + '}';
    }

    @Override
    public int compareTo(Equipo o) {
        if(this.getTrofeosGanados() > o.getTrofeosGanados()) {
            return 1;
        } else if(this.getTrofeosGanados() == o.getTrofeosGanados()) {
            return 0;
        } else {
            return -1;
        }
    }
    
}
