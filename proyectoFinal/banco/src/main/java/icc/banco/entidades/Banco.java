package banco;

import java.util.ArrayList;
import banco.CuentaNulaException;

/**
 * Esta clase modela la entidad Banco
 * @author Alvaro Hernández
 * @version 1.0.2
 */
public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

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
        if (cliente.cuentas.size() == 0) {
            throw new CuentaNulaException("No se puede agregar un usuario sin una cuenta relacionada");
        }
        this.clientes.add(cliente);
    }

    /**
     * Método que calcula los fondos del banco
     * @return double Los fondos del banco
     */
    public double calcularFondosDelBanco() {
        double fondos = 0;
        for (Cliente cliente : this.clientes) {
            for (Cuenta cuenta : cliente.cuentas) {
                fondos += cuenta.getSaldo();
            };
        };

        return fondos;
    }

    /**
     * Método que busca un cliente en la lista de clientes del banco
     * @param email El parámetro email hace referencia al email del usuario que deseamos buscar
     * @return Los datos del cliente o null
     */
    public Cliente buscarCliente(String email) {
        Cliente cliente = null;
        for(Cliente item : this.clientes) {
            if (item.getEmail().equals(email)) {
                cliente = item;
            }
        }

        return cliente;
    }

    /**
     * Método para imprimir los detalles del banco
     */
    @Override
    public String toString() {
        String banco = "Los detalles del banco son:";
        for (Cliente cliente : this.clientes) {
            banco += cliente;
        }

        return banco;
    }

}
