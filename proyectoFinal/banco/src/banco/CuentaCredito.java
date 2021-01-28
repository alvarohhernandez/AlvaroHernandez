package banco;

/**
 * Esta clase modale la cuenta de crédito de un banco
 * @author Alvaro Hernández Hernández
 */
public class CuentaCredito extends Cuenta {
    private double credito;

    /**
     * Constructor para la cuenta de crédito
     * @param numero El parámetro numero define el número de cuenta de la cuenta de crédito
     */
    public CuentaCredito() {
        super();
        this.credito = 30000;
        this.saldo = this.credito;
    }

    /**
     * Método que retira saldo de la cuenta de crédito
     * @param monto El parámetro monto define la cantidad a retirar de la cuenta de crédito
     */
    @Override
    public void retirar(double monto) throws Exception {
        if (monto > this.credito) {
            throw new Exception("El monto máximo por retiro es de $ " + this.credito);
        } else {
            super.retirar(monto);
        }
    }

    /**
     * Método para obtener los detalles de la cuenta de crédito
     * @return Los detalles de la cuenta de crédito
     */
    @Override
    public String toString() {
        String cuenta = "\n El tipo de cuenta es: Crédito"
                        + super.toString()
                        + "\n   El crédito inicial de la cuenta es: $ " + this.credito;

        return cuenta;
    }
}
