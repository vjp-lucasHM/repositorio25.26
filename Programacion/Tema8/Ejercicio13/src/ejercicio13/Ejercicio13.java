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
        Alumno[] alumnos = new Alumno[5]; // vector con el que trabajaremos
        
        boolean exit = false; // variable con la que controlamos la ejecución del programa

        do {
            
            mostrarMenu(); // le mostramos el menu al usuario
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt(); // guardamos la opcion que haya elegido en una variable
            
            switch(opcion) {
                case 1:
                    rellenarAlumno(alumnos); // rellenar los alumnos con informacion proporcionada por el usuario
                    break;
                case 2:
                    mostrarAlumnos(alumnos); // mostrar todos los alumnos del vector
                    break;
                case 3:
                    mostrarAlumnosMediaDada(alumnos); // buscar un alumno con una nota media por encima de una proporcionada por el usuario
                    break;
                case 4:
                    mostrarAlumnosSuspensos(alumnos); // mostramos la cantidad de alumnos con nota media suspensa
                    break;
                case 5:
                    buscarAlumno(alumnos); // buscar un alumno por nombre
                    break;
                case 6: // 
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default: // si el usuario pone una opcion invalida, le ponemos un mensaje
                    System.out.println("Opcion no valida. Prueba otra opcion (1-6)");
            }

        } while (!exit); // el programa no dejará de ejecutarse hasta que el usuario quiera
    }

    // metodo que usaremos para mostrarle el menu de opciones al usuario
    public static void mostrarMenu() {
        System.out.println("1. Rellenar un alumno.\n2. Mostrar todos los alumnos (si uno está vacio no se mostrará esa celda)\n3. Mostrar alumnoss con nota media por encima de una nota dada\n4. Mostrar cuántos alumnos hay con nota media suspensa.\n5. Buscar alumno.\n6. Salir del programa...");
    }

    // método que usaremos para rellenar celdas del vector de alumno con información que nos proporcione el usuario
    // le damos al usuario la opción de elegir la celda que quiera rellenar
    // luego le pedimos informacion del alumno al usuario para rellenar la celda que haya elegido
    // y le damos un mensaje de confirmación de que el alumno se ha creado correctamente.
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
    
    // hacemos un bucle for-each del vector de alumnos, y si la celda no es nula,
    // imprimo el alumno a la consola
    public static void mostrarAlumnos(Alumno[] alumnos) {
        for(Alumno al : alumnos) {
            if(al != null) {
                System.out.println("Alumno " + al.getNombre() + ": " + al.toString());
            }
        }
    }
    
    // en este metodo realizamos una busqueda con un bucle while para buscar un alumno con una nota media 
    // por encima de la dada que nos proporciona el usuario, y si no encontramos le ponemos un mensaje al usuario
    public static void  mostrarAlumnosMediaDada(Alumno[] alumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una nota media:");
        float nota = scanner.nextFloat();
        
        boolean encontrado = false;
        int i = 0;
        
        while(!encontrado && i < alumnos.length) {
            if(alumnos[i] != null && alumnos[i].getNotaMedia() > nota) {
                System.out.println(alumnos[i].toString());
                encontrado = true;
            } else {
                i++;
            }
        }
        
        if(!encontrado) {
            System.out.println("No se han encontrado alumnos con nota media superior a " + nota);
        }
    }
    
    // hacemos un bucle por todo el vector de alumnos, y si la nota media
    // del alumno está por debajo del 5, incrementamos nuestra
    // variable contador por uno y agregamos el nombre del alumno a una variable String
    // y luego imprimo ambas a consola.
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
    
    // en este metodo hacemos otra búsqueda con un bucle while y, dependiendo de si 
    // el alumno que el usuario intenta buscar es nulo en nuestro vector de alumnos
    // le diremos al usuario si el alumno está matriculado o no
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
