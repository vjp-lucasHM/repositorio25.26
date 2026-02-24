/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche coche = new Coche(false,15);
        procesarVehiculo(coche);
        
        System.out.println();
        
        Moto moto = new Moto(false, 30);
        procesarVehiculo(moto);
        
    }
    
    public static void procesarVehiculo(Vehiculo vehiculo) {
        vehiculo.mostrarMovimiento();
        
        if(vehiculo instanceof Coche c) {
            c.encenderAire();
            c.mostrarMovimiento();
        } else if(vehiculo instanceof Moto m) {
            m.hacerCaballito();
            m.mostrarMovimiento();
        }
    }
    
}
