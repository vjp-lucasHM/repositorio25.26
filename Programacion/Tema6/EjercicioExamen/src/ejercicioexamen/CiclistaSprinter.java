/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamen;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable {
    
    // Defino los atributos de la clase
    
    private float aceleracion;
    
    // Defino los constructores por defecto y parametrizados

    public CiclistaSprinter() {
        super();
        this.aceleracion = 0F;
    }

    public CiclistaSprinter(float aceleracion, String nombre, boolean escapado, float velocidad) {
        super(nombre, escapado, velocidad);
        this.aceleracion = aceleracion;
    }
    
    // Getters y setters

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    // Defino el tOString

    @Override
    public String toString() {
        return super.toString() + "CiclistaSprinter{" + "aceleracion=" + aceleracion + '}';
    }
    
    // Sobreescribo los metodos de la clase padre

    @Override
    public void comer() {
        if(this.getKmDeMeta() > 10) {
            this.setEnergia(this.getEnergia()+10);
            System.out.println("El sprinter " + this.getNombre() + " acaba de tomar un gel. Su energia ahoar es de " + this.getEnergia());
        }
    }

    @Override
    public void beber() {
        if(this.getNumeroBidones() == 0) {
            this.cogerBidones();
        }
        
        this.setNivelHidratacion(this.getNivelHidratacion()+5);
        this.tirarBidon();
        System.out.println("El sprinter " + this.getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de " + this.getNivelHidratacion());
    }
    
    // Implemento los metodos heredados de la interfaz

    @Override
    public void sprintar() {
        if(this.getKmDeMeta() < 1F && this.getEnergia() >= 50) {
            this.setVelocidad(this.getVelocidad() + aceleracion);
            this.setEnergia(this.getEnergia()-50);
            System.out.println("El sprinter " + this.getNombre() + " esta sprintando a " + this.getVelocidad() + " km/h");
        } else {
            System.out.println("Aun no puedes esprintar");
        }
    }

    @Override
    public void atacar() {
        if(!this.isEscapado()) {
            this.setEscapado(true);
            this.setNivelHidratacion((int) (this.getNivelHidratacion()*0.9));
            System.out.println("El sprinter " + this.getNombre() + " esta atacando");
        }
    }

    @Override
    public float recuperar(float kmRecuperacion) {
        if(this.getKmDeMeta() >= 5) {
            int energiaRecuperada = 0;
            energiaRecuperada += this.getEnergia();
            energiaRecuperada += (kmRecuperacion * 5);
            this.setEnergia(energiaRecuperada);
            System.out.println(this.getNombre() + " esta recuperando");
        }
        
        return this.getEnergia();
    }
    
}
