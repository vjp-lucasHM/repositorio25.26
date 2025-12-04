/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Rectangulo extends FiguraGeometrica{
    //Atributos
    private double base;
    private double altura;
    
    //Constructores
    public Rectangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    //Getters/Setters
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
    
    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }
    //Implementación del método abstracto calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
}
