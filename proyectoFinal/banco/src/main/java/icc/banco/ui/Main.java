import banco.Cuenta;
import banco.CuentaDebito;
import banco.CuentaCredito;
import banco.Cliente;
import banco.Banco;

/**
 * Esta clase modela las pruebas para el proyecto bancoSimple
 * @author Alvaro Hernández
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1;
        Cliente cliente2;
        Cuenta cuentaDebito;
        Cuenta cuentaCredito;
        Cuenta cuentaDebito2;
        Cuenta cuentaCredito2;
        Cuenta cuentaCredito3;

        
        cuentaDebito = new CuentaDebito(5000);
        cuentaCredito = new CuentaCredito();
        cuentaDebito2 = new CuentaDebito(10000);
        cuentaCredito2 = new CuentaCredito();
        cuentaCredito3 = new CuentaCredito();
        cliente1 = new Cliente("Alvaro", "Hernández", "Hernández", "20-03-1990", "draco_90@ciencias.unam.mx", "debito");
        cliente2 = new Cliente("Alvaro", "Hernández", "Hernández", "20-03-1990", "draco_90@ciencias.unam.mx", cuentaDebito);

        try {
            banco.agregarCliente(cliente1);
        } catch (Exception e) {
          System.out.println(e);
        }

        try {
            banco.agregarCliente(cliente2);
            System.out.println(banco);
        } catch (Exception e) {
          System.out.println(e);
        }
    }
}
