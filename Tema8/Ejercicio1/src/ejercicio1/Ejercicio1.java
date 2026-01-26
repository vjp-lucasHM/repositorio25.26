/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1 = pedirNota("Por favor, introduce la nota de Programacion");
        int nota2 = pedirNota("Por favor, introduce la nota de LMSGI");
        int nota3 = pedirNota("Introduce la nota de Bases de Datos");
        int nota4 = pedirNota("Introduce la nota de Entornos de Desarrollo");
        int nota5 = pedirNota("Introduce la nota de Sistemas Informaticos");
        int nota6 = pedirNota("Introduce la nota de Formacion y Orientacion Laboral");
        
        double meda = (nota1+nota2+nota3+nota4+nota5+nota6)/6;
        
        System.out.println("La nota del curso es de " + meda);
    }
    
    public static int pedirNota(String mensaje) {
        boolean valido = false;
        int numero = 0;

        do {
            System.out.println(mensaje);
            Scanner scanner = new Scanner(System.in);

            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida!");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }
    
}
