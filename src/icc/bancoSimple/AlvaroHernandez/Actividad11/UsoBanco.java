import banco.Cuenta;
import banco.CuentaDebito;
import banco.CuentaCredito;
import banco.Cliente;
import java.util.Scanner;

/**
 * Esta clase modela la clase de uso para nuestro banco
 * @author Alvaro Hernández
 * @version 1.0.0
 */
public class UsoBanco {
    private String usuario;
    private String password;
    private int tipoCuenta;
    private boolean sesion;
    private String bienvenida = "Bienvenido \n" +
                                "El siguiente sistema bancario te permite \n" +
                                "administrar tu cuenta bancaria \n";
    /**
     * Método que devuelve la representación en cadena del mensaje de bienvenida
     * @return String
     */
    public String muestraBienvenida() {
        return this.bienvenida;
    }

    /**
     * Método que devuelve la representación en cadena del menú principal
     * @return String
     */
    public String muestraMenuPrincipal() {
        return "Selecciona una opción: \n" +
               "1.- Login \n" +
               "2.- Registrar \n" +
               "3.- Salir \n";
    }

    public String muestraDespedida() {
        return "Vuelve Pronto";
    }

    public void creaCliente(Cuenta cuenta) {
        String nombre;
        String materno;
        String paterno;
        String email;
        String fechaNacimiento;
        Scanner scan = new Scanner(System.in);
        Cliente cliente;

        System.out.println("Ingresa Apellido Paterno");
        paterno = scan.nextLine();
        System.out.println("Ingresa Apellido Materno");
        materno = scan.nextLine();
        System.out.println("Ingresa Nombre(s)");
        nombre = scan.nextLine();
        System.out.println("Ingresa Correo Electrónico");
        email = scan.nextLine();
        System.out.println("Ingresa Fecha de Nacimiento (dd/mm/aaaa)");
        fechaNacimiento = scan.nextLine();
    }

    public void creaCuenta() {
        int tipo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Selecciona el tipo de cuenta que deseas \n" +
                           "1.- Débito \n" +
                           "2.- Crédito \n");
        tipo = scan.nextInt();
    }

    public static void main(String[] args) {
        int opcion;
        Scanner scan = new Scanner(System.in);
        Cuenta cuenta;

        UsoBanco usoBanco = new UsoBanco();
        System.out.println(usoBanco.muestraBienvenida());
        System.out.println(usoBanco.muestraMenuPrincipal());

        opcion = scan.nextInt();

        switch(opcion) {
            case 1:
                break;
            case 2:
                usoBanco.creaCuenta();
                //usoBanco.creaCliente();
                break;
            default:
                System.out.println(usoBanco.muestraDespedida());
        }
    }
}
