/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancia del objeto Scanner con el que analizaremos los datos que introduzca el usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definimos un array con los nombres de las asignaturas que tenemos
        String[] asignaturas = {"Lengua", "Matemáticas", "Física"};
        ArrayList<Alumno> clase = new ArrayList<>();
        
        int opcion;
        
        do {
            
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    rellenarAlumno(clase,asignaturas);
                    break;
                case 2:
                    mostrarAlumnos(clase);
                    break;
                case 3:
                    mejorAlumno(clase);
                    break;
                case 4:
                    asignaturaMasDificil(clase,asignaturas);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default: 
                    System.out.println("Opcion invalida!");
            }
            
        } while(opcion != 5);
    }
    
    // Método que utilizazremos para mostrar el menu de opciones al usuario
    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. - Crear un nuevo alumno");
        System.out.println("2. - Mostrar los alumnos y sus notas");
        System.out.println("3. - Mejor alumno de la clase");
        System.out.println("4. - Asignatura mas dificil");
        System.out.println("5. - Salir del programa");
    }
    
    public static void rellenarAlumno(ArrayList<Alumno> clase, String[] asig) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        Alumno al = new Alumno(nombre);
        al.rellenarNotas(asig);
        clase.add(al);
        System.out.println("El alumno ha sido creado correctamente");
    }
    
    // Método que usaremos para mostrar la lista de alumnos al usuario, si está vacía le damos un mensaje al usuario
    // y si no, le imprimimos todos los alumnos con sus respectivas notas.
    public static void mostrarAlumnos(ArrayList<Alumno> clase) {
        if(clase.isEmpty()) {
            System.out.println("En esta clase no hay alumnos registrados");
        } else {
            System.out.println("--- Lista de alumnos ---");
            for(Alumno a : clase) {
                System.out.println("Alumno: " + a.getNombre());
                for(Asignatura as : a.getAsignaturas()) {
                    System.out.println("- " + as.getNombre() + ": " + as.getNota());
                }
            }
        }
    }
    
    // Método que usaremos para determinar el mejor alumno de la clase 
    public static void mejorAlumno(ArrayList<Alumno> clase) {
        if(clase.isEmpty()) {
            System.out.println("En esta clase no hay alumnos registrados.");
        } else {
            Alumno mejor = clase.get(0);
            
            for(Alumno al : clase) {
                if(al.calcularMeida() > mejor.calcularMeida()) {
                    mejor = al;
                }
            }
            
            System.out.println("El mejor alumno de la clase es: " + mejor.getNombre() + " con una media de " + mejor.calcularMeida());
        }
    }
    
    // Método el cual usaremos para determinar la asignatura más dificil de la clase, la cual hace un recuento
    // de todos los suspenso que tiene cada asignatura y luego las compara con el resto.
    public static void asignaturaMasDificil(ArrayList<Alumno> clase, String[] asignaturas) {
        if(clase.isEmpty()) {
            System.out.println("No hay alumnos registrados en esta clase.");
        } else {
            int[] suspensos = new int[asignaturas.length];
            
            
            for(Alumno al : clase) {
                for(int i = 0; i < asignaturas.length; i++) {
                    if(al.getNotaPorPosicion(i) < 5) {
                        suspensos[i]++;
                    }
                }
            }
            
            int max = suspensos[0];
            String asignaturaDificil = asignaturas[0];
            
            for(int i = 1; i < suspensos.length; i++) {
                if(suspensos[i] > max) {
                    max = suspensos[i];
                    asignaturaDificil = asignaturas[i];
                }
            }
            System.out.println("La asignatura mas dificil es: " + asignaturaDificil + " con " + max + " suspensos");
        }
    }
    
}
