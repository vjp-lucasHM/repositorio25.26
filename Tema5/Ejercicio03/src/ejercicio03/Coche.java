package ejercicio03;

public class Coche {

    private String marca;
    private String modelo;
    private Rueda rueda;

    public Rueda getRueda() {
        return rueda;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public void setRueda(Rueda r) {
        rueda = r;
    }

    @Override
    public String
    toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", rueda=" + rueda +
                '}';
    }
}
