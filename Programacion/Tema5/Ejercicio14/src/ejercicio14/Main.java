package ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numero num = new Numero();
        num.setValor(pedirNumero());
        num.verTablaDeMultiplicar();
    }

    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un numero:");

        return scanner.nextInt();
    }
}