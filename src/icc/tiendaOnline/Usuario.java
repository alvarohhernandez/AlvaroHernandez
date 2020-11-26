package icc.tiendaOnline;

/*
 * Esta clase modela los usuarios de una tienda online
 * @author Alvaro Hernández
 *
 */
public class Usuario {
    private String nombre;
    private String paterno;
    private String materno;
    private String fechaNacimiento;

    /*
     * Constructor de la clase Usuario
     * @params nuevoNombre : Nombre del Usuario
     *         nuevoPaterno : Apellido Paterno del Usuario
     */
    public Usuario(String nuevoNombre, String nuevoPaterno, String nuevoMaterno, String nuevoFechaNacimiento) {
        nombre = nuevoNombre;
        paterno = nuevoPaterno;
        materno = nuevoMaterno;
        fechaNacimiento = nuevoFechaNacimiento;
    }

    /*
     * Método para obtener el nombre del Usuario
     * @return El nombre del Usuario
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método para obtener el apellido paterno del Usuario
     * @return El apellido paterno del Usuario
     */
    public String getPaterno() {
        return paterno;
    }

    /*
     * Método para obtener el apellido materno del Usuario
     * @return El apellido materno del Usuario
     */
    public String getMaterno() {
        return materno;
    }

    /*
     * Método para obtener la fecha de nacimiento del Usuario
     * @return La fecha de nacimiento del Usuario
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
