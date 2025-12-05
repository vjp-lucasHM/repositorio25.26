/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class Moto extends Vehiculo {
    
    private boolean haciendoCaballito;

    public Moto() {
    }

    public Moto(boolean haciendoCaballito, int velocidad) {
        super(velocidad);
        this.haciendoCaballito = haciendoCaballito;
    }

    public boolean isHaciendoCaballito() {
        return haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }
    
    public void hacerCaballito() {
        if(!haciendoCaballito) {
            System.out.println("La moto ahora esta haciendo un caballito. La velocidad aumenta.");
            this.setVelocidad(this.getVelocidad()+15);
        } else {
            System.out.println("La moto ya esta haciendo un caballito.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "haciendoCaballito=" + haciendoCaballito + '}';
    }

    @Override
    public void mostrarMovimiento() {
        System.out.println("La velocidad actual de la moto es " + this.getVelocidad());
    }
    
    
    
}
