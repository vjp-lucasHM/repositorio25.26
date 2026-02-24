/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author tumba
 */
public abstract class Animal {

    // Defino los atributos, constructores y getters y setters
    private String nombre;
    private int edad;
    private double peso;

    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
    }
    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Metodos abstractos
    public abstract String getSonido();

    public abstract String getAlimentacion();

    public abstract String getHabitat();

    public abstract String getNombreCientifico();

    // Defino el toString
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
}
