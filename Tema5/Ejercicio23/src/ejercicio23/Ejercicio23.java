/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio23;

import ejercicio23.vehiculos.Taxi;
import ejercicio23.vehiculos.Autobus;

/**
 *
 * @author Lucas
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi taxi = new Taxi(432593, "453809DF", "45Q", 90);
        Autobus autobus = new Autobus(40, "64598NB", "60H", 75);
        
        System.out.println("Taxi 1: " + taxi.toString());
        System.out.println("Autobus 1: " + autobus.toString());
        
        Taxi taxi1 = new Taxi();
        taxi1.setMatricula("5438654MG");
        taxi1.setModelo("64R");
        taxi1.setNumeroLicencia(65789);
        taxi1.setPotenciaCv(95);
        
        System.out.println("Taxi 2: " + taxi1.toString());
        
        Taxi taxi2 = new Taxi();
        taxi2.setMatricula("54698MHG");
        taxi2.setModelo("89B");
        taxi2.setNumeroLicencia(34521);
        taxi2.setPotenciaCv(87);
        
        System.out.println("Taxi 3: " + taxi2.toString());
        
        
        Autobus autobus1 = new Autobus();
        autobus1.setMatricula("438975MD");
        autobus1.setModelo("75D");
        autobus1.setNumeroPlazas(35);
        autobus1.setPotenciaCv(70);
        
        System.out.println("Autobus 2: " + autobus1.toString());
        
        Autobus autobus2 = new Autobus();
        autobus1.setMatricula("567098MU");
        autobus1.setModelo("43P");
        autobus1.setNumeroPlazas(45);
        autobus1.setPotenciaCv(75);
        
        System.out.println("Autobus 3: " + autobus2.toString());
    }

}
