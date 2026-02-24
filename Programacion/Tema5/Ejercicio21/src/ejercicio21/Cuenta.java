/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author tumba
 */
public class Cuenta {
    
    private float saldo;

    public Cuenta() {
        this.saldo = 0F;
    }

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(float saldo) {
        this.saldo += saldo;
    }
    
    public void extraer(float saldo) {
        this.saldo -= saldo;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
