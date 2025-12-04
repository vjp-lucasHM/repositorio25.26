/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */
public class Leon extends Felino {
    // Defino todos los constructores necesarios, y sobreeescribo los metodos abstractos de la respectiva
    // clase padre
    
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    public Leon() {
        super();
    }

    @Override
    public String getSonido() {
        return "Rugir";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Sabana";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
