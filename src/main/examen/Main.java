package examen;

/**
 * Estado Inicial del Proyeto
 */

public class Main {
    public static void main(String[] args) {

        Gestor g1 = new Gestor("Antonio","666 123456");
        Gestor g2 = new Gestor("Adela","667 987654",20000);

        CuentaCorriente c = new CuentaCorriente("12345678A","Pepe");
        CuentaCorriente d = new CuentaCorriente("87654321Z",2000);
        CuentaCorriente e = new CuentaCorriente("87654321Z", "Paca", 2000);


        c.mostrarInformacion();
        d.mostrarInformacion();
        e.mostrarInformacion();
        c.setGestor(g1);
        d.setGestor(g2);
        c.mostrarInformacion();
        d.mostrarInformacion();

    }
}
