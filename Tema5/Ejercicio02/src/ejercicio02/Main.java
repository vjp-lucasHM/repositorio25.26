package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.establecerNombreyHoras("ESO", 2100);
        curso2.establecerNombreyHoras("Bachillerato", 1900);

        for (int i = 0; i < 5; i++) {
            curso1.sumarCursos();
        }

        for (int i = 0; i < 3; i++) {
            curso2.sumarCursos();
        }

        System.out.println(curso1);
        System.out.println(curso2 + "\n\nNumero de cursos: " + curso2.getNumeroDeCursos());
    }
}