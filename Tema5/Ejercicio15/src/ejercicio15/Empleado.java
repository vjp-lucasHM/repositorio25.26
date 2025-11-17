package ejercicio15;

public class Empleado {

    // Definimos los atributos de la clase Empleado
    private String nombre;
    private int salario;
    private Direccion direccion;

    // Definimos el constructor de esta clase para inicializar los atributos
    Empleado(String n, int s, Direccion d) {
        nombre = n;
        salario = s;
        direccion = d;
    }

    // Definimos el setter de direccion
    public void setDireccion(Direccion d) {
        direccion = d;
    }

    // Definimos el setter de nombre
    public void setNombre(String n) {
        nombre = n;
    }

    // Definimos el setter de salario
    public void setSalario(int s) {
        salario = s;
    }

    // Definimos el getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Definimos el getter de direccion
    public Direccion getDireccion() {
        return direccion;
    }

    // Definimos el getter de salario
    public int getSalario() {
        return salario;
    }

    // Definimos el metodo toString() para convertir este objeto en una String
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", direccion=" + direccion +
                '}';
    }
}
