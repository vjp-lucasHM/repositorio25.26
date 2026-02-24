/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public abstract class FiguraGeometrica {
    
    // Definimos los atributos, constructores, getters y setters
    
    private String color;

    public FiguraGeometrica() {
        this.color ="";
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
    // Definimos pero no implementamos los metodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    
    
}
