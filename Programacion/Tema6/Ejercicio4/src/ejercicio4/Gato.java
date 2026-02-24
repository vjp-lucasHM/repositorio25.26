/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */
public class Gato extends Felino {
    // Defino todos los constructores necesarios, y sobreeescribo los metodos abstractos de la respectiva
    // clase padre
    
    public Gato() {
        super();
    }

    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Maullar";
    }

    @Override
    public String getAlimentacion() {
        return "Pienso";
    }

    @Override
    public String getHabitat() {
        return "Casa";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
