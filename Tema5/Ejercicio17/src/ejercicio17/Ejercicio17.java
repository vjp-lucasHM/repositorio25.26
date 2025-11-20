/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    
    public static double NOTA = 0D;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Enunciado pregunta1 = new Enunciado("Quien es el presidente de España actualmente?", "Pedro Sanchez");
        Enunciado pregunta2 = new Enunciado("Cual es la capital de España?", "Madrid");
        Enunciado pregunta3 = new Enunciado("Quien lidero la dictadura en España durante los años 1939 y 1975", "Francisco Franco");
        Enunciado pregunta4 = new Enunciado("Quien descubrio America?", "Cristobal Colón");
        
        System.out.println("--- EXAMEN DE CULTURA GENERAL");
        
        hacerPregunta(pregunta1);
        hacerPregunta(pregunta2);
        hacerPregunta(pregunta3);
        hacerPregunta(pregunta4);
        
        System.out.println("Tu nota final del examen ha sido " + NOTA);
    }
     
    public static void hacerPregunta(Enunciado pregunta) {
        if(pregunta.hacerPregunta()) NOTA += 2.5D; 
    }
    
    
    
}
