package banco;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;

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
    protected ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
    private int contador;

    /**
     * Constructor para el cliente
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param paterno El parámetro paterno define el apellido paterno del cliente
     * @param materno El parámetro materno define el apellido materno del cliente
     * @param fechaNacimiento El parámetro fechaNacimiento define la fecha de nacimiento del cliente
     * @param email El parámetro email define el correo electrónico del cliente
     * @param cuenta El parámetro cuenta define la cuenta bancaria del cliente
     */
    public Cliente(String nombre, String paterno, String materno, String fechaNacimiento, String email) {
        this.contador = 0;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        try {
          this.fechaNacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
        } catch (Exception e) {
          System.out.println("Exception" + e);
        }
        this.email = email;
    }

    /**
     * Constructor para el cliente
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param paterno El parámetro paterno define el apellido paterno del cliente
     * @param materno El parámetro materno define el apellido materno del cliente
     * @param fechaNacimiento El parámetro fechaNacimiento define la fecha de nacimiento del cliente
     * @param email El parámetro email define el correo electrónico del cliente
     * @param cuenta El parámetro cuenta define la cuenta bancaria del cliente
     */
    public Cliente(String nombre, String paterno, String materno, String fechaNacimiento, String email, Cuenta cuenta) {
        this(nombre, paterno, materno, fechaNacimiento, email);
        this.agregarCuenta(cuenta);
    }

    /**
     * Constructor para el cliente
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param paterno El parámetro paterno define el apellido paterno del cliente
     * @param materno El parámetro materno define el apellido materno del cliente
     * @param fechaNacimiento El parámetro fechaNacimiento define la fecha de nacimiento del cliente
     * @param email El parámetro email define el correo electrónico del cliente
     * @param numero El parámetro numero define el numero de cuenta para la cuenta bancaria del cliente
     * @param tipo El parámetro tipo define el tipo de cuenta bancaria (debito|credito)
     */
    public Cliente(String nombre, String paterno, String materno, String fechaNacimiento, String email, int numero, String tipo) {
        this(nombre, paterno, materno, fechaNacimiento, email);
        if (tipo == "debito") {
            this.agregarCuenta(new CuentaDebito(numero));
        } else if (tipo == "credito" ) {
            this.agregarCuenta(new CuentaCredito(numero));
        }
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
    public String printNombreCompleto() {
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
    public int calculaEdad() {
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
     * Método que imprime los detalles de las cuentas bancarias del cliente
     * @return Los detalles de las cuentas bancaria del cliente
     */
    public String printCuentas() {
        String cuentas = "";
        for (int i=0; i < this.cuentas.size(); i++) {
            cuentas = cuentas + this.cuentas.get(i);
        }

        return cuentas;
    }

    /**
     * Método que devuelve la i-esima cuenta bancaria del cliente
     * @param i El parámetro i representa la posición correspondiente a la cuenta bancaria que deseamos obtener
     * @return La i-esima cuenta bancaria del cliente
     */
    public Cuenta printCuenta(int i) {
        return this.cuentas.get(i);
    }

    /**
     * Método para agregar una cuenta bancaria al cliente
     * @param cuenta El parámetro cuenta hace referencia al objeto cuenta de la cuenta bancaria
     */
    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
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
                        + "\n   Cuentas:"
                        + " %5$2s",
                        this.printNombreCompleto(),
                        this.getFechaNacimiento(),
                        this.calculaEdad(),
                        this.email,
                        this.printCuentas());

        return cliente;
    }

    /**
     * Método para verificar si un cliente es igual a otro cliente
     * @param cliente El parámetro cliente hace referencia al objeto de tipo Cliente, contra el cual se desea
     *                comparar
     * @return boolean True si los clientes son iguales, false en caso contrario
     */
     @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Cliente) {
            Cliente cliente = (Cliente) object;
            return this.nombre == cliente.nombre
                   && this.paterno == cliente.paterno
                   && this.materno == cliente.materno
                   && this.fechaNacimiento.equals(cliente.fechaNacimiento);
        } else {
            return false;
        }
    }
}
