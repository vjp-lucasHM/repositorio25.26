/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexament10_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class EjercicioExamenT10_11 {

    // Metodo main que usaremos para invocar todas las funciones que hemos hecho en el programa.
    public static void main(String[] args) {
        ArrayList<Deporte> deportes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Opcion que usaremos para añadir un deporte al arraylist principal
                    añadirDeporte(deportes);
                    break;
                case 2: // Usamos este metodo para mostrar cada deporte con los equipos que lo juegan
                    mostrarEquiposYDeportes(deportes);
                    break;
                case 3: // Usamos esta opcion para buscar cierto equipo en un deporte.
                    buscarEquipoEnDeporte(deportes);
                    break;
                case 4: // Usamos esta opcion para mostrar todos los equipos desde un mapa
                    mostrarMapaDeEquipos(deportes);
                    break;
                case 5: // Metodo que mostrara todos los equipos ordenados de mayor a menor trofeos ganados
                    mostrarMenorAMayor(deportes);
                    break;
                case 6: // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 6);
    }

    // Añadimos un deporte a la lista de deportes que pasamos como parametro al metodo
    // y tantos equipos al deporte como el usuario quiera.
    public static void añadirDeporte(ArrayList<Deporte> deportes) {
        String nombre = pedirString("Introduce el nombre del deporte");
        Set<Equipo> equipos = new HashSet<>();

        String yesOrNo;
        do {
            yesOrNo = pedirString("Deseas añadir un equipo? (s/n)");

            switch (yesOrNo) {
                case "s":
                    String codigo = pedirString("Introduce el codigo del equipo:");
                    String nombreEquipo = pedirString("Introduce el nombre del equipo:");
                    int trofeos = pedirNumero("Cuantos trofeos ha ganado este equipo?");

                    Equipo equipo = new Equipo(codigo, nombreEquipo, trofeos);

                    System.out.println("Equipo añadido correctamente.");
                    equipos.add(equipo);
                    
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Introduce una opcion valida.");
            }
        } while (!yesOrNo.equalsIgnoreCase("n"));

        Deporte dep = new Deporte(nombre, equipos);

        deportes.add(dep);
    }

    // Hacemos un bucle por todos los deportes y luego a cada equipo de cada deporte y los imprimimos.
    public static void mostrarEquiposYDeportes(ArrayList<Deporte> deportes) {
        int cont = 1;

        for (Deporte deporte : deportes) {
            System.out.println("Deporte | Numero " + cont);
            System.out.println(" - Nombre: " + deporte.getNombre());
            System.out.println(" - Equipos que lo juegan:");
            for (Equipo equipo : deporte.getEquipos()) {
                System.out.println("   - " + equipo.toString());
            }
        }

        cont++;
    }
    
    // Buscamos el equipo que queremos encontrar con un iterador
    // y dependiendo de si lo encontramos o no, le damos un mensaje al usuario.
    public static void buscarEquipoEnDeporte(ArrayList<Deporte> deportes) {
        boolean encontrado = false;
        String nombreABuscar = pedirString("Introduce el nombre del equipo que quieres buscar.");
        Equipo eqqq = null;
        
        Iterator<Deporte> iterator = deportes.iterator();
        
        while(iterator.hasNext() && !encontrado) {
            Deporte dep = iterator.next();
            
            for(Equipo eq : dep.getEquipos()) {
                if(eq.getNombre().equalsIgnoreCase(nombreABuscar)) {
                    eqqq = eq;
                    encontrado = true;
                }
            }
        }
        
        if(encontrado) {
            System.out.println("Se ha encontrado el equipo buscado!");
            System.out.println(" - " + eqqq);
        } else {
            System.out.println("El equipo que buscabas no se ha encontrado.");
        }
    }
    
    // Añadimos todos los equipos al mapa con sus respectivas claves
    // y luego, con un iterador los imprimimos todos a pantalla
    public static void mostrarMapaDeEquipos(ArrayList<Deporte> deportes) {
        Map<String,Equipo> mapaMostrar = new HashMap<>();
        
        for(Deporte deporte : deportes) {
            for(Equipo equipo : deporte.getEquipos()) {
                if(equipo.getTrofeosGanados() >= 3) {
                    mapaMostrar.put(equipo.getCodigo(), equipo);
                }
            }
        }
        
        Iterator<Entry<String,Equipo>> iterator = mapaMostrar.entrySet().iterator();
        
        System.out.println("Datos del mapa usando un iterador:");
        
        while(iterator.hasNext()) {
            Entry<String,Equipo> en = iterator.next();
            
            String clave = en.getKey();
            Equipo valor = en.getValue();
            
            System.out.println("Equipo con clave " + clave);
            System.out.println(" - Nombre: " + valor.getNombre());
            System.out.println(" - Trofeos ganados: " + valor.getTrofeosGanados());
            System.out.println();
            
        }
    }
    
    // Creamos un arraylist secundario en el que añadimos todos los equipos y ordenaremos usando la interfaz 
    // Comparable que he añadido a la clase.
    public static void mostrarMenorAMayor(ArrayList<Deporte> deportes) {
        ArrayList<Equipo> toSort = new ArrayList<>();
        for(Deporte deporte : deportes) {
            toSort.addAll(deporte.getEquipos());
        }
        
        Collections.sort(toSort);
        
        System.out.println("--- EQUIPOS ORDENADOS DE MAYOR A MENOR TROFEOS GANADOS ---");
        
        for(Equipo equipo : toSort.reversed()) {
            System.out.println(equipo);
        }
    }

    // Metodo que usamos para mostrar el menu de opciones al usuario
    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. - Añadir un deporte a la lista.");
        System.out.println("2. - Mostrar deportes y equipos.");
        System.out.println("3. - Buscar equipo en deporte");
        System.out.println("4. - Mostrar mapa de equipos");
        System.out.println("5. - Mostrar todos los equipos de todos los deportes ordenados de mayor a menor numero de trofeos ganados.");
        System.out.println("6. - Salir del programa");
        System.out.println("INTRODUCE UNA OPCION:");
    }

    // Metodos que usaremos para pedirle datos al usuario
    public static String pedirString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int pedirNumero(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

}
