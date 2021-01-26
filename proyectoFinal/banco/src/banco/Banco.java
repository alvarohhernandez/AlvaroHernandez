package banco;

import java.util.ArrayList;
import banco.CuentaNulaException;

/**
 * Esta clase modela la entidad Banco
 * @author Alvaro Hernández
 * @version 1.0.0
 */
public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    /**
     * Constructor para la clase Banco
     */
    public Banco() {
    }

    /**
     * Constructor para la clase Banco
     * @param cliente El parámetro cliente define el cliente inicial de un banco
     */
    public Banco(Cliente cliente) {
        this();
        try {
            this.agregarCliente(cliente);
        } catch (Exception e) {
          System.out.println("Exception" + e);
        }
    }

    /**
     * Método que agrega un cliente a la lista de clientes del banco
     * @param cliente El parámetro cliente define el objeto cliente que será agregado al banco
     */
    public void agregarCliente(Cliente cliente) throws CuentaNulaException {
        this.clientes.add(cliente);
        if (cliente.cuentas.size() == 0) {
            throw new CuentaNulaException("No se puede agregar un usuario sin una cuenta relacionada");
        }
        for (int i=0; i < cliente.cuentas.size(); i++) {
            this.agregarCuenta(cliente.cuentas.get(i));
        }
    }
    /**
     * Método que agrega una cuenta a la lista de cuentas del banco
     * @param cuenta El parámetro cuenta define el objeto cuenta que será agregado al banco
     */
    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    /**
     * Método que devuelve la representación en cadena de las cuentas del banco
     * @return cuentas La representación en cadenas de las cuentas del banco
     */
    public String getCuentas() {
        String cuentas = "Las cuentas son: ";
        for (int i=0; i < this.cuentas.size(); i++) {
            cuentas += this.cuentas.get(i);
        }

        return cuentas;
    }

    /**
     * Método que calcula los fondos del banco
     * @return double Los fondos del banco
     */
    public double calcularFondosDelBanco() {
        double fondos = 0;
        for (int i=0; i < this.cuentas.size(); i++) {
            Cuenta cuenta = this.cuentas.get(i);
            if (cuenta != null) {
            fondos += cuenta.getSaldo();
            }
        }

        return fondos;
    }

    /**
     * Método para imprimir los detalles del banco
     */
    @Override
    public String toString() {
        String banco = "Los detalles del banco son:";
        for (int i=0; i < this.clientes.size(); i++) {
            banco += this.clientes.get(i);
        }

        return banco;
    }

}
