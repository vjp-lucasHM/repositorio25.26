/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author tumba
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        boolean exit = false;
        int opcion;
        CuentaClave cuenta = null;

        do {
            Scanner scanner = new Scanner(System.in);
            mostrarOpciones();
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    
                    System.out.println("Por favor, introduce una clave...");
                    String clave = scanner1.nextLine();
                    
                    cuenta = new CuentaClave(clave);
                    System.out.println("Has creado una nueva cuenta!");
                    break;
                    
                case 2:
                    Scanner scanner11 = new Scanner(System.in);
                    
                    System.out.println("Por favor, introduce una clave...");
                    String clave22 = scanner11.nextLine();
                    
                    System.out.println("Por favor, introduce el saldo inicial de tu cuenta...");
                    float saldo = scanner11.nextFloat();
                    
                    cuenta = new CuentaClave(clave22,saldo);
                    System.out.println("Has creado una nueva cuenta con un saldo inicial de " + saldo);
                    break;
                    
                case 3:
                    if(cuenta == null) {
                        System.out.println("No has creado una cuenta!");
                        break;
                    }
                    
                    float dineroIngresar = pedirSaldo();
                    cuenta.ingresar(dineroIngresar);
                    System.out.println("Has sacado " + dineroIngresar + " de tu cuenta. Tu nuevo saldo es " + cuenta.getSaldo());
                    break;
                case 4:
                    if(cuenta == null) {
                        System.out.println("No has creado una cuenta!");
                        break;
                    }
                    
                    float dineroExtraer = pedirSaldo();
                    cuenta.extraer(dineroExtraer);
                    break;
                case 5:
                    if(cuenta == null) {
                        System.out.println("No has creado una cuenta!");
                        break;
                    }
                    
                    System.out.println("El saldo de tu cuenta es: " + cuenta.getSaldo());
                    break;
                case 6:
                    System.out.println(cuenta);
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!exit);
    }

    public static void mostrarOpciones() {
        System.out.println("1. - Crear cuenta vacia\n2. - Crear nueva cuenta con saldo inicial\n3. - Ingresar dinero\n4. - Sacar dinero\n5. - Ver saldo\n6. Salir");
    }
    
    public static float pedirSaldo() {
        Scanner scanner = new Scanner(System.in);
        float saldo = 0F;
        
        System.out.println("Por favor, introduce la cantidad de dinero que quieras...");
        
        if(scanner.hasNextFloat()) {
            saldo = scanner.nextFloat();
        }
        
        return saldo;
    }
    
}
