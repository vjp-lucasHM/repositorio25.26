package ejercicio03;

public class Rueda {

    private String material;
    private int pulgadas;

    public void setMaterial(String m) {
        material = m;
    }

    public void setPulgadas(int p) {
        pulgadas = p;
    }

    public String getMaterial() {
        return material;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "material='" + material + '\'' +
                ", pulgadas=" + pulgadas +
                '}';
    }
}

