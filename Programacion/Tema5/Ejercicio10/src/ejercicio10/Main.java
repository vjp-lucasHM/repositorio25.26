package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int num3 = pedirNumero();
        int num4 = pedirNumero();

        System.out.println("Números ordenados de mayor a menor: " + ordenarMenorAMayor(num1,num2,num3,num4));
    }

    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un numero:");

        return scanner.nextInt();
    }

    public static String ordenarMenorAMayor(int num1, int num2, int num3, int num4) {

        int aux;

        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if(num1 > num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if(num1 > num4){
            aux = num1;
            num1 = num4;
            num4 = aux;
        }

        if(num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        if(num2 > num4){
            aux = num2;
            num2 = num4;
            num4 = aux;
        }

        if(num3 > num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        }

        return num1 + " " + num2 + " " + num3 + " " + num4;
    }
}