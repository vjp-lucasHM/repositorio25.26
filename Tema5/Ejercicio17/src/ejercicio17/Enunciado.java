/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Enunciado {
    
    private String pregunta, respuesta;

    public Enunciado() {
    }

    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    public boolean hacerPregunta() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(pregunta);
        
        boolean correcto = respuesta.equalsIgnoreCase(scanner.nextLine());
        
        if(correcto) {
            System.out.println("Felicidades! Has acertado!");
        } else {
            System.out.println("No has acertado la respueesta! :(");
        }
        
        
        return correcto;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
