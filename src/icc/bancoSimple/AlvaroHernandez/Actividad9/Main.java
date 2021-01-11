import banco.Cuenta;
import banco.Cliente;

/**
 * Esta clase modela las pruebas para el proyecto bancoSimple
 * @author Alvaro Hernández
 */
public class Main {
    public static void main(String[] args) {
        Cuenta nuevaCuenta;
        Cliente cliente1;
        Cliente cliente2;

        nuevaCuenta = new Cuenta(305307451, 30000);
        cliente1 = new Cliente("Alvaro", "Hernández", "Hernández", "20-03-1991", "draco_90@ciencias.unam.mx", nuevaCuenta);
        cliente2 = new Cliente("Alvaro", "Hernández", "Hernández", "20-03-1990", "draco_90@ciencias.unam.mx", 305307451, 30000);
        
        nuevaCuenta.retira(10000);
        nuevaCuenta.deposita(5000);

        System.out.println("Cliente1: " + cliente1);
        System.out.println("Cliente2: " + cliente2);
    }
}
