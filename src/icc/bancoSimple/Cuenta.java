package icc.bancoSimple;

/*
 * Clase para modelar la cuenta bancaria de un banco
 * @author Alvaro Hernández
 */
public class Cuenta {
    private double saldo;
    private String nombre;

    /*
     * Constructor de la clase Cuenta
     */
    public Cuenta(double saldo, String nombre) {
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void retirarSaldo(double monto) {
        this.saldo -= monto;
    }

    public void depositarSaldo(double monto) {
        this.saldo += monto;
    }
}
