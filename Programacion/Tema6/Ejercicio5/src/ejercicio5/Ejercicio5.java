/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author tumba
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("------- Prueba sin polimorfismo");
        
        Ornitorrinco ornit = new Ornitorrinco(1, "Platypuss", "M", "Gris", 3);
        Murcielago murci = new Murcielago(1, "Vampiro", "M", "Gris", 3);
        
        System.out.println(ornit.obtenerMensajeOviparo());
        ornit.ponerHuevo();
        ornit.mostrarNumHuevos();
        ornit.incubarHuevo();
        ornit.mostrarNumHuevos();
        System.out.println(ornit);
        
        System.out.println();
        
        System.out.println(murci.obtenerMensajeVolador());
        murci.aumentarAlturaVuelo();
        murci.mostrarAlturaVuelo();
        murci.bajarAlturaVuelo();
        murci.mostrarAlturaVuelo();
        System.out.println(murci);
        
        
        System.out.println("------- Prueba con polimorfismo");
        
        Oviparo ornitOv = new Ornitorrinco(1, "Platypuss", "M", "Gris", 3);
        Volador murciVol = new Murcielago(1, "Vampiro", "M", "Gris", 3);
        
        System.out.println(ornitOv.obtenerMensajeOviparo());
        ornitOv.ponerHuevo();
        ornitOv.mostrarNumHuevos();
        ornitOv.incubarHuevo();
        System.out.println(ornitOv);
        
        System.out.println();
        
        System.out.println(murciVol.obtenerMensajeVolador());
        murciVol.aumentarAlturaVuelo();
        murciVol.mostrarAlturaVuelo();
        murciVol.bajarAlturaVuelo();
        System.out.println(murciVol);
    }
    
}
