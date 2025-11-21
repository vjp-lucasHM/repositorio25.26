/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    // Definimos los atributos de la clase Alumno
    private String nombre;
    private int nota;

    // Definimos los constructores necesarios para esta clase.
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Definimos los getters y setters necesarios para esta clase.
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    // Definimos un metodo que nos sirva para calificar al alumno que corresponda
    // 0-4 Suspenso
    // 5-6 Suficiente
    // 7-8 Notable
    // 9-10 Sobresaliente
    public String calificar() {
        if(this.nota >= 0 && this.nota <= 4) {
            return "Suspenso";
        } else if(this.nota >= 5 && this.nota <= 6) {
            return "Suficiente";
        } else if(this.nota >= 7 && this.nota <= 8) {
            return "Notable";
        } else if(this.nota >= 9 && this.nota <= 10) {
            return "Sobresaliente";
        }
        
        return "";
    }
    
    // Creamos un metodo que nos sirva para pedir la nota al usuario y 
    // le asignamos la nota directamente al objeto
    public void pedirNota() {
        Scanner scanner = new Scanner(System.in);
        int nota;
        
        do {
            System.out.println("Por favor, introduce una nota entre 0 y 10");
            nota = scanner.nextInt();
            
            if(nota > 10 || nota < 0) {
                System.out.println("Nota no valida! Por favor, introduce una nota entre 0 y 10.");
            }
        } while(nota > 10 || nota < 0);
        
        this.nota = nota;
    }
    
    // Creamos un metodo que nos sirva para pedirle el nombre del alumno al usuario
    // y le asignamos el valor directamente a la variable.
    public void pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce el nombre de tu alumno");
        
        this.nombre = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
