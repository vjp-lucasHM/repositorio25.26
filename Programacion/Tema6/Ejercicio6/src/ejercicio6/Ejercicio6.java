/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author tumba
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", "Novela");
        
        System.out.println("Libro - sin polimorfismo");
        System.out.println(libro);
        System.out.println(libro.concadenarTodo());
        System.out.println(libro.contarVocales());
        System.out.println(libro.obtenerCadenaMasLarga());
        System.out.println(libro.obtenerIniciales());
        
        System.out.println();
        
        Transformable persona = new Persona("Pedro", "Sanchez", "Perro Sanchez");
        
        System.out.println("Persona - con polimorfismo");
        System.out.println(persona);
        System.out.println(persona.buscarCadena("Pedro"));
        System.out.println(persona.concadenarTodo());
        System.out.println(persona.contarVocales());
        System.out.println(persona.obtenerCadenaMasLarga());
        System.out.println(persona.obtenerIniciales());
    }
    
}
