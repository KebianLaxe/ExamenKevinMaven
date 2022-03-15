package examen;

/** Clase de Cuenta
 *
 */

/**
 * Estado Inicial del Proyecto
 */

public class CuentaCorriente {
    public String dni;
    public String nombreTitular;
    public double saldo;
    Gestor gestor;

    /**
     *
     * @param dni DNI CuentaCorriente
     * @param nombreTitular nombreTitular CuentaCorriente
     */

    public CuentaCorriente(String dni, String nombreTitular) {
        this(dni,nombreTitular,0);
    }

    /**
     *
     * @param dni DNI Titular
     * @param saldo Saldo Titular
     */

    public CuentaCorriente(String dni, double saldo) {
        this(dni,"Sin asignar", saldo);
    }

    /**
     *
     * @param dni DNI Titular
     * @param nombreTitular NombreTitular
     * @param saldo Saldo Titular
     */

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    /**
     *
     * @param dni DNI Cliente
     * @param nombreTitular Nombre Cliente
     * @param saldo Saldo Cliente
     * @param gestor Nombre Gestor
     */

    public CuentaCorriente(String dni, String nombreTitular,double saldo, Gestor gestor) {
        this(dni,nombreTitular,saldo);
        this.gestor = gestor;
    }

    /**
     *
     * @param gestor Nombre Gestor
     */

    void setGestor (Gestor gestor) {
        this.gestor = gestor;
    }

    /**
     *
     * @param cantidad Cantidad Dinero Sacado
     * @return
     */

    boolean sacarDinero(double cantidad) {
        boolean operacionCorrecta;
        if (saldo >=cantidad) {
            saldo-=cantidad;
            operacionCorrecta = true;
        }

        else {
            System.out.println("No hay saldo suficiente");
            operacionCorrecta = false;
        }
        return operacionCorrecta;

    }

    /**
     *
     * @param cantidad Cantidad Dinero Ingresada
     */

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    void mostrarInformacion() {
         if (gestor == null)
            System.out.println("No hay gestor asignado");
        else
            System.out.println(gestor.toString());

        System.out.printf("Nombre: %s \nDNI: %s \nSaldo: %.2f\n\n",nombreTitular,dni,saldo);
    }
}
