import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un numero de 4 cifras:");
        int num = sc.nextInt();

        int num1 = num / 1000;
        int num2 = num / 100 % 10;
        int num3 = num / 10 % 10;
        int num4 = num % 10;

        System.out.println("El primer numero es " + num1);
        System.out.println("El segundo numero es " + num2);
        System.out.println("El tercer numero es " + num3);
        System.out.println("El cuarto numero es " + num4);
    }
}