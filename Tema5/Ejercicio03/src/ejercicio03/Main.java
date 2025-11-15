package ejercicio03;

public class Main {
    public static void main(String[] args) {
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();

        rueda1.setMaterial("Caucho");
        rueda1.setPulgadas(7);

        rueda2.setMaterial("Caucho");
        rueda2.setPulgadas(10);

        System.out.println(rueda1);
        System.out.println(rueda2);

        System.out.println();

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.setMarca("Peugeot");
        coche1.setModelo("2008 Allure");
        coche2.setMarca("Fiat");
        coche2.setModelo("Freemont");
        coche3.setMarca("Seat");
        coche3.setMarca("Leon");

        coche1.setRueda(rueda1);
        coche2.setRueda(rueda2);
        coche3.setRueda(rueda2);

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
    }
}