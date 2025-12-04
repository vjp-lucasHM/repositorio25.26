/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author tumba
 */
public class Multiplicacion extends Calculadora {
    
    private int multiplicador;
    
    Multiplicacion() {
        super();
        this.multiplicador = 0;
    }
    
    Multiplicacion(int numero, int multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    } 
    
    public int getMultiplicador() {
        return this.multiplicador;
    }
    
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    @Override
    public void realizarOperacion() {
        System.out.println("Resultado de " + this.getNumero() + " x " + this.multiplicador + ": " + (this.getNumero()*this.multiplicador));
    }
    
}
