/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23.vehiculos;

import ejercicio23.Vehiculo;

/**
 *
 * @author tumba
 */
public class Taxi extends Vehiculo {
    
    private int numeroLicencia;

    public Taxi() {
        this.numeroLicencia = 0;
    }

    public Taxi(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Taxi(int numeroLicencia, String matricula, String modelo, int potenciaCv) {
        super(matricula, modelo, potenciaCv);
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    @Override
    public String toString() {
        return "Taxi{" + "numeroLicencia=" + numeroLicencia + '}';
    }
    
}
