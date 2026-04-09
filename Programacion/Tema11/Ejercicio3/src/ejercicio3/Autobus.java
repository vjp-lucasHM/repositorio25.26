/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Autobus {
    
    // Atributos
    
    private String matricula;
    private Map<String, String> conductores;
    
    // Constructores
    public Autobus() {
        matricula = "";
        conductores = new HashMap<>();
    }

    public Autobus(String matricula, Map<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    
    public Autobus(String matricula) {
        this.matricula = matricula;
        conductores = new HashMap<>();
    }
    
    // Getters y setters

    public Map<String, String> getConductores() {
        return conductores;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setConductores(Map<String, String> conductores) {
        this.conductores = conductores;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // Metodos
    
    public void addConductor(String dni, String nombre) {
        conductores.put(dni, nombre);
    }
    
    // toString

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }
    
    
    
}
