import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca la nota de Programacion:");
        double notaProg = scanner.nextDouble();

        System.out.println("Introduzca la nota de Lenguaje de Marcas:");
        double notaLMSGI = scanner.nextDouble();

        System.out.println("Introduzca la nota de Base de Datos:");
        double notaBBDD = scanner.nextDouble();

        System.out.println("Introduzca la nota de Entornos de Desarrollo:");
        double notaED = scanner.nextDouble();

        System.out.println("Introduzca la nota de Sistemas Informaticos:");
        double notaSI = scanner.nextDouble();

        System.out.println("Introduzca la nota de Formacion y Orientacion Laboral");
        double notaFOL = scanner.nextDouble();

        double notaMedia = (notaProg + notaLMSGI + notaBBDD + notaED + notaSI + notaFOL) / 6;
        System.out.println("Su nota media de el curso es " + notaMedia);
    }
}