/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6;

/**
 *
 * @author alumno
 */
public class Coche {
    
    // Atributos
    private String titular;
    private String matricula;

    // Constructores
    public Coche() {
        this.titular = "";
        this.matricula = "";
    }

    public Coche(String titular, String matricula) {
        this.titular = titular;
        this.matricula = matricula;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getTitular() {
        return titular;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Este será el método que usaremos para mostrar cualquier instancia del objeto por consola
    @Override
    public String toString() {
        return "Coche{" + "titular=" + titular + ", matricula=" + matricula + '}';
    }
    
}
