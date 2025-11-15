package ejercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un numero:");

        Numero numero = new Numero(scanner.nextInt());

        if(esPar(numero)) {
            System.out.println("tu numero es par");
        } else {
            System.out.println("tu numero es impar");
        }
    }

    public static boolean esPar(Numero num) {
        return num.getValor() % 2 == 0;
    }
}