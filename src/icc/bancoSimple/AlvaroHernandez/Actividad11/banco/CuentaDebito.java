package banco;

/**
 * Esta clase modela la cuenta de débito de un banco
 * @author Alvaro Hérnadez Hernández
 */
public class CuentaDebito extends Cuenta {
    private double limite;

    /**
     * Constuctor para la cuenta de débito
     * @param numero El parámetro numero define el número de cuenta de la cuenta bancaria
     */
    public CuentaDebito(int numero) {
        super(numero);
        this.limite = 30000;
    }

    /**
     * Constuctor para la cuenta de débito
     * @param numero El parámetro numero define el número de cuenta de la cuenta bancaria
     * @param saldo El parámetro saldo define el saldo inicial de la cuenta bancaria
     */
    public CuentaDebito(int numero, double saldo) {
        super(numero, saldo);
        this.limite = 30000;
    }

    /**
     * Método que deposita saldo a la cuenta de débito
     * @param monto El parámetro monto defina la cantidad a depositar en la cuenta de débito
     */
    @Override
    public void depositar(double monto) throws Exception {
        if ((this.saldo + monto) > this.limite) {
            throw new Exception("El límite máximo permitido en la cuenta es $ " + this.limite);
        } else  {
            super.depositar(monto);
        }
    }

    /**
     * Método para obtener los detalles de la cuenta de débito
     * @return Los detalles de la cuenta de débito
     */
    @Override
    public String toString() {
        String cuenta = "\n El tipo de cuenta es: Débito"
                        + super.toString()
                        + "\n   El límite de la cuenta es: $ " + this.limite;

        return cuenta;
    }
}
