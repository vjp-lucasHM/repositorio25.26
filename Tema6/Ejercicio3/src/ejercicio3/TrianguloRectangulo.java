/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class TrianguloRectangulo extends Triangulo{
    // Definimos los constructores de la clase
    // EN este caso, como no hay atributos especificos, no hacen falta ni getters ni setters
    public TrianguloRectangulo(){
        super();
    }
    
    public TrianguloRectangulo(String color, double base, double altura){
        super(color, base, altura);
    }
    
    // Sobreescribimos los metodos abstractos que necesitemos
    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }
    
    @Override
    public double calcularPerimetro(){
        return getBase() + getAltura() + calcularHipotenusa();
    }
    
    // Defino un metodo para calcular la hipotenusa
    public double calcularHipotenusa(){
        return Math.hypot(getAltura(), getBase());
    }
    
    public String getTipoTriangulo(){
        double hipotenusa = calcularHipotenusa();
        if(getBase() == getAltura() && getBase() == hipotenusa){
            return "Equilatero";
        }else if(getBase() == getAltura() || getBase() == hipotenusa || getAltura() == hipotenusa){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }
}
