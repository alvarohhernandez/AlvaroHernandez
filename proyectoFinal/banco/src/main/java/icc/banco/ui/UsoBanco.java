import banco.Banco;
import banco.Cuenta;
import banco.CuentaDebito;
import banco.CuentaCredito;
import banco.Cliente;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Esta clase modela la clase de uso para nuestro banco
 * @author Alvaro Hernández
 * @version 1.0.0
 */
public class UsoBanco {
    public static Banco banco = new Banco();
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
    public static void muestraMenuPrincipal() {
        int opcion;
        Scanner scan = new Scanner(System.in);
        Cliente cliente;
        System.out.println( "Selecciona una opción: \n" +
               "1.- Login \n" +
               "2.- Registrar \n" +
               "3.- Salir \n");
        opcion = scan.nextInt();

        switch(opcion) {
            case 1:
                UsoBanco.muestraFormularioLogin();
                break;
            case 2:
                cliente = UsoBanco.muestraFormularioRegistro();
                try {
                    UsoBanco.banco.agregarCliente(cliente);
                    System.out.println("Usuario Registrado con Exito");
                    UsoBanco.muestraMenuPrincipal();
                } catch (Exception e) {
                    System.out.println("Ocurrió un error inesperado");
                    System.out.println(e);
                    System.out.println("Intenta nuevamente");
                    UsoBanco.muestraMenuPrincipal();
                }
                break;
            default:
                System.out.println(UsoBanco.muestraDespedida());
        }
    }

    /**
     * Método que devuelve el mensaje de despedida
     * @return El mensaje de despedida
     */
    public static String muestraDespedida() {
        return "Vuelve Pronto";
    }

    /**
     * Método que muestra el formulario de inicio de sesión
     */
    public static void muestraFormularioLogin() {
        Scanner scanText = new Scanner(System.in);
        String email;
        String password;
        Cliente cliente;

        System.out.println("Ingresa tu correo electrónico");
        email = scanText.nextLine();
        System.out.println("Ingresa tu contraseña");
        password = scanText.nextLine();

        cliente = UsoBanco.iniciaSesion(email, password);
        if (cliente != null) {
            System.out.println("Bienvenido " + cliente.printNombreCompleto());
        } else {
            System.out.println("Usuario no identificado");
            UsoBanco.muestraMenuPrincipal();
        }
    }

    /**
     * Método para iniciar sesión en el banco
     * @param email El parámetro email hace referencia al email de usuario que intenta iniciar sesión
     * @param password El parámetro password hace referencia al password del usuario que intenta iniciar sesión
     * @return El cliente o null
     */
    public static Cliente iniciaSesion(String email, String password) {
        Cliente cliente = UsoBanco.banco.buscarCliente(email);

        return cliente;
    }

    /**
     * Método que muestra el formulario de registro
     * @return El cliente registrado
     */
    public static Cliente muestraFormularioRegistro() {
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

    public static void cargaBase() {
        String fileClientes = "../resources/clientes.csv";
        String fileCuentas = "../resources/cuentas.csv";
        String row_cliente;
        String row_cuenta;
        try {
            BufferedReader csvClientes = new BufferedReader(new FileReader(fileClientes));
            BufferedReader csvCuentas = new BufferedReader(new FileReader(fileCuentas));
            while ((row_cliente = csvClientes.readLine()) != null) {
                String[] data_cliente = row_cliente.split(",");
                Cliente cliente = new Cliente(Integer.parseInt(data_cliente[0]), data_cliente[1], data_cliente[2], data_cliente[3], data_cliente[4], data_cliente[5]);
                while ((row_cuenta = csvCuentas.readLine()) != null) {
                    String[] data_cuenta = row_cuenta.split(",");
                    if (Integer.parseInt(data_cuenta[0]) == cliente.getNoCliente()) {
                        Cuenta cuenta;
                        if (data_cuenta[2].equals("D")) {
                            cuenta = new CuentaDebito(Integer.parseInt(data_cuenta[1]), Double.parseDouble(data_cuenta[3])); 
                        } else {
                            cuenta = new CuentaCredito(Integer.parseInt(data_cuenta[1]), Double.parseDouble(data_cuenta[3])); 
                        }
                        cliente.agregarCuenta(cuenta);
                    }
                }
                UsoBanco.banco.agregarCliente(cliente);
            }
            csvClientes.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        UsoBanco.cargaBase();
        System.out.println(UsoBanco.banco);
        System.out.println(UsoBanco.muestraBienvenida());
        UsoBanco.muestraMenuPrincipal();
    }
}
