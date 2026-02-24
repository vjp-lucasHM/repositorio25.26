/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author tumba
 */
public interface ControlRemoteable {
    
    // Defino los metodos de este interfaz los cuales heredaran las clases
    // que lo implementen
    
    void apagar();
    void encender();
    void bajarVolumen();
    void subirVolumen();
    void cambiarCanal(float canal);
    
}
