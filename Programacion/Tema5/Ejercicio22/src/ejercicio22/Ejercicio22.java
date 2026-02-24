/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio22 {
    
    public static float precioTotal = 0;
    
    public static Producto productoPeces = new Producto("Peces", 10F, 40);
    public static Producto productoTortugas = new Producto("Tortugas", 20F, 30);
    public static Producto productoCanarios = new Producto("Canarios", 15F, 25);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        int opcion = 0;
        Producto productoElegido = null;
        
        do {
            mostrarOpciones();
            
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    productoElegido = productoPeces;
                    break;
                case 2:
                    productoElegido = productoTortugas;
                    break;
                case 3:
                    productoElegido = productoTortugas;
                    break;
                default:
                    break;
            }
            
            System.out.println("Ha elegido comprar " + productoElegido.getNombre());
            
            hacerPreguntasVenta(productoElegido);
            
            System.out.println("Desea hacer otra compra?");
            
            String siONo = scanner.next();
            
            if(siONo.equalsIgnoreCase("no")) {
                System.out.println("El total de su compra asciende a " + precioTotal + " euros.");
                System.out.println("Vuelva cuando quiera.");
                exit = true;
            }
            
        } while(!exit);
    }
    
    public static void mostrarOpciones() {
        System.out.println("--- Bienvenido a mi tienda de mascotas ---");
        System.out.println("Pulse 1 para comprar " + productoPeces.getNombre() + " cuyo precio es de " + productoPeces.getPrecio() + " euros y el stock es de " + productoPeces.getStock() + " unidades.");
        System.out.println("Pulse 2 para comprar " + productoTortugas.getNombre() + " cuyo precio es de " + productoTortugas.getPrecio() + " euros y el stock es de " + productoTortugas.getStock() + " unidades.");
        System.out.println("Pulse 3 para comprar " + productoCanarios.getNombre() + " cuyo precio es de " + productoCanarios.getPrecio() + " euros y el stock es de " + productoCanarios.getStock() + " unidades.");
    }
    
    public static void hacerPreguntasVenta(Producto producto) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantas unidades desea?");
        int unidades = scanner.nextInt();
        
        precioTotal += (unidades*producto.getPrecio());
        producto.setStock(producto.getStock()-unidades);
        
        System.out.println("Venta realizada con éxito");
    }
    
    

}
