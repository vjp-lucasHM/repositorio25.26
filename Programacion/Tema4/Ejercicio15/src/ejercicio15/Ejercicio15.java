/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        do {
            // Le doy las opciones al usuario
            System.out.println("Por favor, elige una de las siguientes opciones:\n1. Sumar los numeros\n2. Restar los numeros\n3. Multiplicar los numeros\n4. Dividir los numeros\n5. Salir del programa");
            num = scanner.nextInt();
        } while(num>5 || num<=0); // Si introduce una opcion invalida le dejo que vuelva a poner una opcion
        
        int num1, num2;
        
        switch(num) {
            case 1: { // opcion 1: sumar
                num1 = pedirNumero();
                num2 = pedirNumero();
                
                
                break;
            }
            
            case 2: { // opcion numero 2: restar
                num1 = pedirNumero();
                num2 = pedirNumero();
                
                restar(num1, num2);
                break;
            }
            
            case 3: { // opcion numero 3: multiplicar
                num1 = pedirNumero();
                num2 = pedirNumero();
                
                multiplicar(num1, num2);
                break;
            }
            
            case 4: { // opcion numero 4: dividir
                num1 = pedirNumero();
                num2 = pedirNumero();
                
                dividir(num1, num2);
                break;
            }
            
            case 5: { // opcion de salir del programa
                System.out.println("Gracias por usar el programa.");
                break;
            }
        }
    }
    
    public static void sumar(int num1, int num2) {
        System.out.println("La suma entre los numeros " + num1 + " y " + num2 + " es " + (num1+num2));
    }
    
    public static void restar(int num1, int num2) {
        System.out.println("La resta entre los numeros " + num1 + " y " + num2 + " es " + (num1-num2));
    }
     
    public static void multiplicar(int num1, int num2) {
        System.out.println("El producto entre los numeros " + num1 + " y " + num2 + " es " + (num1*num2));
    }
    
    public static void dividir(int num1, int num2) {
        
        int resultado = 0;
                
        try {
            resultado = num1 / num2;
        } catch (ArithmeticException e) {
            resultado = 0;
            System.out.println("No se puede realizar una division entre 0! El resultado será 0 por defecto.");
        }
                
        System.out.println("La division entre los numeros " + num1 + " y " + num2 + " es " + resultado);
    }
    
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero");
        int toReturn;
        
        try {
            toReturn = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un numero valido. El numero será 10 por defecto.");
            toReturn = 10;
        }
        
        return toReturn;
    }
    
}
