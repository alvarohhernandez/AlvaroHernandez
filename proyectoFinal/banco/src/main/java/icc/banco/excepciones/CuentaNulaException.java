package banco;

/**
 * Esta clase modela las excepcion para cuenta nula
 * @author Alvaro Hernández
 * @version 1.0.0
 */
public class CuentaNulaException extends Exception {

    /**
     * Constructor de la clase CuentaNulaException
     */
    public CuentaNulaException(String msg) {
        super(msg);
    }
}
