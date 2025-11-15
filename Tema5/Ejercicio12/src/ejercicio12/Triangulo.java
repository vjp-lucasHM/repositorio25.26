package ejercicio12;

public class Triangulo {

    private int cateto1, cateto2;

    Triangulo(int c1, int c2) {
        cateto1 = c1;
        cateto2 = c2;
    }

    public int getCateto1() {
        return cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public void setCateto1(int c) {
        cateto1 = c;
    }

    public void setCateto2(int c) {
        cateto2 = c;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                '}';
    }
}
