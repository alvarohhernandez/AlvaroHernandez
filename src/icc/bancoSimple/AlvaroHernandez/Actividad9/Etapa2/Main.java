import bancosimple.Cuenta;
import bancosimple.Cliente;

/**
 * Esta clase modela las pruebas para el proyecto bancoSimple
 * @author Alvaro Hernández
 */
public class Main {
    public static void main(String[] args) {
        Cuenta nuevaCuenta;
        Cliente nuevoCliente;

        nuevaCuenta = new Cuenta(305307451, 30000);
        nuevoCliente = new Cliente("Alvaro", "Hernández", "Hernández", 30, "draco_90@ciencias.unam.mx");
        
        nuevaCuenta.retirarSaldo(10000);
        nuevaCuenta.depositarSaldo(5000);

        System.out.println("Cuenta: " + nuevaCuenta);
        System.out.println("Cliente: " + nuevoCliente);
    }
}
