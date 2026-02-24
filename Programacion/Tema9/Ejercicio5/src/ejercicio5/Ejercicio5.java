/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabadoo", "Domingo"};
        String[] numeros = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "septimo"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana:");
        String dia = scanner.nextLine();
        
        int indice = -1;
        
        for(int i = 0; i < dias.length; i++) {
            if(dias[i].equalsIgnoreCase(dia)) {
                indice = i;
            }
        }
        
        if(indice == -1) {
            System.out.println("Has introducido un dia invalido. Intentalo otra vez.");
        } else {
            String numero = numeros[indice];
            
            System.out.println(dia + " es el " + numero + " dia de la semana.");
        }
    }
    
}
