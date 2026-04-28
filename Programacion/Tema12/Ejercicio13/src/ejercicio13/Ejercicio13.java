/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        escribirEnArchivo(
                pedirNombre(), 
                pedirSexo(), 
                pedirEdad(), 
                pedirSuspensos(), 
                pedirResidencia(), 
                pedirIngresos()
        );
    }
    
    // Los siguientes metodos seran los que pidan datos al usuario
    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre y apellido: ");
        return scanner.nextLine();
    }
    
    public static void escribirEnArchivo(String nombre, String sexo, String edad, String numSuspensos, String residencia, String ingresosAnuales) {
        try (
                FileWriter fw = new FileWriter("datos_beca.txt", true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            //Se escribe la informacion en cada linea
            pw.println("Nombre: " + nombre);
            pw.println("Sexo: " + sexo);
            pw.println("Edad: " + edad);
            pw.println("Numero de suspensos: " + numSuspensos);
            pw.println("Residencia familiar: " + residencia);
            pw.println("Ingresos anuales: " + ingresosAnuales);
            pw.println("---");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
    
    public static String pedirSexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sexo (H-M): ");
        return scanner.nextLine();
    }
    
    public static String pedirEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edad (20-60): ");
        return scanner.nextLine();
    }
    
    public static String pedirSuspensos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de suspensos (0-4): ");
        return scanner.nextLine();
    }
    
    public static String pedirResidencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Residencia familiar (s/n): ");
        return scanner.nextLine();
    }
    
    public static String pedirIngresos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        return scanner.nextLine();
    }
    
}
