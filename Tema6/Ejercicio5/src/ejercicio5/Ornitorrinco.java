/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author tumba
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    
    private int numHuevos;
    
    public Ornitorrinco() {
        super();
        this.numHuevos = 0;
    }

    public Ornitorrinco(int numHuevos, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.numHuevos = numHuevos;
    }

    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }
    
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamifero oviparo";
    }

    @Override
    public void ponerHuevo() {
        numHuevos++;
    }

    @Override
    public void incubarHuevo() {
        numHuevos--;
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Numero total de huevos del ornitorrinco:" + this.numHuevos);
    }

    @Override
    public String toString() {
        return super.toString() + "Ornitorrinco{" + "numHuevos=" + numHuevos + '}';
    }
    
    
    
}
