/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerosImpares = 0; // variable que definira la cantidad de numeros impares
        int i = 20; // numero desde que empezaremos el bucle
        
        while (i <= 160) {
            if (i % 2 != 0) { // si es impar
                System.out.println(i); // lo imprimimos
                numerosImpares++; // un numero impar más
            }
            
            i++;
        }
        
        System.out.println("El total de numeros impares ha sido " + numerosImpares); // imprimimos la cantidad de numeros impares
    }
    
}
