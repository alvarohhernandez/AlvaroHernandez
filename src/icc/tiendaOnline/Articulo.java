package icc.tiendaOnline;

/*
 * Esta clase modela los artículos de una tienda Online
 * @author Alvaro Hernández
 */
public class Articulo {
    String nombre;
    float precio;
    int codigoBarras;
    String descripcion;

    /*
     * Constructor de la clase Articulo
     */
    public Articulo(String nombre, float precio, int codigoBarras, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
        this.descripcion = descripcion;
    }

    public int getCodigoBarras() {
        return this.codigoBarras;
    }

    @Override
    public String toString() {
        String articulo;

        articulo = "Nombre: " + this.nombre
                   + "\n Precio: " + this.precio
                   + "\n Descripcion: " + this.descripcion;
        return articulo;
    }
}
