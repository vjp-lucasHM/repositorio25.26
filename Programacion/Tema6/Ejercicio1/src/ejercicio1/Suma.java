/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora {
    
    private int numSumando;
    
    public Suma() {
        super();
        this.numSumando = 0;
    }
    
    public Suma(int numero, int numSuma) {
        super(numero);
        this.numSumando = numSuma;
    }

    @Override
    public void realizarOperacion() {
        System.out.println("Resultado de " + this.numSumando + " + " + this.getNumero() + ": " + (this.numSumando+this.getNumero()));
    }
        
}
