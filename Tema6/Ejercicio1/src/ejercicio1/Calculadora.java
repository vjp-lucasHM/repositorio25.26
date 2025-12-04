/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    
    // Definimos la variable necesaria, constructores, y getter y setter
    private int numero;

    public Calculadora() {
        this.numero = 0;
    }

    public Calculadora(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    // Defino el metodo abstracto que todas las clases hijas heredaran
    public abstract void realizarOperacion();
    
}
