/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        
        alumnos[0] = new Alumno("Pepe", new Asignatura[]{
            new Asignatura("Lengua", 6.5F),
            new Asignatura("Mates", 7.0F),
            new Asignatura("Historia", 8.0F),
            new Asignatura("Fisica", 5.5F)
        });
        
        alumnos[1] = new Alumno("Juan", new Asignatura[]{
            new Asignatura("Lengua", 8F),
            new Asignatura("Mates", 3F),
            new Asignatura("Historia", 10F),
            new Asignatura("Fisica", 7F)
        });
        
        alumnos[2] = new Alumno("Marta", new Asignatura[]{
            new Asignatura("Lengua", 6.5F),
            new Asignatura("Mates", 7.0F),
            new Asignatura("Historia", 5F),
            new Asignatura("Fisica", 5F)
        });
        
        for (Alumno a : alumnos) {
            System.out.println("Alumno: " + a.getNombreAlumno());
            for (Asignatura as : a.getNotas()) {
                System.out.println("  " + as.getNombreAsignatura() + ": " + as.getNota());
            }
        }
    }
    
}
