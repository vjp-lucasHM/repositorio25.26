/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p = new Profesor("Daniel", "Programacion");
        Alumno a = new Alumno("Alberto", "DAM 1");

        System.out.println(p.saludar());
        System.out.println(a.saludar());
        
        System.out.println();
        
        Persona p2 = new Profesor("Puerto", "Bases de Datos");
        Persona a2 = new Alumno("Juan", "DAM 1");

        System.out.println(p2.saludar());
        System.out.println(a2.saludar());
    }
    
}
