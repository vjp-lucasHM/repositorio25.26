import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cantidad de segundos:");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = segundos % 3600 / 60;
        int sec = segundos % 3600 % 60;

        System.out.println(segundos + " segundos hacen un total de " + horas +  " horas, " + minutos + " minutos,  y " + segundos + " segundos.");
    }
}