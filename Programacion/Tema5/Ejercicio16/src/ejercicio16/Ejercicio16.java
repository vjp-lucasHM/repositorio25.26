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

    // En el metodo main creamos la instancia de la clase Alumno y invocamos los metodos 
    // necesarios para pedir el nombre y la nota al usuario y luego imprimimos los datos a consola.
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        
        alumno.pedirNombre();
        alumno.pedirNota();
        
        System.out.println("El alumno " + alumno.getNombre() + " tiene un " + alumno.calificar() + " (" + alumno.getNota() + ")");
    }
    
}
