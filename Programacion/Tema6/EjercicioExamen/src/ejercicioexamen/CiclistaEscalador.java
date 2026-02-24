/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamen;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable {
    
    // Defino los atributos de la clase
    
    private float potencia, fuerza;
    
    // Defino los constructores de la clase, ya que no se heredan los constructores de la clase padre
    // Defecto y parametrizado

    public CiclistaEscalador() {
        super();
        this.potencia = 0F;
        this.fuerza = 0F;
    }

    public CiclistaEscalador(float potencia, float fuerza, String nombre, boolean escapado, float velocidad) {
        super(nombre, escapado, velocidad);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    
    // Getters y setters

    public float getPotencia() {
        return potencia;
    }

    public float getFuerza() {
        return fuerza;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }
    
    // Defino el toString
    
    @Override
    public String toString() {
        return super.toString() +"CiclistaEscalador{" + "potencia=" + potencia + ", fuerza=" + fuerza + '}';
    }
    
    // Sobreescribo los metodos de la clase pader (ciclista)

    @Override
    public void comer() {
        if(this.getKmDeMeta() >= 20) {
            this.setEnergia(this.getEnergia()+30);
            System.out.println("El escalador" + this.getNombre() + " acaba de tomar un gel. Su energia ahora es " + this.getEnergia());
        }
    }

    @Override
    public void beber() {
        if(this.getNumeroBidones() == 0) {
            this.cogerBidones();
        }
        
        this.setNivelHidratacion(this.getNivelHidratacion()+10);
        this.tirarBidon(); this.tirarBidon();
        System.out.println("El escalador " + this.getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de " + this.getNivelHidratacion());
    }
    
    // Implemento todos los metodos definidos en el interfaz

    @Override
    public void sprintar() {
        if(this.getKmDeMeta() <= 0.3F && this.getEnergia() >= 20) {
            this.setVelocidad(potencia / fuerza);
            this.setEnergia(this.getEnergia()-20);
            System.out.println("El escalador " + this.getNombre() + " esta esprintando a " + this.getVelocidad() + " km/h");
        } else {
            System.out.println("Aun no puedes esprintar.");
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
        if(this.getKmDeMeta() > 5F) {
            int energiaRecuperada = 0;
            energiaRecuperada += this.getEnergia();
            energiaRecuperada += (kmRecuperacion * 5);
            this.setEnergia(energiaRecuperada);
            System.out.println(this.getNombre() + " esta recuperando");
        }
        
        return this.getEnergia();
    }
    
}
