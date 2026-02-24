/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion; 
        
        do {
            opcion = pedirOpcionMenuMain();
            
            switch(opcion) {
                case 1:
                    int senial = pedirSenial();
                    analizarFrecuencia(senial); 
                    break;
                case 2:
                    pedirYAjustarPotencias();
                    break;
                case 3:
                    float radio = pedirRadioPlaneta();
                    double volumen = calcularVolumen(radio);
                    
                    System.out.println("El volumen de este planeta es " + volumen);
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;
            }
        } while(opcion > 1 && opcion <= 3);
    }
    
    public static void mostrarOpciones() {
        System.out.println("Por favor, introduce una se de las siguientes opciones:\n1. Introduce un numero que represente una señal recibida del espacio\n2. Ajustar las potencias de sus motores antes del lanzamiento\n3. Calcular el volumen de un planeta.\n4. Salir del programa.");
    }
    
    public static int pedirOpcionMenuMain() {
        Scanner scanner = new Scanner(System.in);
        boolean valida = false;
        int opcion = 0;
        
        do {
            mostrarOpciones();
            
            try {
                opcion = scanner.nextInt();
                valida = true;
            } catch(InputMismatchException ex) {
                System.out.println("Opcion no valida! Por favor, introduce una que sea valida.");
            }
        } while(!valida);
        
        return opcion;
    }
    
    public static int pedirPotencia() {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        int potencia = 0;
        
        do {
            System.out.println("Por favor, introduce una potencia:");
            
            try {
                potencia = scanner.nextInt();
                valido = true;
            } catch(InputMismatchException ex) {
                System.out.println("Por favor, introduce una opcion valida.");
            }
        }while(!valido);
        
        return potencia;
    }
    
    public static String ajustarPotencias(int p1, int p2, int p3) {
        int aux;
        
        if(p3 > p1) {
            aux = p1;
            p1 = p3;
            p3 = aux;
        }
        
        if(p1 > p2) {
            aux = p1;
            p1 = p2;
            p2 = aux;
        }
        
        if(p2 > p3) {
            aux = p3;
            p3 = p2;
            p2 = aux;
        } 
        
        return p1 + " " + p2 + " " + p3;
        
    }
    
    public static void pedirYAjustarPotencias() {
        System.out.println("Por favor, introduce tres potencias");
        
        int p1 = pedirPotencia();
        int p2 = pedirPotencia();
        int p3 = pedirPotencia();
        
        System.out.println(ajustarPotencias(p1, p2, p3));
;    }
    
    public static float pedirRadioPlaneta() {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        float radio = 0.0F;
        
        System.out.println("Introduce el radio de tu planeta deseado. (Usa comas en vez de puntos)");
            
        do {
            try {
                if(scanner.hasNextFloat()) {
                    radio = scanner.nextFloat();
                    valido = true;
                }
            } catch(InputMismatchException ex) {
                System.out.println("Has introducido un radio no valido! Por favor, introduce uno que lo sea.");
            }
        } while(!valido);
        
        return radio;
    }
    
    public static double calcularVolumen(float radio) {
        return ((4/3)*Math.PI*Math.pow(radio, 3));
    }
    
    public static int pedirSenial() {
        Scanner scanner = new Scanner(System.in);
        boolean valida = false;
        int senial = 0;
        
        System.out.println("Por favor, introduce una señal valida.");
            
        do {
            try {
                senial = scanner.nextInt();
                valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Señal no valida! Por favor, introduce una señal que sea valida.");
            }
        } while(!valida);
        
        return senial;
    }
    
    public static void analizarFrecuencia(int frecuencia) {
        boolean encontrado = false;
        int i = 1;
        
        do {
            i++;
            
            if(frecuencia % i == 0) {
                encontrado = true;
                System.out.println("Se he encontrado el patron: " + i);
            }
        } while(!encontrado);
    }
    
}
