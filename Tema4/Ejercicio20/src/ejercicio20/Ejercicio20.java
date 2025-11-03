/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {
    
    public static final String PREGUNTA_1 = "Cual es la capital de España?";
    public static final String PREGUNTA_2 = "Quien descubrio America?";
    
    public static final String SOLUCION_1 = "Madrid";
    public static final String SOLUCION_2 = "Cristobal Colon";
    
    public static int NOTA = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- EXAMEN DE CULTURA GENERAL ---");
        boolean correcto1 = hacerPregunta(PREGUNTA_1,SOLUCION_1);
        boolean correcto2 = hacerPregunta(PREGUNTA_2,SOLUCION_2);
        // Hacemos las dos preguntas al usuario y almacenamos el resultado en 2 variables.
        
        if(correcto1) NOTA += 5;
        if(correcto2) NOTA += 5;
        // Si las respuestas son correctas, sumamos 5 a la nota final.
        
        System.out.println("Nota del examen: " + NOTA);
        // Le decimos la nota al usuario
    }
    
    public static boolean hacerPregunta(String pregunta, String solucion) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pregunta: " + pregunta);
        String respuesta = scanner.nextLine();
        
        boolean correcto = false;
        
        if(respuesta.equals(solucion)) {
            correcto = true;
            System.out.println("Felicidades! Respuesta correcta");
        } else System.out.println("No es correcto. La repuesta correcta es " + solucion);
        
        // Le hacemos la pregunta al usuario y si su respuesta es correcta, lo almacenamos en una variable
        // la cual devolveremos y le damos un mensaje al usuario dependiendo si ha adivinado o no
        
        return correcto;
    }
}
