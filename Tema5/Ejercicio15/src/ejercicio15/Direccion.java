package ejercicio15;

public class Direccion {

    private String calle, piso, ciudad;
    private int numero;

    Direccion(String c, String p, String ci, int n) {
        calle = c;
        piso = p;
        ciudad = ci;
        numero = n;
    }

    public int getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPiso() {
        return piso;
    }

    public void setCalle(String c) {
        calle = c;
    }

    public void setCuidad(String c) {
        ciudad = c;
    }

    public void setNumero(int n) {
        numero = n;
    }

    public void setPiso(String p) {
        piso = p;
    }

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
