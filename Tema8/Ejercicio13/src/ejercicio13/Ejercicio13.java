/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];
        boolean exit = false;

        do {
            
            mostrarMenu();
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    rellenarAlumno(alumnos);
                    break;
                case 2:
                    mostrarAlumnos(alumnos);
                    break;
                case 3:
                    mostrarAlumnosMediaDada(alumnos);
                    break;
                case 4:
                    mostrarAlumnosSuspensos(alumnos);
                    break;
                case 5:
                    buscarAlumno(alumnos);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default: 
                    System.out.println("Opcion no valida. Prueba otra opcion (1-6)");
            }

        } while (!exit);
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar un alumno.\n2. Mostrar todos los alumnos (si uno está vacio no se mostrará esa celda)\n3. Mostrar alumnoss con nota media por encima de una nota dada\n4. Mostrar cuántos alumnos hay con nota media suspensa.\n5. Buscar alumno.\n6. Salir del programa...");
    }

    public static void rellenarAlumno(Alumno[] alumnos) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Introduce una posición entre el 0 y el 4");
            numero = scanner.nextInt();
            
            if(numero < 0 || numero >= alumnos.length){
                System.out.println("Está posicion esta fuera del rango del vector");
            }else if(alumnos[numero] != null){
                System.out.println("Esta celda ya esta siendo usada por otro alumno. Elige otra");
            }
        } while(numero < 0 || numero >= alumnos.length || alumnos[numero] != null);
        
        scanner.nextLine();
        
        System.out.println("Introduce un nombre:");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce una edad:");
        int edad = scanner.nextInt();
        
        System.out.println("Introduce una edad media:");
        float media = scanner.nextFloat();
        
        alumnos[numero] = new Alumno(nombre,edad,media);
        System.out.println("El alumno ha sido creado correctamente.");
    }
    
    public static void mostrarAlumnos(Alumno[] alumnos) {
        for(Alumno al : alumnos) {
            if(al != null) {
                System.out.println("Alumno " + al.getNombre() + ": " + al.toString());
            }
        }
    }
    
    public static void  mostrarAlumnosMediaDada(Alumno[] alumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una nota media:");
        float nota = scanner.nextFloat();
        
        boolean encontrado = false;
        
        for(Alumno alumno : alumnos) {
            if(alumno != null && alumno.getNotaMedia() > nota) {
                System.out.println(alumno.toString());
                encontrado = true;
            }
        }
        
        if(!encontrado) {
            System.out.println("No se han encontrado alumnos con nota media superior a " + nota);
        }
    }
    
    public static void mostrarAlumnosSuspensos(Alumno[] alumnos) {
        int i = 0;
        String nombre = "";
        
        for(Alumno alumno : alumnos) {
            if(alumno != null && alumno.getNotaMedia() < 5) {
                i++;
                nombre +=  alumno.getNombre() + ", ";
            }
        }
        
        System.out.println("Hay " + i + " alumnos suspensos en total y sus nombres son los siguientes: " + nombre);
    }
    
    public static void buscarAlumno(Alumno[] alumnos) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del alumno que desees buscar:");
        String nombre = scanner.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < alumnos.length && !encontrado) {
            if(alumnos[i] != null && alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        
        if(encontrado) {
            System.out.println("Este alumno si esta matriculado.");
            System.out.println(alumnos[i]);
        } else {
            System.out.println("Este alumno no está matricualdo");
        }
    }
}
