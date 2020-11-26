package icc.tiendaOnline;

import java.util.ArrayList;

/*
 * Esta clase modela el carrito de compra de una tienda online
 * @author Alvaro Hernández
 *
 */
public class Carrito {
    private double total;
    private ArrayList<String> articulos;

    /*
     * Constructor de la clase Carrito
     */
    public Carrito() {
        total = 0;
        articulos = new ArrayList<String>();
    }

    /*
     * Método para obtener el total del carrito
     * @return El total del carrito
     */
    public double getTotal() {
        return total;
    }
}
