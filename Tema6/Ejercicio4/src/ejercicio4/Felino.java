/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */
public abstract class Felino extends Animal {
    // Defino los constructores de Felino
    
    public Felino() {
        super();
    }

    public Felino(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String toString() {
        return "Felino{" + super.toString() + '}';
    }
    
    
}
