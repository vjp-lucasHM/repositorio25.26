import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca el segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Introduzca el tercer numero:");
        int num3 = scanner.nextInt();


        int suma = num1 + num2 + num3;
        int producto = num1*num2*num3;

        System.out.println("La suma de los numeros introducidos es " + suma);
        System.out.println("El producto de los numeros introducidos es " + producto);
    }
}