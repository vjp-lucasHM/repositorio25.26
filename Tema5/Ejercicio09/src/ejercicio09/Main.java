package ejercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Numero num1 = pedirNumero();
        Numero num2 = pedirNumero();
        Numero num3 = pedirNumero();

        System.out.println("El numero mayor de los 3 que has introducido es " + calcularMayor(num1,num2,num3));

    }

    public static Numero pedirNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un numero:");

        return new Numero(scanner.nextInt());
    }

    public static int calcularMayor(Numero num1, Numero num2, Numero num3) {
        return Math.max(num1.getValor(), Math.max(num2.getValor(), num3.getValor()));
    }
}