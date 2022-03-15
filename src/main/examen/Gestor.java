package examen;

/**
 * Estado Inicial del Proyecto
 */

public class Gestor {
    public String nombre;
    public double importeAutorizado;
    public String telefono;

    /**
     *
     * @param nombre Nombre del gestor
     * @param telefono Telefono del gestor
     * @param importeAutorizado importe autorizado del gestor
     */
    public Gestor(String nombre, String telefono, double importeAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeAutorizado = importeAutorizado;
    }

    /**
     *
     * @param nombre Nombre del gestor
     * @param telefono Telefono del gestor
     */

    public Gestor(String nombre, String telefono) {
       this(nombre,telefono, 10000);
    }

    /**
     *
     * @return nombre + importeAutorizado + telefono
     */

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", importeAutorizado=" + importeAutorizado +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}
