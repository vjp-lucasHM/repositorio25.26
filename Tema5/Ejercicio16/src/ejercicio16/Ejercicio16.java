/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        
        alumno.pedirNombre();
        alumno.pedirNota();
        
        System.out.println("El alumno " + alumno.getNombre() + " tiene un " + alumno.calificar() + " (" + alumno.getNota() + ")");
    }
    
}
