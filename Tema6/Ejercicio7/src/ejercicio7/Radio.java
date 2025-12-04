/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author tumba
 */
public class Radio implements ControlRemoteable {
    
    // Defino todos los atributos necesarioos, constructores, getters y setters, y sobreescribo los 
    // metodos abstractos del interfaz ControlRemoteable
    
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    Radio() {
        this.encendido = false;
        this.emisora = 0;
        this.volumen = 0;
    }

    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public float getEmisora() {
        return this.emisora;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    @Override
    public void apagar() {
        System.out.println("La radio ahora esta apagada");
        this.encendido = false;
    }

    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("Radio encendida. Canal actual: " + this.emisora);
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
        this.emisora = (int) canal;
        System.out.println("Canal actual: " + this.emisora);
    }
    
    public void mostrar() {
        System.out.println("Televisor - encendido: " + this.encendido
                + ", canal: " + this.emisora
                + ", volumen: " + this.volumen);
    }
    
}
