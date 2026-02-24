/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {
    
    public static int SUMA = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirPrimerNumero();
        int num2 = pedirSegundoNumero(num1);
        
        sumaTotalPares(num1, num2);
    }
    
    public static void sumaTotalPares(int comienzo, int fin) {
        for(int i = comienzo; i < fin; i++) {
            if(i % 2 == 0) SUMA += i;
        }
        
        System.out.println("La suma total de todos los numeros pares comprendidos entre " + comienzo + " y " + fin + " es: " + SUMA + ".");
    }
    
    public static int pedirPrimerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero.");
        int num;
        
        try {
            num = scanner.nextInt();
        } catch(InputMismatchException excpetion) {
            System.out.println("Introduce un numero valido! El numero será 1 por defecto.");
            num = 1;
        }
        
        return num;
    }
    
    public static int pedirSegundoNumero(int comienzo) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Por favor, introduce un numero (Debe de ser mayor que el primero que has introducido)");
            
            try {
                num = scanner.nextInt();
            } catch(InputMismatchException ex) {
                System.out.println("Introduce un numero valido. El numero será 10000 por defecto.");
                num = 10000;
            }
        } while(comienzo > num);
        
        return num;
    }
    
}
