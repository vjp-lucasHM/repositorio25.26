/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombreFichero = "agenda.txt";

        do {
            // Mostrar menú
            System.out.println("\n--- MENÚ DE LA AGENDA ---");
            System.out.println("1. Añadir un contacto a un fichero de texto");
            System.out.println("2. Mostrar por pantalla el contenido del fichero");
            System.out.println("3. Salir del Programa");
            System.out.print("Seleccione una opción: ");

            // Captura de excepción por si el usuario introduce letras en lugar de números en el menú
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número válido (1, 2 o 3).");
                opcion = 0; // Reiniciar para que el bucle continúe
                continue;
            }

            switch (opcion) {
                case 1:
                    añadirContacto(scanner, nombreFichero);
                    break;
                case 2:
                    mostrarContenido(nombreFichero);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);
        
        scanner.close();
    }

    /**
     * Opción 1: Añade un contacto al fichero
     */
    private static void añadirContacto(Scanner scanner, String nombreFichero) {
        try {
            System.out.print("Introduzca el Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduzca la Edad: ");
            // Validamos que la edad sea un número
            int edad;
            try {
                edad = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: La edad debe ser un número.");
                return; // Salimos del método
            }

            System.out.print("Introduzca el Número de teléfono: ");
            String telefono = scanner.nextLine();

            // Usamos FileWriter con el parámetro 'true' para añadir al final del archivo (append)
            // Usamos try-with-resources para cerrar automáticamente los flujos
            try (FileWriter fw = new FileWriter(nombreFichero, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

                // Escribimos los datos en una línea separados por comas o espacios
                out.println(nombre + ", " + edad + ", " + telefono);
                System.out.println("Contacto añadido correctamente en " + nombreFichero);

            } catch (IOException e) {
                System.out.println("Error de escritura en el fichero: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    /**
     * Opción 2: Muestra el contenido del fichero
     */
    private static void mostrarContenido(String nombreFichero) {
        File fichero = new File(nombreFichero);

        // Primero comprobamos si el fichero existe
        if (!fichero.exists()) {
            System.out.println("El fichero 'agenda.txt' aún no existe. Añada contactos primero.");
            return;
        }

        try (FileReader fr = new FileReader(fichero);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            System.out.println("\n--- CONTENIDO DE AGENDA.TXT ---");
            boolean vacio = true;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                vacio = false;
            }

            if (vacio) {
                System.out.println("El fichero existe pero está vacío.");
            }

        } catch (IOException e) {
            System.out.println("Error de lectura en el fichero: " + e.getMessage());
        }
    }
    
}
