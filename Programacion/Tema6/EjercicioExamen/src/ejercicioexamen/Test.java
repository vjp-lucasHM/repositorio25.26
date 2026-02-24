/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamen;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main() {
        
        // Defino los ciclistas
        
        CiclistaEscalador escalador = new CiclistaEscalador(300F, 25F, "Pablo", false, 40F);
        CiclistaSprinter sprinter = new CiclistaSprinter(40F, "Manuel", false, 20F);
        
        Ciclista.verNumeroCiclistas();
    
        // Creo la variable y primero la asigno a escalador
        
        System.out.println("-------- ESCALADOR ---------");
        
        Ciclista ciclista = escalador;
        
        // Llamo a los metodos de la clase ciclista y la muestro
        System.out.println(ciclista);
        ciclista.comer();
        ciclista.beber();
        System.out.println(ciclista);
        
        // Dejo un espacio en blanco
        System.out.println();
        
        System.out.println("-------- SPRINTER ---------");
        
        // Reasigno la variable de ciclista al ciclistasprinter
        ciclista = sprinter;
        
        // Llamo a los metodos de ciclista
        System.out.println(ciclista);
        ciclista.comer();
        ciclista.beber();
        System.out.println(ciclista);
        
        System.out.println("---------------------------------");
        
        // Creo la variable con tipo Pedaleable y la asigno primero a escalador
        
        Pedaleable pedaleable = escalador;
        
        System.out.println("-------- ESCALADOR ---------");
        
        // Llamo a los metodos de la interfaz pedaleableç
        System.out.println(pedaleable);
        pedaleable.atacar();
        pedaleable.recuperar(10F);
        pedaleable.sprintar();
        System.out.println(pedaleable);
        
        // Dejo un espacio en blanco
        System.out.println();
        
        System.out.println("-------- SPRINTER ---------");
        
        pedaleable = sprinter;
        
        // Llamo a los metodos de la interfaz pedaleable.
        System.out.println(pedaleable);
        pedaleable.atacar();
        pedaleable.recuperar(10F);
        pedaleable.sprintar();
        System.out.println(pedaleable);
    }
    
}
