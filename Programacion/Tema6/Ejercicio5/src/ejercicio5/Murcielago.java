/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author tumba
 */
public class Murcielago extends Mamifero implements Volador {
    
    // Defino los atributos, constructores, getters y setters
    
    private int alturaVuelo;

    public Murcielago() {
        super();
        this.alturaVuelo = 0;
    }

    public Murcielago(int alturaVuelo, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }

    public int getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(int alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    // Sobreescribo los metodos de la interfaz que he implementado en esta clase
    
    @Override
    public String obtenerMensajeVolador() {
        return "El murcielago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        this.alturaVuelo++;
    }

    @Override
    public void bajarAlturaVuelo() {
        this.alturaVuelo--;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura de vuelo actual del murcielago:" + this.alturaVuelo);
    }

    // Defino el toString
    
    @Override
    public String toString() {
        return super.toString() + "Murcielago{" + "alturaVuelo=" + alturaVuelo + '}';
    }
    
}
