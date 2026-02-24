package ejercicio14;

public class Numero {

    private int valor;

    Numero() {}

    public int getValor() {
        return valor;
    }

    public void setValor(int v) {
        valor = v;
    }

    public void verTablaDeMultiplicar() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + i*valor);
        }
    }
}
