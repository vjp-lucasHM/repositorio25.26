/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Cuadrado extends FiguraGeometrica{
    // Definimos atributos, constructores, getters y setters y el toStrign()
    private double lado;
    
    //Contructores
    public Cuadrado(){
        super();
        lado = 0;
    }
    
    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    //Getter/Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
    
    // Sobreescribo los metodos abstractos de la clase FIguraGeometrica
    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}
