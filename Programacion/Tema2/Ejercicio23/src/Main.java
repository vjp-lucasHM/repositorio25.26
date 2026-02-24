import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca el precio del modelo del ordenador que desea comprar:");
        float precio = scanner.nextFloat();

        System.out.println("¿Cuantas unidades quiere llevarse?");
        int unidades = scanner.nextInt();

        float total = precio * unidades;
        System.out.println("El precio total de su compra es de " + total + " euros.");
    }
}