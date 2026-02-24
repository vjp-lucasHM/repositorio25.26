/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author tumba
 */
public class Potencia extends Calculadora {
    
    private int exponente;
    
    Potencia() {
        super();
        this.exponente = 0;
    }
    
    Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }
    
    public int getExponente() {
        return this.exponente;
    }
    
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    @Override
    public void realizarOperacion() {
        System.out.println("Resultado de " + this.getNumero() + "^" + this.exponente + ": " + (Math.pow(this.getNumero(), this.exponente)));
    }
    
}
