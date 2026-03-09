/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche[] garaje = new Coche[9];
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    aparcarCoche(garaje);
                    break;
                case 2:
                    mostrarPlazasLibres(garaje);
                    break;
                case 3:
                    mostrarCochesAparcados(garaje);
                    break;
                case 4:
                    buscarPorTitular(garaje);
                    break;
                case 5:
                    buscarPorMatricula(garaje);
                    break;
                case 6:
                    mostrarGarajeMatriz(garaje);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida! Intenta de nuevo.");
            }
        } while(opcion != 7);
    }
    
    public static void mostrarPlazasLibres(Coche[] garaje) {
        String plazas = "";
        for(int i = 0; i < garaje.length; i++) {
            if(garaje[i] == null) {
                plazas += " [ " + (i+1) + " ] ";
            }
        }
        
        System.out.println("Las plazas libres en el garaje actualmente son las siguientes:");
        System.out.println(plazas);
    }
    
    public static void aparcarCoche(Coche[] garaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la posición en la que quieras aparcar (1-9)");
        boolean valido = false;
        int posicion = 1;
        
        do {
            try {
                posicion = scanner.nextInt();
                
                if(posicion >= 1 && posicion <= 9) {
                    if(garaje[posicion - 1] == null) {
                        valido = true;
                    } else {
                        System.out.println("Esa plaza ya está ocupada! Elige otra");
                    }
                } else {
                    System.out.println("Debes introducir una posicion comprendida entre el 1 y el 9!");
                }
            } catch(InputMismatchException ex) {
                System.out.println("Introduce una posicion valida! (1-9)");
            }
        } while(!valido);
        
        System.out.println("Introduce el titular del vehiculo.");
        String titular = scanner.next();
        
        scanner.nextLine();
        
        System.out.println("Introduce la matricula del vehiculo.");
        String matricula = scanner.next();
        
        Coche coche = new Coche(titular, matricula);
        
        garaje[posicion - 1] = coche;
        
        System.out.println("Coche aparcado exitosamente!");
       
    }
    
    public static void mostrarCochesAparcados(Coche[] garaje) {
        for(Coche coche : garaje) {
            if(coche != null) {
                System.out.println(" - " + coche.toString());
            }
        }
    }
    
    public static void buscarPorMatricula(Coche[] garaje) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce la matricula que deseas buscar.");
        String matricula = scanner.next();
        boolean encontrada = false;
        int i = 0;
        
        while(!encontrada && i < garaje.length) {
            if(garaje[i] != null && garaje[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Coche encontrado!");
                System.out.println(" - " + garaje[i].toString());
                encontrada = true;
            } else {
                i++;
            }
        }
        
        if(!encontrada) {
            System.out.println("No se ha encontrado ningun vehiculo con esta matricula.");
        }
    }
    
    public static void buscarPorTitular(Coche[] garaje) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el inicio del nombre de los titulares que deseas buscar");
        String titular = scanner.next();
        String resultado = "";
        
        for(Coche coche : garaje) {
            if(coche != null && coche.getTitular().startsWith(titular)) {
                resultado += (coche.getTitular() + "#");
            }
        }
        
        System.out.println(resultado);
    }
    
    public static void mostrarGarajeMatriz(Coche[] garaje) {
        char[][] matriz = new char[2][2];
        
        int contador = 0;
        int j = 0;
        boolean llena = false;
        
        for(int i = 0; !llena; i++) {
            
            if(j < 2) {
                llena = true;
            }
            
            matriz[i][j] = llenaOVacia(garaje[contador]);
            contador++;
            
            if(i < 2) {
                i = 0;
                j++;
            }
            
        }
        
        for(int i = 0; i < matriz.length; i++) {
            for(int k = 0; k < matriz[i].length; k++) {
                System.out.println(matriz[i][k]);
            }
        }
    }
    
    public static char llenaOVacia(Coche plaza) {
        if(plaza == null) {
            return 'L';
        } else {
            return 'X';
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. - Aparcar coche");
        System.out.println("2. - Mostrar plazas de garajes libers");
        System.out.println("3. - Mostrar los datos de todos los coches aparcados");
        System.out.println("4. - Buscar titulares con un texto dado");
        System.out.println("5. - Buscar coche por matrícula");
        System.out.println("6. - Mostrar las plazas del garaje que estén libres.");
        System.out.println("7. - Salir del programa");
    }
    
}
