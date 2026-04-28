/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(
            FileReader fr = new FileReader("datos_beca.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            //Se abre el archivo de entrada
            String linea = br.readLine();
            
            //Variables donde se guardan los datos del becario
            String nombre = "";
            String sexo = "";
            String edad = "";
            String suspensos = "";
            String residencia = "";
            String ingresos = "";
            
            while (linea != null) {
                if (empiezaPor(linea, "Nombre:")) {
                    nombre = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Sexo:")) {
                    sexo = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Edad:")) {
                    edad = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Numero de suspensos:")) {
                    suspensos = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Residencia familiar:")) {
                    residencia = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Ingresos anuales:")) {
                    ingresos = extraerTexto(linea);
                }
                    
                if (empiezaPor(linea, "---")) {
                    int beca = calcularBeca(edad, suspensos, residencia, ingresos);//Calcular beca
                    if (beca > 0) {//Mostrar si tiene beca
                        System.out.println(nombre + "(" + sexo + ")" + "tiene una beca de " + beca + " Euros");
                    }
                    //Reiniciar variables
                    nombre = "";
                    sexo = "";
                    edad = "";
                    suspensos = "";
                    residencia = "";
                    ingresos = "";  
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    
    public static boolean empiezaPor(String linea, String inicio) {
        if (linea.length() < inicio.length()) return false;
        
        for (int i = 0; i < inicio.length(); i++) {
            if (linea.charAt(i) != inicio.charAt(i)) return false;
        }
        return true;
    }
    
    public static String extraerTexto(String linea) {
        boolean copiar = false;
        String resultado = "";
        
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            
            if (c == ':') {
                copiar = true;
            } else if (copiar) {
                if (c != ' ') {
                    resultado += c;
                }
            }
        }
        //Se copia sin el espacio
        return resultado;
    }

    public static int calcularBeca(String edad, String suspensos, String residencia, String ingresos) {

        // Constantes locales para mayor claridad
        int BECA_BASE = 1500;
        int UMBRAL_INGRESOS = 12000;
        int EDAD_LIMITE_JOVEN = 23;

        // Parseo de valores (asumimos entrada válida)
        int edadNum = Integer.parseInt(edad);
        int suspensosNum = Integer.parseInt(suspensos);
        int ingresosNum = Integer.parseInt(ingresos);

        int beca = BECA_BASE;

        // ➕ Bonus por ingresos bajos
        if (ingresosNum <= UMBRAL_INGRESOS) {
            beca += 500;
        }

        // ➕ Bonus por edad joven
        if (edadNum < EDAD_LIMITE_JOVEN) {
            beca += 200;
        }

        // ➕ Bonus por rendimiento académico (o exclusión si hay ≥2 suspensos)
        if (suspensosNum == 0) {
            beca += 500;
        } else if (suspensosNum == 1) {
            beca += 200;
        } else {
            return 0; // Más de 1 suspenso: sin beca
        }

        // ➕ Bonus por residencia fuera del domicilio familiar
        if ("NO".equalsIgnoreCase(residencia)) {
            beca += 1000;
        }

        return beca;
    }

}
