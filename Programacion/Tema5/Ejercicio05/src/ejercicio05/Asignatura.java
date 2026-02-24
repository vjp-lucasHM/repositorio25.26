package ejercicio05;

public class Asignatura {

    private String nombre;
    private int nota;

    Asignatura() {
        nombre = "";
        nota = 0;
    }

    public Asignatura(String n, int n2) {
        nombre = n;
        nota = n2;
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setNota(int n) {
        nota = n;
    }
}
