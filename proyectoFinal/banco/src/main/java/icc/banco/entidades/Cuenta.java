package banco;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Esta clase modela la cuenta bancaria de un banco
 * @author Alvaro Hernández
 */
public class Cuenta {
    private int numero;
    protected double saldo;

    /**
     * Constructor para la cuenta bancaria
     */
    public Cuenta() {
        this.numero = this.generaNumeroCuenta();
        this.guardaNumeroCuenta(numero);
        this.saldo = 0;
    }

    /**
     * Construnctor para la cuenta bancaria, se utiliza para el poblado de cuentas desde archivos
     * @param numeroCta El parámetro numeroCta define el numero de cuenta de la cuenta bancaria
     */
    public Cuenta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    /**
     * Constructor para la cuenta bancaria
     * @param saldo El parámetro saldo define el saldo inicial de la cuenta bancaria
     */
    public Cuenta(double saldo) {
        this();
        this.saldo = saldo;
    }

    /**
     * Constructor para la cuenta bancaria
     * @param saldo El parámetro saldo define el saldo inicial de la cuenta bancaria
     */
    public Cuenta(int numero, double saldo) {
        this(numero);
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

   /** Método para generar número de cuenta incremental
    * @return El numero de cuenta
    */
    private int generaNumeroCuenta() {
        int numCuenta = 0;
        File cuentas = new File("../resources/cuentas.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(cuentas));
            String cuenta;
            try {
                while ((cuenta = br.readLine()) != null) {
                    numCuenta = Integer.parseInt(cuenta);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        return numCuenta + 1;
    }

    /**
     * Método para guardar número de cuenta
     */
    private void guardaNumeroCuenta(int numero) {
        File cuentas = new File("../resources/cuentas.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(cuentas));
            writer.write(Integer.toString(numero));
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
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
