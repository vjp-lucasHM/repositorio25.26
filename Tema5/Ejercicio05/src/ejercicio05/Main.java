package ejercicio05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1 = pedirNota("Programación");
        int n2 = pedirNota("Lenguaje de Marcas");
        int n3 = pedirNota("Base de Datos");
        int n4 = pedirNota("Entornos de Desarrollo");
        int n5 = pedirNota("Sistemas Informáticos");
        int n6 = pedirNota("Formación y Orientación Laboral");

        System.out.println("La nota media del curso es " + calcularNotaMedia(n1,n2,n3,n4,n5,n6));

    }

    public static int pedirNota(String asignatura) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce la nota de " + asignatura + ":");

        return scanner.nextInt();
    }

    public static int calcularNotaMedia(int n1, int n2, int n3, int n4, int n5, int n6) {
        return (n1+n2+n3+n4+n5+n6)/6;
    }

}