package ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c1 = pedirCateto(1);
        int c2 = pedirCateto(2);

        Triangulo triangulo = new Triangulo(c1,c2);

        System.out.println("La longitud de la hipotenusa es " + calcularHipotenusa(triangulo));
    }

    public static int pedirCateto(int catetoNum) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce el tamaño del cateto numero " + catetoNum);

        return scanner.nextInt();
    }

    public static double calcularHipotenusa(Triangulo triangulo) {
        return Math.sqrt(Math.pow(triangulo.getCateto1(),2) + Math.pow(triangulo.getCateto2(),2));
    }
}