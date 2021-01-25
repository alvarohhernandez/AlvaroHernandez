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

        System.out.println(cliente1.equals(cliente2));
    }
}
