/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        Numero num1 = new Numero();
        Numero num2 = new Numero();

        int num;

        do {
            // Le doy las opciones al usuario
            System.out.println("Por favor, elige una de las siguientes opciones:\n1. Sumar los numeros\n2. Restar los numeros\n3. Multiplicar los numeros\n4. Dividir los numeros\n5. Salir del programa");
            num = scanner.nextInt();

            do {
                
                switch (num) {
                    case 1:
                        num1.pedirNumero();
                        num2.pedirNumero();
                        sumar(num1, num2);
                        break;
                    case 2:
                        num1.pedirNumero();
                        num2.pedirNumero();
                        restar(num1, num2);
                        break;
                    case 3:
                        num1.pedirNumero();
                        num2.pedirNumero();
                        multiplicar(num1, num2);
                        break;
                    case 4:
                        num1.pedirNumero();
                        num2.pedirNumero();
                        dividir(num1, num2);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa");
                        exit = true;
                        break;
                }
            } while(!exit);
        } while (num > 5 || num <= 0); // Si introduce una opcion invalida le dejo que vuelva a poner una opcion
    }
    
    public static void sumar(Numero num1, Numero num2) {
        System.out.println("La suma entre los numeros " + num1.getValor() + " y " + num2.getValor() + " es " + (num1.getValor()+num2.getValor()));
    }
    
    public static void restar(Numero num1, Numero num2) {
        System.out.println("La resta entre los numeros " + num1.getValor() + " y " + num2.getValor() + " es " + (num1.getValor()-num2.getValor()));
    }
     
    public static void multiplicar(Numero num1, Numero num2) {
        System.out.println("El producto entre los numeros " + num1.getValor() + " y " + num2.getValor() + " es " + (num1.getValor()*num2.getValor()));
    }
    
    public static void dividir(Numero num1, Numero num2) {
        
        int resultado = 0;
                
        try {
            resultado = num1.getValor() / num2.getValor();
        } catch (ArithmeticException e) {
            resultado = 0;
            System.out.println("No se puede realizar una division entre 0! El resultado será 0 por defecto.");
        }
                
        System.out.println("La division entre los numeros " + num1.getValor() + " y " + num2.getValor() + " es " + resultado);
    }

}
