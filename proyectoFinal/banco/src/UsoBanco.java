import banco.Banco;
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
    private static String bienvenida = "Bienvenido \n" +
                                "El siguiente sistema bancario te permite \n" +
                                "administrar tu cuenta bancaria \n";
    /**
     * Método que devuelve la representación en cadena del mensaje de bienvenida
     * @return String
     */
    public static String muestraBienvenida() {
        return UsoBanco.bienvenida;
    }

    /**
     * Método que devuelve la representación en cadena del menú principal
     * @return String
     */
    public static String muestraMenuPrincipal() {
        return "Selecciona una opción: \n" +
               "1.- Login \n" +
               "2.- Registrar \n" +
               "3.- Salir \n";
    }

    public static String muestraDespedida() {
        return "Vuelve Pronto";
    }

    public static Cliente muestraFormulario() {
        int tipo;
        String nombre;
        String materno;
        String paterno;
        String email;
        String fechaNacimiento;
        Scanner scanInt = new Scanner(System.in);
        Scanner scanText = new Scanner(System.in);
        Cliente cliente;
        Cuenta cuenta;

        System.out.println("Selecciona el tipo de cuenta que deseas \n" +
                           "1.- Débito \n" +
                           "2.- Crédito \n");
        tipo = scanInt.nextInt();

        if (tipo == 1) {
            cuenta = new CuentaDebito();
        } else {
            cuenta = new CuentaCredito();
        }

        System.out.println("Ingresa Apellido Paterno");
        paterno = scanText.nextLine();
        System.out.println("Ingresa Apellido Materno");
        materno = scanText.nextLine();
        System.out.println("Ingresa Nombre(s)");
        nombre = scanText.nextLine();
        System.out.println("Ingresa Correo Electrónico");
        email = scanText.nextLine();
        System.out.println("Ingresa Fecha de Nacimiento (dd-mm-aaaa)");
        fechaNacimiento = scanText.nextLine();

        cliente = new Cliente(nombre, paterno, materno, fechaNacimiento, email, cuenta);

        return cliente;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        int opcion;
        Scanner scan = new Scanner(System.in);
        Cliente cliente;

        System.out.println(UsoBanco.muestraBienvenida());
        System.out.println(UsoBanco.muestraMenuPrincipal());

        opcion = scan.nextInt();

        switch(opcion) {
            case 1:
                break;
            case 2:
                cliente = UsoBanco.muestraFormulario();
                try {
                    banco.agregarCliente(cliente);
                    System.out.println("Usuario Registrado con Exito");
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            default:
                System.out.println(UsoBanco.muestraDespedida());
        }
    }
}
