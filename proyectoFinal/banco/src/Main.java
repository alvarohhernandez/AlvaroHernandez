import banco.Cuenta;
import banco.CuentaDebito;
import banco.CuentaCredito;
import banco.Cliente;

/**
 * Esta clase modela las pruebas para el proyecto bancoSimple
 * @author Alvaro Hernández
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1;
        Cliente cliente2;
        Cuenta cuentaDebito;
        Cuenta cuentaCredito;
        Cuenta cuentaDebito2;
        Cuenta cuentaCredito2;
        Cuenta cuentaCredito3;

        
        cuentaDebito = new CuentaDebito(305307450, 5000);
        cuentaCredito = new CuentaCredito(305307451);
        cuentaDebito2 = new CuentaDebito(305307451, 10000);
        cuentaCredito2 = new CuentaCredito(305307451);
        cuentaCredito3 = new CuentaCredito(305307456);
        cliente1 = new Cliente("Alvaro", "Hernández", "Hernández", "20-03-1990", "draco_90@ciencias.unam.mx", 305307452, "debito");
        cliente2 = new Cliente("Alvaro", "Hernández", "Hernández", "20-03-1990", "draco_90@ciencias.unam.mx", cuentaCredito);

        try {
            cuentaDebito.depositar(-5000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            cuentaDebito.retirar(40000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            cuentaDebito.depositar(55000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            cuentaCredito.depositar(10000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            cuentaCredito.retirar(40000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("CuentaDebito: " + cuentaDebito);
        System.out.println("CuentaCredito: " + cuentaCredito);

        cliente1.agregarCuenta(cuentaDebito);
        cliente1.agregarCuenta(cuentaCredito3);
        cliente2.agregarCuenta(cuentaDebito2);
        cliente2.agregarCuenta(cuentaCredito2);

        System.out.println("Cliente1: " + cliente1);
        System.out.println("Cliente2: " + cliente2);
        System.out.println("Cliente2 - Cuenta 2: " + cliente2.printCuenta(1));
    }
}
