package ejercicio15;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pablo", 1500, new Direccion("Vijay Nagar", "Block B, Dugri Road", "Indore", 50));
        Empleado empleado2 = new Empleado("Rosa", 2000, new Direccion("Vijay Nagar", "Block B, Dugri Road", "Indore", 50));
        Empleado empleado3 = new Empleado("Lucas", 3000, new Direccion("Vijay Nagar", "Block B, Dugri Road", "Indore", 50));

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}