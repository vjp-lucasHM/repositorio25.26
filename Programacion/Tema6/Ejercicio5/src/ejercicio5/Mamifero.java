/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author tumba
 */
public class Mamifero {
    
    // Defino todos los atributos, constructores, getters y setters y el toString de esta clase
    
    private String nombre, sexo, color;
    private int edad;
    
    public Mamifero() {
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }

    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + ", edad=" + edad + '}';
    }
    
}
