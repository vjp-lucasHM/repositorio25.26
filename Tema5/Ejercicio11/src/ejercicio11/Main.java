package ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numero num1 = pedirNumero();
        Numero num2 = pedirNumero();

        if(num1.getValor() > 10) {
            System.out.println("La operacion realizada será la multiplicacion y el resultado es " + multiplicar(num1,num2));
        } else {
            System.out.println("La operacin realizada sera la suma y el resultado es " + sumar(num1,num2));
        }
    }

    public static Numero pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        Numero num = new Numero();

        System.out.println("Por favor, introduce un numero;");

        num.setValor(scanner.nextInt());

        return num;
    }

    public static int sumar(Numero num1, Numero num2) {
        return num1.getValor() + num2.getValor();
    }

    public static int multiplicar(Numero num1, Numero num2) {
        return num1.getValor() * num2.getValor();
    }
}