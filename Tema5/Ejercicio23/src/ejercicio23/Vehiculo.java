/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author tumba
 */
public class Vehiculo {
    
    private String matricula;
    private String modelo;
    private int potenciaCv;

    public Vehiculo() {
        this.matricula = "";
        this.modelo = "";
        this.potenciaCv = 0;
    }

    public Vehiculo(String matricula, String modelo, int potenciaCv) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCv = potenciaCv;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", potenciaCv=" + potenciaCv + '}';
    }
    
    
    
}
