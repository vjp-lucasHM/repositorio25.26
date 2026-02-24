/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public abstract class Triangulo extends FiguraGeometrica{
    // Definimos los atributos, los constructores necesarios, getters, setters
    private double base;
    private double altura;
    
    public Triangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobreescribimos el toString()
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + this.altura + '}';
    }
}
