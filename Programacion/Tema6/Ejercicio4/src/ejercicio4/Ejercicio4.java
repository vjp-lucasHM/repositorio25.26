/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Noa", 2, 10);
        Lobo lobo = new Lobo("Lobo Gris", 4, 50.0);
        Leon leon = new Leon("Scar", 6, 250.0);
        Gato gato = new Gato("Garfield", 4, 8.0);
        
        System.out.println("NO POLIMORFISMO");
        mostrarAnimal(perro);
        mostrarAnimal(lobo);
        mostrarAnimal(leon);
        mostrarAnimal(gato);
        
        Animal perro2 = new Perro("Noa", 2, 10);
        Animal lobo2 = new Lobo("Lobo Gris", 4, 50.0);
        Animal leon2 = new Leon("Scar", 6, 250.0);
        Animal gato2 = new Gato("Garfield", 4, 8.0);
        
        System.out.println("POLIMORFISMO");
        mostrarAnimal(perro2);
        mostrarAnimal(lobo2);
        mostrarAnimal(leon2);
        mostrarAnimal(gato2);
    }
    
    public static void mostrarAnimal(Animal a) {
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Peso: " + a.getPeso());
        System.out.println("Sonido: " + a.getSonido());
        System.out.println("Alimentacion: " + a.getAlimentacion());
        System.out.println("Habitat: " + a.getHabitat());
        System.out.println("Nombre cientifico: " + a.getNombreCientifico());
        System.out.println("------------------------");
    }
    
}
