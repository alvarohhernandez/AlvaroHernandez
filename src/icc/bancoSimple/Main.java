import icc.bancoSimple.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta nuevaCuenta;

        nuevaCuenta = new Cuenta(30000, "Alvaro Hernández");
        System.out.println("El saldo de la cuenta es " + nuevaCuenta.getSaldo());
        System.out.println("El propietario de la cuenta es " + nuevaCuenta.getNombre());

        nuevaCuenta.retirarSaldo(10000);
        System.out.println("El saldo de la cuenta es " + nuevaCuenta.getSaldo());

        nuevaCuenta.depositarSaldo(5000);
        System.out.println("El saldo de la cuenta es " + nuevaCuenta.getSaldo());
    }
}
