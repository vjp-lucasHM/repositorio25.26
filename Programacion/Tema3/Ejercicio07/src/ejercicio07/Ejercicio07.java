/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {
    
    public static final HashMap DIAS_SEMANA = new HashMap<Integer, String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DIAS_SEMANA.put(1, "Lunes");
        DIAS_SEMANA.put(2, "Martes");
        DIAS_SEMANA.put(3, "Miercoles");
        DIAS_SEMANA.put(4, "Jueves");
        DIAS_SEMANA.put(5, "Viernes");
        DIAS_SEMANA.put(6, "Sabado");
        DIAS_SEMANA.put(7, "Domingo");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el numero de cualquier dia de la semana\n1-Lunes 2-Martes 3-Miercoles, etc");
        int diasemana = scanner.nextInt();
        boolean laborable = false;
        
        switch(diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
                break;
        }
        
        String laborableS = "";
        if(laborable) laborableS = "es laborable";
        else laborableS = "no es laborable";
        
        System.out.println("El dia de la semana " + DIAS_SEMANA.get(diasemana) + " " + laborableS + ".");
    }
    
}
