/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class Coche extends Vehiculo {
    
    private boolean aireEncendido;

    public Coche() {
        super();
        this.aireEncendido = false;
    }

    public Coche(boolean aireEncendido, int velocidad) {
        super(velocidad);
        this.aireEncendido = aireEncendido;
    }
    
    public void encenderAire() {
        if(!aireEncendido) {
            this.aireEncendido = true;
            System.out.println("El coche ha encendido el aire. La velocidad se reduce.");
            this.setVelocidad(this.getVelocidad()-10);
        } else {
            System.out.println("El aire ya esta encendido");
        }
    }

    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche esta circulando a " + this.getVelocidad() + " km/h");
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{" + "aireEncendido=" + aireEncendido + '}';
    }
    
    
    
}
