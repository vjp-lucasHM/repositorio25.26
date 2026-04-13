/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombreFichero = ""; // Variable para guardar el nombre y usarlo en la opción 2

        do {
            // 1. Mostrar el menú
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Volcado de array (100 primeros pares) a fichero");
            System.out.println("2. Mostrar contenido del fichero");
            System.out.println("3. Salir del Programa");
            System.out.print("Seleccione una opción: ");

            // Captura de excepción por si el usuario introduce letras en el menú
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número entero (1, 2 o 3).");
                opcion = 0; // Forzar que el bucle continúe
                continue;
            }

            switch (opcion) {
                case 1:
                    // Pedir nombre del fichero
                    System.out.print("Introduzca el nombre del fichero (ej: numeros.txt): ");
                    nombreFichero = sc.nextLine();
                    
                    // Generar el array con los 100 primeros números pares
                    int[] arrayPares = new int[100];
                    for (int i = 0; i < arrayPares.length; i++) {
                        arrayPares[i] = i * 2; // 0, 2, 4, 6...
                    }

                    // Escribir en el fichero
                    // Usamos try-with-resources para cerrar automáticamente los flujos
                    try (FileWriter fw = new FileWriter(nombreFichero);
                         BufferedWriter bw = new BufferedWriter(fw);
                         PrintWriter pw = new PrintWriter(bw)) {

                        // Volcamos el array al fichero (separados por comas para que se vea bien)
                        for (int i = 0; i < arrayPares.length; i++) {
                            pw.print(arrayPares[i]);
                            if (i < arrayPares.length - 1) {
                                pw.print(", ");
                            }
                        }
                        System.out.println("Fichero '" + nombreFichero + "' creado correctamente con 100 números pares.");

                    } catch (IOException e) {
                        System.out.println("Error de escritura: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Validar que se haya creado un fichero antes
                    if (nombreFichero.isEmpty()) {
                        System.out.println("Aún no ha creado ningún fichero. Seleccione la opción 1 primero.");
                    } else {
                        // Leer y mostrar el contenido
                        try (FileReader fr = new FileReader(nombreFichero);
                             BufferedReader br = new BufferedReader(fr)) {

                            System.out.println("\n--- CONTENIDO DEL FICHERO (" + nombreFichero + ") ---");
                            String linea;
                            // Leemos línea a línea (en este caso será una sola línea larga con comas)
                            while ((linea = br.readLine()) != null) {
                                System.out.println(linea);
                            }

                        } catch (IOException e) {
                            System.out.println("Error de lectura (es posible que el fichero no exista): " + e.getMessage());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);
        
        sc.close();
    }
    
}
