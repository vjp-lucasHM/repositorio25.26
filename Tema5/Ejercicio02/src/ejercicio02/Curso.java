package ejercicio02;

public class Curso {

    private String nombre;
    private int numeroDeHoras;

    private static int numeroDeCursos = 0;

    public void sumarCursos() {
        numeroDeCursos++;
    }

    public int getNumeroDeCursos() {
        return numeroDeCursos;
    }

    public void establecerNombreyHoras(String n, int h) {
        nombre = n;
        numeroDeHoras = h;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeHoras=" + numeroDeHoras +
                '}';
    }
}
