/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author tumba
 */
public class CuentaClave extends Cuenta {
    
    private String clave;

    public CuentaClave(String clave, float saldo) {
        this.clave = clave;
        this.setSaldo(saldo);
    }

    public CuentaClave(String clave) {
        this.clave = clave;
        this.setSaldo(0);
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void extraer(float saldo) {
        if(this.getSaldo() > saldo) {
            super.extraer(saldo);
            System.out.println("Has sacado " + saldo + " euros de tu cuenta! Tu nuevo saldo es " + this.getSaldo());
        }
    }

    @Override
    public String toString() {
        return "CuentaClave{" + "clave=" + clave + '}';
    }
    
}
