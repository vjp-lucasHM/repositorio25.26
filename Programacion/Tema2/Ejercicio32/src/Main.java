import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, indique una cantidad de dinero:");
        int dinero = scanner.nextInt();

        int billetes50 = dinero / 50;
        int billetes20 = dinero % 50 / 20;
        int billetes10 = dinero%50%20/10;
        int billetes5 = dinero%50%20%10/5;
        int monedas2 = dinero%50%20%10%5/2;
        int monedas1 = dinero % 50 % 20 % 10 % 2;

        System.out.println(dinero + " euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros, y " + monedas1 + " monedas de 1 euro.");
    }
}