/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main() {
        
        Coche miCoche = new Coche();
        miCoche.setColor("rojo");
        miCoche.setMarca("Renault");
        miCoche.setModelo("Megane");
        
        Coche cochePadre = new Coche();
        cochePadre.setColor("azul");
        cochePadre.setMarca("Fiat");
        cochePadre.setModelo("Freemont");
        
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        for(int i = 0; i <= 5; i++) {
            miCoche.acelerarCoche();
        }
        
        for(int i = 0; i <= 2; i++) {
            miCoche.acelerarCoche();
        }
        
        for(int i = 0; i <= 3; i++) {
            cochePadre.acelerarCoche();
        }
        
        cochePadre.apagarCoche();
        
        cochePadre.obtenerEstado();
        miCoche.obtenerEstado();
        
    }
    
}
