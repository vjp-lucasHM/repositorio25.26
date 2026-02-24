/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */
public abstract class Canido extends Animal {
    // Defino el constructor de Canido
    
    public Canido() {
        super();
    }
    
    public Canido(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String toString() {
        return "Canido{" + super.toString() + '}';
    }
    
    
}
