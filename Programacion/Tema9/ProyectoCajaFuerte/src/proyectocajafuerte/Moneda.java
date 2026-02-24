/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocajafuerte;

/**
 *
 * @author alumno
 */
public class Moneda {
    
    private float valor;
    private String pais;
    private String material;

    public Moneda() {
        this.valor = 0F;
        this.pais = "";
        this.material = "";
    }

    public Moneda(float valor, String pais, String material) {
        this.valor = valor;
        this.pais = pais;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getPais() {
        return pais;
    }

    public float getValor() {
        return valor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void mostrarMoneda() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Moneda{" + "valor=" + valor + ", pais=" + pais + ", material=" + material + '}';
    }
    
}
