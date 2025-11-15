package ejercicio15;

public class Empleado {

    private String nombre;
    private int salario;
    private Direccion direccion;

    Empleado(String n, int s, Direccion d) {
        nombre = n;
        salario = s;
        direccion = d;
    }

    public void setDireccion(Direccion d) {
        direccion = d;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setSalario(int s) {
        salario = s;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", direccion=" + direccion +
                '}';
    }
}
