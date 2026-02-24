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
public class Autobus extends Vehiculo {
    
    private int numeroPlazas;

    public Autobus() {
        this.numeroPlazas = 0;
    }

    public Autobus(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Autobus(int numeroPlazas, String matricula, String modelo, int potenciaCv) {
        super(matricula, modelo, potenciaCv);
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public String toString() {
        return "Autobus{" + "numeroPlazas=" + numeroPlazas + '}';
    }
    
    
    
}
