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
        
        for(int i = 20; i<=160; i++) { // hacemos el bucle
            if(i % 2 != 0) {
                numerosImpares++; // sumamos 1 a numerosImpares ya que no es par.
            }
        }
        
        System.out.println("El total de numeros impares ha sido " + numerosImpares); // imprimimos la cantidad de numeros impares
    }
    
}
