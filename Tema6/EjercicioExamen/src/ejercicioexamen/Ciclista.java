/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamen;

// Como en la clase hay metodos abstractos, marco la clase como abstracta
public abstract class Ciclista {
    
    // Definimos los atributos de la clase ciclista
    
    public static int CICLISTAS_CREADOS = 0;
    
    private String nombre;
    private int energia;
    private boolean escapado;
    private float kmDeMeta;
    private int numeroBidones;
    private float velocidad;
    private int nivelHidratacion;

    // Constructor por defecto y parametrizado
    
    public Ciclista() {
        this.nombre = "";
        this.energia = 50;
        this.escapado = false;
        this.kmDeMeta = 120F;
        this.numeroBidones = 2;
        this.velocidad = 0F;
        this.nivelHidratacion = 50;
        
        this.aumentarNumeroCiclistas();
    }

    public Ciclista(String nombre, boolean escapado, float velocidad) {
        this.nombre = nombre;
        this.energia = 50;
        this.escapado = escapado;
        this.kmDeMeta = 120F;
        this.numeroBidones = numeroBidones;
        this.velocidad = velocidad;
        this.nivelHidratacion = 50;
        
        this.aumentarNumeroCiclistas();
    }
    
    // Getters y setters

    public int getEnergia() {
        return energia;
    }

    public float getKmDeMeta() {
        return kmDeMeta;
    }

    public int getNivelHidratacion() {
        return nivelHidratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroBidones() {
        return numeroBidones;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public boolean isEscapado() {
        return escapado;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEscapado(boolean escapado) {
        this.escapado = escapado;
    }

    public void setKmDeMeta(float kmDeMeta) {
        this.kmDeMeta = kmDeMeta;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroBidones(int numeroBidones) {
        this.numeroBidones = numeroBidones;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    // Defino los metodos necesarios para la clase
    
    public final void cogerBidones() {
        if(kmDeMeta >= 10) {
            this.numeroBidones += 2;
        } else {
            System.out.println("No puedes coger bidones a menos de 10 km de la meta.");
        }
    }
    
    public final void tirarBidon() {
        this.numeroBidones--;
    }
    
    // Defino el toString

    @Override
    public String toString() {
        return "Ciclista{" + "nombre=" + nombre + ", energia=" + energia + ", escapado=" + escapado + ", kmDeMeta=" + kmDeMeta + ", numeroBidones=" + numeroBidones + ", velocidad=" + velocidad + ", nivelHidratacion=" + nivelHidratacion + '}';
    }
    
    // Defino los metodos abstractos necesarios
    
    public abstract void comer();
    public abstract void beber();
    
    // Metodos para el atributo CICLISTAS_CREADOS
    
    public static void aumentarNumeroCiclistas() {
        CICLISTAS_CREADOS++;
    }
    
    public static void verNumeroCiclistas() {
        System.out.println("El numero total de ciclistas creados es " + CICLISTAS_CREADOS);
    }
    
}
