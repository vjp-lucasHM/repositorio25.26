/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, indique una cantidad de dinero:");
        int dinero = scanner.nextInt();

        int billetes50 = dinero / 50;
        int billetes20 = dinero % 50 / 20;
        int billetes10 = dinero%50%20/10;
        int billetes5 = dinero%50%20%10/5;
        int monedas2 = dinero%50%20%10%5/2;
        int monedas1 = dinero % 50 % 20 % 10 % 2;
        
        String output = "";
        
        if(billetes50 > 0) output += billetes50 + " billetes de 50, ";
        if(billetes20 > 0) output += billetes20 + " billetes de 20, ";
        if(billetes10 > 0) output += billetes10 + " billetes de 10, ";
        if(billetes5 > 0) output += billetes5 + " billetes de 5, ";
        if(monedas2 > 0) output += monedas2 + " monedas de 2, ";
        if(monedas1 > 0) output += monedas1 + " monedas de 1, ";
        

        System.out.println(dinero + " euros se descomponen en " + output);
    }
    
}
