package icc.tiendaOnline;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/*
 * Esta clase modela el carrito de compra de una tienda online
 * @author Alvaro Hernández
 *
 */
public class Carrito {
    private Map<Integer, Articulo> articulos;

    /*
     * Constructor de la clase Carrito
     */
    public Carrito() {
        articulos = new HashMap<Integer, Articulo>();
    }

    /*
     * Método para obtener el total de la compra del carrito
     * @return La suma total de los montos
     */
    public void obtieneTotal() {
    }

    /*
     * Método para agregar un artículo al carrito
     */
    public void addArticulo(Articulo articulo) {
        this.articulos.put(articulo.getCodigoBarras(), articulo);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Map.Entry<Integer, Articulo> entry : this.articulos.entrySet()) {
            Articulo value = entry.getValue();
            resultado += value.toString();
        }

        return resultado;
    } 
}
