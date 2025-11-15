package ejercicio13;

public class Saludo {

    private String frase;

    Saludo() {
        frase = "Hola, que tal";
    }

    Saludo(String f) {
        frase = f;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String f) {
        frase = f;
    }

    public void imprimir() {
        System.out.println(frase);
    }

    public void imprimirVeces(int n) {
        for(int i = 0; i < n; i++) {
            imprimir();
        }
    }
}
