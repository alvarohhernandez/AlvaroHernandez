package banco;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 * Esta clase modela el cliente de un banco
 * @author Alvaro Hernández
 */
public class Cliente {
    private String nombre;
    private String paterno;
    private String materno;
    private Date fechaNacimiento;
    private String email;
    private Cuenta cuenta;

    /**
     * Constructor para el cliente
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param paterno El parámetro paterno define el apellido paterno del cliente
     * @param materno El parámetro materno define el apellido materno del cliente
     * @param fechaNacimimento El parámetro fechaNacimiento define la fecha de nacimiento del cliente
     * @param email El parámetro email define el correo electrónico del cliente
     * @param cuenta El parámetro cuenta define la cuenta bancaria del cliente
     */
    public Cliente(String nombre, String paterno, String materno, String fechaNacimiento, String email, Cuenta cuenta) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        try {
          this.fechaNacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
        } catch (Exception e) {
          System.out.println("Exception" + e);
        }
        this.email = email;
        this.cuenta = cuenta;
    }

    /**
     * Constructor para el cliente
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param paterno El parámetro paterno define el apellido paterno del cliente
     * @param materno El parámetro materno define el apellido materno del cliente
     * @param fechaNacimimento El parámetro fechaNacimiento define la fecha de nacimiento del cliente
     * @param email El parámetro email define el correo electrónico del cliente
     * @param numero El parámetro numero define el numero de cuenta para la cuenta bancaria del cliente
     * @param saldo El pararámetro saldo define el saldo para la cuenta bancaria del cliente
     */
    public Cliente(String nombre, String paterno, String materno, String fechaNacimiento, String email, int numero, double saldo) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        try {
          this.fechaNacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
        } catch (Exception e) {
          System.out.println("Exception" + e);
        }
        this.email = email;
        this.cuenta = new Cuenta(numero, saldo);
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
     * Método que devuelve la fecha de nacimiento del cliente
     * @return La fecha de nacimiento del cliente
     */
    public String getFechaNacimiento() {
        return new SimpleDateFormat("yyyy-MM-dd").format(this.fechaNacimiento);
    }

    /**
     * Método que devuelve la edad del cliente
     * @return La edad del cliente
     */
    public int getEdad() {
        LocalDate fechaNacimiento = this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, today);
        int anios = edad.getYears();

        return anios;
    }

    /**
     * Método que devuelve el email del cliente
     * @return El email del cliente
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Método que devuelve la cuenta bancaria del cliente
     * @return La cuenta bancaria del cliente
     */
    public Cuenta getCuenta() {
        return this.cuenta;
    }

    /**
     * Método para obtener los detalles del cliente
     * @return Los detalles del cliente
     */
    @Override
    public String toString() {
        String cliente = String.format("\n   El nombre del cliente es: %1$2s"
                        + "\n   La fecha de nacimiento del cliente es: %2$2s"
                        + "\n   La edad del cliente es: %3$2s años"
                        + "\n   El email del cliente es: %4$2s"
                        + "\n   Cuenta:"
                        + " %5$2s",
                        this.getNombreCompleto(),
                        this.getFechaNacimiento(),
                        this.getEdad(),
                        this.email,
                        this.cuenta);

        return cliente;
    }
}
