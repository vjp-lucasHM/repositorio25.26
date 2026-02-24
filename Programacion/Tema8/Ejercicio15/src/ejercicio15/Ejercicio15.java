/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula[] peliculas = new Pelicula[2];
        boolean exit = false;

        do {
            mostrarMenu();
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    mostrarPeliculasYSocios(peliculas);
                    break;
                case 3:
                    mostrarPeliculaMasRentable(peliculas);
                    break;
                case 4:
                    mostrarPeliculaMenosRentable(peliculas);
                    break;
                case 5:
                    mostrarInformacionPeliculaPedida(peliculas);
                    break;
                case 6:
                    mostrarNumeroSociosCantidadMayor(peliculas);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    System.out.println("Elige una opcion valida! (1-7)");
                    break;
            }
        } while (!exit);
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar las peliculas junto con los socios que han acudido a verla");
        System.out.println("2. Mostrar las peliculas y los socios que la han visto");
        System.out.println("3. Mostrar pelicula mas rentable");
        System.out.println("4. Mostrar pelicula menos rentable");
        System.out.println("5. Pedeir el nombre de una pelicula y mostrar el beneficio neto y toda la informacion de los socios que han acudido a verla.");
        System.out.println("6. Contar el numero de socios que han abonado una cantidad mayor a la pedida por pantalla.");
        System.out.println("7. Salir del programa.");
    }
    
    public static void rellenarPeliculas(Pelicula[] peliculas) {
        
    }

    public static void mostrarPeliculasYSocios(Pelicula[] peliculas) {

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                System.out.println("Pelicula numero " + (i + 1));
                System.out.println("Titulo: " + peliculas[i].getTitulo());
                System.out.println("Coste de licencia: " + peliculas[i].getCosteLicencia());
                System.out.println("Socios: ");

                for (int j = 0; j < peliculas[i].getSocios().length; j++) {
                    System.out.println("   Socio numero " + j + ": " + peliculas[i].getSocios()[j].toString());
                }

                System.out.println("----------------------------");
            }
        }
    }

    public static void mostrarPeliculaMasRentable(Pelicula[] peliculas) {
        double ventasMax = 0D;
        int indicePelicula = -1;

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                double ventas = 0D;

                for (int j = 0; j < peliculas[i].getSocios().length; j++) {
                    ventas += peliculas[i].getSocios()[j].getPrecioAbonado();
                }

                ventas -= peliculas[i].getCosteLicencia();

                if (ventas > ventasMax) {
                    ventasMax = ventas;
                    indicePelicula = i;
                }
            }
        }

        if (indicePelicula == -1) {
            System.out.println("No hay ninguna pelicula!");
        } else {
            Pelicula peli = peliculas[indicePelicula];

            System.out.println("La pelicula mas rentable ha sido " + peli.getTitulo() + " con un beneficio neto de " + ventasMax);
        }
    }

    public static void mostrarPeliculaMenosRentable(Pelicula[] peliculas) {
        double ventasMin = 0D;
        int indicePelicula = -1;

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                double ventas = 0D;

                for (int j = 0; j < peliculas[i].getSocios().length; j++) {
                    ventas += peliculas[i].getSocios()[j].getPrecioAbonado();
                }

                ventas -= peliculas[i].getCosteLicencia();

                if (ventas < ventasMin) {
                    ventasMin = ventas;
                    indicePelicula = i;
                }
            }
        }

        if (indicePelicula == -1) {
            System.out.println("No hay ninguna pelicula!");
        } else {
            Pelicula peli = peliculas[indicePelicula];

            System.out.println("La pelicula menos rentable ha sido " + peli.getTitulo() + " con un beneficio neto de " + ventasMin);
        }
    }

    public static void mostrarInformacionPeliculaPedida(Pelicula[] peliculas) {
        int i = 0;
        Pelicula peli = null;
        boolean encontrado = false;
        Scanner scanner = new Scanner(System.in);

        while (!encontrado && i < peliculas.length) {
            System.out.println("Introduce el nombre de la pelicula que quieras buscar:");
            if (scanner.nextLine().equalsIgnoreCase(peliculas[i].getTitulo())) {
                encontrado = true;
                peli = peliculas[i];
            } else {
                i++;
            }
        }

        if (!encontrado || peli == null) {
            System.out.println("No se ha encontrado una pelicula con este nombre.");
        } else {
            System.out.println(peli.getTitulo());

            double ventas = 0D;

            for (int j = 0; j < peliculas[i].getSocios().length; j++) {
                ventas += peliculas[i].getSocios()[j].getPrecioAbonado();
            }

            ventas -= peliculas[i].getCosteLicencia();

            System.out.println("Beneficio neto: " + ventas);
            System.out.println("Socios: ");

            for (int j = 0; j < peliculas[i].getSocios().length; j++) {
                System.out.println("   Socio numero " + j + ": " + peliculas[i].getSocios()[j].toString());
            }
        }
    }

    public static void mostrarNumeroSociosCantidadMayor(Pelicula[] peliculas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad abonada:");
        double cantidad = scanner.nextDouble();

        boolean encontrado = false;

        for (Pelicula peli : peliculas) {
            if (peli != null) {
                for (Socio socio : peli.getSocios()) {
                    if(socio != null && socio.getPrecioAbonado() > cantidad) {
                        System.out.println(socio.toString());
                        encontrado = true;
                    }
                }
            }
        }
        
        if(!encontrado) {
            System.out.println("No se han encontrado socios que hayan abonado cantidades mayores a " + cantidad);
        }
    }

}
