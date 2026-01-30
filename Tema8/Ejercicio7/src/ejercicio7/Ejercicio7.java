/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;

        Dia[] mes = new Dia[30];
        String[] diasSemana = {
            "Lunes", "Martes", "Miercoles",
            "Jueves", "Viernes", "Sabado", "Domingo"
        };

        do {
            mostrarMenu();
            int opcion = pedirOpcion();

            switch (opcion) {
                case 1:
                    rellenarAleatorio(mes, diasSemana);
                    break;
                case 2:
                    mostrarTemperaturas(mes);
                    break;
                case 3:
                    mostrarTemperaturaMedia(mes);
                    break;
                case 4:
                    mostrarDiasCalurosos(mes);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public static void mostrarDiasCalurosos(Dia[] mes) {
        if (mes[0] == null) {
            System.out.println("Primero debes rellenar las temperaturas.");
        }

        int tempMax = mes[0].getTemperatura();

        for (int i = 1; i < mes.length; i++) {
            if (mes[i].getTemperatura() > tempMax) {
                tempMax = mes[i].getTemperatura();
            }
        }

        System.out.println("\nDía(s) más caluroso(s) del mes:");
        for (int i = 0; i < mes.length; i++) {
            if (mes[i].getTemperatura() == tempMax) {
                System.out.println(mes[i]);
            }
        }
    }

    public static void mostrarTemperaturas(Dia[] mes) {
        if (mes[0] == null) {
            System.out.println("Primero debes rellenar las temperaturas.");
        } else {
            for (int i = 0; i < mes.length; i++) {
                System.out.println("Temperatura del " + mes[i].getNombreDia() + " Día " + i + " -> " + mes[i].getTemperatura());
            }
        }
    }

    public static void mostrarTemperaturaMedia(Dia[] mes) {
        if (mes[0] == null) {
            System.out.println("Primero debes rellenar las temperaturas.");
        } else {
            int suma = 0;

            for (Dia dia : mes) {
                suma += dia.getTemperatura();
            }

            double media = suma / mes.length;

            System.out.println("La temperatura media de este mes ha sido de " + media);
        }
    }

    public static void rellenarAleatorio(Dia[] mes, String[] diasSemana) {
        int indiceDiaSemana = generarRandom(0, 7);

        for (int i = 0; i < mes.length; i++) {
            String diaSemana = diasSemana[indiceDiaSemana];
            int temperatura = generarRandom(-5, 45);

            mes[i] = new Dia(diaSemana, temperatura);
            indiceDiaSemana = (indiceDiaSemana + 1) % 7;
        }
    }

    public static int pedirOpcion() {
        boolean valido = false;
        int numero = 0;

        do {
            System.out.println("Introduce una opcion valida! (1-5)");
            Scanner scanner = new Scanner(System.in);

            try {
                int aux = scanner.nextInt();

                if (aux >= 1 && aux <= 5) {
                    numero = aux;
                    valido = true;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida! (1-5)");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar de forma aleatoria las temperaturas.\n2. Mostrar las temperaturas\n3. Visualizar la temperatura media del mes.\n4. Día o dias mas calurosos del mes\n5. Salir del programa.");
    }

    public static int generarRandom(int min, int max) {
        int random = (int) ((((max - min) + 1) * Math.random()) + min);
        return random;
    }

}
