/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Circulo extends FiguraGeometrica {
    
    // Definimos los atributos, constructores, getters, setters
    private double radio;

    public Circulo(String rojo, double par) {
        super();
        this.radio = 0D;
    }

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    // Sobreescribimos los metodos abstractos de la clase figurageometrica
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
   
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
        
}
