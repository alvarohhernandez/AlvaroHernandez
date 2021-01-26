package banco;

/**
 * Esta clase modela la cuenta bancaria de un banco
 * @author Alvaro Hernández
 */
public class Cuenta {
    private int numero;
    protected double saldo;

    /**
     * Constructor para la cuenta bancaria
     * @param numero El parámetro numero define el numero de cuenta de la cuenta bancaria
     */
    public Cuenta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    /**
     * Constructor para la cuenta bancaria
     * @param numero El parámetro numero define el numero de cuenta de la cuenta bancaria
     * @param saldo El parámetro saldo define el saldo inicial de la cuenta bancaria
     */
    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el numero de cuenta bancaria
     * @return El numero de cuenta bancaria
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Método que devuelve el saldo de la cuenta bancaria
     * @return El saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Método que retira saldo de la cuenta bancaria
     * @param monto El parámetro monto define la cantidad a retirar de la cuenta bancaria
     * @throws SaldoException Validaciones del monto
     */
    public void retirar(double monto) throws Exception {
        if (monto <= 0) {
            throw new Exception("El monto a retirar debe ser mayor a $ 0.00");
        } else if (monto > this.saldo) {
            throw new Exception("Fondos insuficientes. El saldo actual de la cuenta es $ " + this.saldo);
        } else {
            this.saldo -= monto;
        }
    }

    /**
     * Método que deposita saldo a la cuenta bancaria
     * @param monto El parámetro monto defina la cantidad a depositar en la cuenta bancaria
     */
    public void depositar(double monto) throws Exception {
        if (monto <= 0) {
            throw new Exception("El monto a depositar debe ser mayor a $ 0.00");
        } else  {
            this.saldo += monto;
        }
    }

    /**
     * Método para obtener los detalles de la cuenta bancaria
     * @return Los detalles de la cuenta bancaria
     */
    @Override
    public String toString() {
        String cuenta = "\n   El numero de cuenta es: " + this.numero
                        + "\n   El saldo de la cuenta es: $ " + this.saldo;

        return cuenta;
    }
}