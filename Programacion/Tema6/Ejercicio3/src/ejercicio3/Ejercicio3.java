/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos de cada figura geometrica
        Circulo circulo = new Circulo("Azul", 5.5);
        Rectangulo rectangulo = new Rectangulo("Verde", 4.75, 5.56);
        Cuadrado cuadrado = new Cuadrado("Verde", 6.75);
        TrianguloRectangulo triangulo = new TrianguloRectangulo("Amarillo", 5, 5.90);
        
        //Mostrar datos de cada figura usando el método auxiliar mostrarFigura()
        mostrarFigura(circulo);
        mostrarFigura(rectangulo);
        mostrarFigura(cuadrado);
        mostrarFigura(triangulo);
        
        // Metodos del triangulo
        System.out.println("Hipotenusa del triangulo: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo: " + triangulo.getTipoTriangulo());
        
        System.out.println("");
        
        //Objetos que se crean desde la Clase FiguraGeometrica
        FiguraGeometrica figuraCirculo = new Circulo("Rojo", 5.5);
        FiguraGeometrica figuraRectangulo = new Rectangulo("Azul", 6.75, 2.56);
        FiguraGeometrica figuraCuadrado = new Cuadrado("Rojo", 4.75);
        FiguraGeometrica figuraTriangulo = new TrianguloRectangulo("Verde", 2.75, 2.75);
        
        // Creamos los objetos de cada figura geometrica usando polimorfismo
        mostrarFigura(figuraCirculo);
        mostrarFigura(figuraRectangulo);
        mostrarFigura(figuraCuadrado);
        mostrarFigura(figuraTriangulo);
    }
    
    public static void mostrarFigura(FiguraGeometrica figura){
        System.out.println("\nColor: " + figura.getColor());
        System.out.println("Area: " + figura.calcularArea());
        System.out.println("Perimetro: " + figura.calcularPerimetro());
    }
    
}
