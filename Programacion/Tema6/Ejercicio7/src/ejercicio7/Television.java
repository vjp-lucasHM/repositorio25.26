/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author tumba
 */
public class Television implements ControlRemoteable {
    
    // Defino todos los atributos necesarioos, constructores, getters y setters, y sobreescribo los 
    // metodos abstractos del interfaz ControlRemoteable
    
    private boolean encendido;
    private int canal;    
    private int volumen; 

    public Television() {
        this.encendido = false;
        this.canal = 0;
        this.volumen = 0;
    }

    public Television(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public void apagar() {
        System.out.println("La television ahora esta apagada");
        this.encendido = false;
    }

    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("Television encendido. Canal actual: " + this.canal);
    }

    @Override
    public void bajarVolumen() {
        this.volumen--;
        System.out.println("Volumen actual: " + this.volumen);
    }

    @Override
    public void subirVolumen() {
        this.volumen++;
        System.out.println("Volumen actual: " + this.volumen);
    }

    @Override
    public void cambiarCanal(float canal) {
        this.canal = (int) canal;
        System.out.println("Canal actual: " + this.canal);
    }
    
    public void mostrar() {
        System.out.println("Televisor - encendido: " + this.encendido
                + ", canal: " + this.canal
                + ", volumen: " + this.volumen);
    }
    
    
    
}
