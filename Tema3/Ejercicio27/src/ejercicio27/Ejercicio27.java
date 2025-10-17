/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        do {
            System.out.println("Por favor, elige una de las siguientes opciones:\n1. Sumar los numeros\n2. Restar los numeros\n3. Multiplicar los numeros\n4. Dividir los numeros\n5. Salir del programa");
            num = scanner.nextInt();
        } while(num>5);
        
        int num1, num2;
        
        switch(num) {
            case 1: {
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
        
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
                
                System.out.println("La suma entre los numeros " + num1 + " y " + num2 + " es " + (num1+num2));
                break;
            }
            
            case 2: {
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
        
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
                
                System.out.println("La resta entre los numeros " + num1 + " y " + num2 + " es " + (num1-num2));
                break;
            }
            
            case 3: {
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
        
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
                
                System.out.println("El producto entre los numeros " + num1 + " y " + num2 + " es " + (num1*num2));
                break;
            }
            
            case 4: {
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
        
                try {
                    System.out.println("Por favor, introduce un numero.");
                    num2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un numero valido.");
                    return;
                }
                
                System.out.println("La division entre los numeros " + num1 + " y " + num2 + " es " + (num1/num2));
                break;
            }
            
            case 5: {
                System.out.println("Gracias por usar el programa.");
                break;
            }
        }
    }
    
}
