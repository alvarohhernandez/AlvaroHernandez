package icc.banco.utilidades;

import banco.Cliente;
import banco.Cuenta;
import banco.CuentaDebito;
import banco.CuentaCredito;
import icc.banco.ui.UsoBanco;
import java.io.BufferedReader;
import java.io.FileReader;

public class LeeBaseDatos {
    public static void leeClientes() {
        String fileClientes = "../resources/clientes.csv";
        String row;
        try {
            BufferedReader csvClientes = new BufferedReader(new FileReader(fileClientes));
            while ((row = csvClientes.readLine()) != null) {
                String[] data = row.split(",");
                Cliente cliente = new Cliente(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5]);
                LeeBaseDatos.leeCuentas(cliente);
            }
            csvClientes.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void leeCuentas(Cliente cliente) {
        String fileCuentas = "../resources/cuentas.csv";
        String row;
        try {
            BufferedReader csvCuentas = new BufferedReader(new FileReader(fileCuentas));
                while ((row = csvCuentas.readLine()) != null) {
                    String[] data = row.split(",");
                    if (Integer.parseInt(data[0]) == cliente.getNoCliente()) {
                        Cuenta cuenta;
                        if (data[2].equals("D")) {
                            cuenta = new CuentaDebito(Integer.parseInt(data[1]), Double.parseDouble(data[3]));
                        } else {
                            cuenta = new CuentaCredito(Integer.parseInt(data[1]), Double.parseDouble(data[3]));
                        }
                        cliente.agregarCuenta(cuenta);
                    }
                }
                UsoBanco.banco.agregarCliente(cliente);
            csvCuentas.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
