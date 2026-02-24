/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author tumba
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacemos la prueba con la clase Television
        System.out.println("Television:");
        Television tv = new Television();
        tv.encender();
        tv.mostrar();
        tv.subirVolumen(); 
        tv.subirVolumen(); 
        tv.subirVolumen();
        System.out.println("Volumen actual: " + tv.getVolumen());
        tv.cambiarCanal(3F);
        tv.bajarVolumen();
        tv.apagar();
        tv.mostrar();

        System.out.println();

        // Hacemos la prueba con la clase Radio
        System.out.println("Radio:");
        Radio radio = new Radio();
        radio.encender();
        radio.mostrar();
        radio.subirVolumen(); 
        radio.subirVolumen(); 
        radio.subirVolumen();
        System.out.println("Volumen actual: " + radio.getVolumen());
        radio.cambiarCanal(50F);
        radio.bajarVolumen();
        radio.apagar();
        radio.mostrar();
    }
    
}
