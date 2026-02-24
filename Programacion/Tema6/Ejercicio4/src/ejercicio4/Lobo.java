/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */

public class Lobo extends Canido {
    // Defino todos los constructores necesarios, y sobreeescribo los metodos abstractos de la respectiva
    // clase padre
    
    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    public Lobo() {
        super();
    }

    @Override
    public String getSonido() {
        return "Aullar";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Tundra";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}