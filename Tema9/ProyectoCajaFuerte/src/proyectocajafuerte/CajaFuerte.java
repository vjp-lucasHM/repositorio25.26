/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocajafuerte;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CajaFuerte {
    
    private Moneda[][] monedas;

    public CajaFuerte() {
        this.monedas = new Moneda[9][1];
    }

    public Moneda[][] getMonedas() {
        return monedas;
    }

    public void setMonedas(Moneda[][] monedas) {
        this.monedas = monedas;
    }

    @Override
    public String toString() {
        return "CajaFuerte{" + "monedas=" + monedas + '}';
    }
    
    public void rellenarCompartimento() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que compartimento quieres rellenar? (1-9)");
        int compartimento = pedirCompartimento() - 1;
        
        System.out.println("De que pais proviene esta moneda?");
        String pais = scanner.nextLine();
        
        System.out.println("De que material esta hecha esta moneda?");
        String material = scanner.nextLine();
        
        System.out.println("Que valor tiene esta moneda?");
        float valor = scanner.nextFloat();
        
        this.monedas[compartimento][0] = new Moneda(valor, pais, material);
    }
    
    public void mostrarMasValiosa() {
        Moneda max = null;
        int index = -1;
        for(int i = 0; i < monedas.length; i++) {
            if(max == null && monedas[i][0] != null) {
                max = monedas[i][0];
                index = i;
            }
            
            if(monedas[i][0] != null && monedas[i][0].getValor() > max.getValor()) {
                max = monedas[i][0];
                index = i;
            }
        }
        
        if(max == null) {
            System.out.println("No has puesto ninguna moneda dentro de la caja fuerte.");
        } else {
            System.out.println("La moneda mas valiosa en la caja fuerte tiene un valor de:" + max.getValor()+ ", proviene de " + max.getPais() + ", y esta hecha de " + max.getMaterial());
            System.out.println("Se encuentra en el compartimento nº " + (index+1));
        }
    }
    
    public void mostrarMonedaMaterial() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que material estas buscando?");
        String material = scanner.nextLine();
        
        for(int i = 0; i < monedas.length; i++) {
            if(monedas[i][0] != null && material.equalsIgnoreCase(monedas[i][0].getMaterial())) {
                monedas[i][0].mostrarMoneda();
                System.out.println("Esta moneda se encuentra en el compartimento nº" + (i+1));
                System.out.println();
            }
        }
    }
    
    public static int pedirCompartimento() {
        boolean valido = false;
        int numero = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            try {
                int aux = scanner.nextInt();

                if (aux >= 1 && aux <= 9) {
                    numero = aux;
                    valido = true;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introduce una opcion valida! (1-9)");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }
    
}
