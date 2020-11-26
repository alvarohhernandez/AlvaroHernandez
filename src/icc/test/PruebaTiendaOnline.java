package icc.test;

import icc.tiendaOnline.Usuario;
import icc.tiendaOnline.Carrito;

/*
 * Esta clase modela las pruebas de la tienda online
 * @author Alvaro Hernández
 */
public class PruebaTiendaOnline {
    public static void main(String[] args) {
        Usuario user;
        String nombre;
        String paterno;
        String materno;
        String fechaNacimiento;
        Carrito carrito;
        double totalCompra;

        user = new Usuario("Alvaro", "Hernandez", "Hernandez", "20/03/1990");
        nombre = user.getNombre();
        paterno = user.getPaterno();
        materno = user.getMaterno();
        fechaNacimiento = user.getFechaNacimiento();

        carrito = new Carrito();
        totalCompra = carrito.getTotal();

        System.out.println("El nombre es " + nombre);
        System.out.println("El apellido paterno es " + paterno);
        System.out.println("El apellido materno es " + materno);
        System.out.println("La fecha de nacimiento es " + fechaNacimiento);

        System.out.println("El total de la compra es " + totalCompra);
    }
}
