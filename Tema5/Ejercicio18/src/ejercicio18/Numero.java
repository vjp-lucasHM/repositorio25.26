/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Numero {
    
    private int valor;

    public Numero() {}

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        
        do {
            System.out.println("Por favor, introduce un numero");
            
            try {
                valido = true;
                this.setValor(scanner.nextInt());
            } catch(InputMismatchException ex) {
                System.out.println("Por favor, introduce un numero valido!");
            }
        }while(!valido);
    }
    
    
    
}
