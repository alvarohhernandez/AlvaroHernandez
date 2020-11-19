package icc.utilidades;

/*
 * Esta clase busca modelar funciones matemáticas
 * @author Alvaro Hernández
 *
 */
public class Function {
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean esImpar(int numero) {
        return !this.esPar(numero);
    }

    /**
     * Esta función devuelve la representación binaria de un numero entero en base 10
     * @param numero : es el valor en base 10 para convertir a binario
     * @return una cadena de 0s y 1s que corresponden a la representación binaria
     */
    public String convierteEnteroBinario(int numero) {
        int numeroAuxiliar;
        boolean esResiduoCero;
        String signo;
        String binario = "";

        if (numero > 0) {
            signo = "";
            numeroAuxiliar = numero;
        } else {
            signo = "-";
            numeroAuxiliar = numero * -1;
        }

        while (numeroAuxiliar != 1) {
            if (this.esPar(numeroAuxiliar)) {
                binario = 0 + binario;
                numeroAuxiliar = numeroAuxiliar / 2;
            } else {
                binario = 1 + binario;
                numeroAuxiliar = (numeroAuxiliar) / 2;
            }
        }
        binario = signo + 1 + binario;

        return binario;
    }

    /**
     * Esta función devuelve la representación binaria de un número real en base 10
     * @param numero : es el valor real en base 10 para convertir a binario
     * @return una cadena de 0s y 1s que corresponden a la representación binaria
     */
    public String convierteRealBinario(double numero) {
        double numeroAuxiliar;
        int parteEntera;
        double parteDecimal;
        String binario;

        parteDecimal = numero % 1;
        parteEntera = (int) numero;
        binario = this.convierteEnteroBinario(parteEntera) + ".";

        while (parteDecimal != 0) {
            numeroAuxiliar = parteDecimal * 2;
            parteDecimal = numeroAuxiliar % 1;
            parteEntera = (int) numeroAuxiliar;
            System.out.println("ParteEntera" + parteEntera);
            System.out.println("ParteDecimal" + parteDecimal);
            binario += parteEntera;
        }

        return binario;
    }

    public static void main(String[] args) {
      Function f = new Function();
      System.out.println(f.esPar(5));
      System.out.println(f.esPar(4));
      System.out.println(f.esImpar(5));
      System.out.println(f.esImpar(4));
      System.out.println("La representación binaria de 45 es "+f.convierteEnteroBinario(45));
      System.out.println("La representación binaria de 4.6 es "+f.convierteRealBinario(4.6));
    }
}
