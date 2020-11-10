package icc.utilidades;

/*
 * Esta clase busca modelar funciones matemáticas
 * @author Alvaro Hernández
 *
 */
public class Function {
    public boolean esPar(int numero) {
        int residuo;

        residuo = numero % 2;
        if (residuo == 0) {
          return true;
        } else {
          return false;
        }
    }

    public boolean esImpar(int numero) {
        int residuo;

        residuo = numero % 2;
        if (residuo == 1) {
          return true;
        } else {
          return false;
        }
    }

    public static void main(String[] args) {
      Function f = new Function();
      System.out.println(f.esPar(5));
      System.out.println(f.esPar(4));
      System.out.println(f.esImpar(5));
      System.out.println(f.esImpar(4));
    }
}
