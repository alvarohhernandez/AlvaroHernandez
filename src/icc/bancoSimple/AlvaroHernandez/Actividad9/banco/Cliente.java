package banco;

/**
 * Esta clase modela el cliente de un banco
 * @author Alvaro Hernández
 */
public class Cliente {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String email;

    /**
     * Constructor para el cliente
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param paterno El parámetro paterno define el apellido paterno del cliente
     * @param materno El parámetro materno define el apellido materno del cliente
     * @param edad El parámetro edad define la edad del cliente
     * @param email El parámetro email define el correo electrónico del cliente
     */
    public Cliente(String nombre, String paterno, String materno, int edad, String email) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Método que devuelve el nombre del cliente
     * @return El nombre del cliente
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método que devuelve el apellido paterno del cliente
     * @return El apellido paterno del cliente
     */
    public String getPaterno() {
        return this.paterno;
    }

    /**
     * Método que devuelve el apellido materno del cliente
     * @return El apellido materno del cliente
     */
    public String getMaterno() {
        return this.materno;
    }

    /**
     * Método que devuelve el nombre completo del cliente
     * @return El nombre completo del cliente
     */
    public String getNombreCompleto() {
        return String.format("%1$2s %2$2s %3$2s", this.nombre, this.paterno, this.materno);
    }

    /**
     * Método que devuelve la edad del cliente
     * @return La edad del cliente
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Método que devuelve el email del cliente
     * @return El email del cliente
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Método para obtener los detalles del cliente
     * @return Los detalles del cliente
     */
    @Override
    public String toString() {
        String cliente = String.format("\n   El nombre del cliente es: %1$2s"
                        + "\n   La edad del cliente es: %2$2s años"
                        + "\n   El email del cliente es: %3$2s", this.getNombreCompleto(), this.edad, this.email);

        return cliente;
    }
}
