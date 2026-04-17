/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escaperoom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class EscapeRoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (String numero : leerArchivoClave("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt")) {
            System.out.println(numero);
        }
        //escribirFile("sospechosos_zona_cero.txt", leerArchivo("datos_empleados.txt"));
    }

    public static ArrayList<String> leerArchivoClave(String nombreArchivo) {
        ArrayList<String> lista = new ArrayList<>();
        try (
                FileReader fr = new FileReader(nombreArchivo); BufferedReader br = new BufferedReader(fr)) {
            String linea = "";
            boolean vacio = true;

            while ((linea = br.readLine()) != null) {
                for (int i = 0; i <= linea.length() / 8; i++) {
                    lista.add(linea.substring(i * 8, Math.min((i + 1) * 8, linea.length())));
                }

                vacio = false;
            }

            if (vacio) {
                System.out.println("El fichero existe pero esta vacio");
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        return lista;
    }

    public static boolean isAllDigits(String str) {
        return str != null && !str.isEmpty() && str.chars().allMatch(Character::isDigit);
    }

    public static void escribirFile(String nombreFile, ArrayList<String> listaNombres) {
        try (
                FileWriter fw = new FileWriter(nombreFile, true); PrintWriter pw = new PrintWriter(fw)) {
            for (String linea : listaNombres) {
                pw.println(linea);
            }

            System.out.println("Se han escrito un total de " + listaNombres.size() + " empleados al archivo " + nombreFile);
        } catch (IOException ex) {
            System.out.println("Error en la escritura del archivo");
        }
    }

    public static ArrayList<String> leerArchivo(String nombreFile) {
        ArrayList<String> lista = new ArrayList<>();

        try (
                FileReader fr = new FileReader(nombreFile); BufferedReader br = new BufferedReader(fr)) {
            String linea = "";
            boolean vacio = true;

            while ((linea = br.readLine()) != null) {
                String[] arr = linea.split(";");

                if (arr[2].equalsIgnoreCase("Zona Cero")) {
                    lista.add(linea);
                }

                vacio = false;
            }

            if (vacio) {
                System.out.println("El fichero existe pero esta vacio");
            }

        } catch (IOException ex) {
            System.out.println("Error de lectura en el archivo" + ex.getMessage());
        }

        return lista;
    }

}
