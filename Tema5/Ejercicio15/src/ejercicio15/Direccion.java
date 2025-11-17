package ejercicio15;

public class Direccion {

    // Definimos los atributos de la clase Direccion
    private String calle, piso, ciudad;
    private int numero;

    // Definimos el constructor de esta clase para inicializar los atributos
    Direccion(String c, String p, String ci, int n) {
        calle = c;
        piso = p;
        ciudad = ci;
        numero = n;
    }

    // Definimos el getter de numero
    public int getNumero() {
        return numero;
    }

    // Definimos el getter de calle
    public String getCalle() {
        return calle;
    }

    // Definimos el getter de ciudad
    public String getCiudad() {
        return ciudad;
    }

    // Definimos el getter de piso
    public String getPiso() {
        return piso;
    }

    // Definimos el setter de calle
    public void setCalle(String c) {
        calle = c;
    }

    // Definimos el setter de ciudad
    public void setCuidad(String c) {
        ciudad = c;
    }

    // Definimos el setter de numero
    public void setNumero(int n) {
        numero = n;
    }

    // Definimos el setter de piso
    public void setPiso(String p) {
        piso = p;
    }

    // Definimos el toString() de este objeto para convertirlo en una String cuando sea necesario
    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", piso='" + piso + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", numero=" + numero +
                '}';
    }
}
