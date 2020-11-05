import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args){
    System.out.println("Ejercicio 1: Tipos de Datos en Java");
    System.out.println("  Datos primitivos");
    System.out.println("    a) Númericos Enteros");
    System.out.println("      1. byte");
    System.out.println("      2. short");
    System.out.println("      3. int");
    System.out.println("      4. long");
    System.out.println("      5. float");
    



    String var_byte = "Emplea un sólo byte (8 bits) de almacenamiento. Permite almacenar valores entre [-128,127].";
    String var_short = "Usa el doble de almacenamiento que byte, lo cual hace posible representar cualquier valor en el rango [-32,768, 32,767]";
    String var_int = "Emplea 4 bytes de almacenamiento y es el tipo de dato entero más empleado. El rango de valores que puede representar va de -2^31 a (2^31)-1";
    String var_long = "Es el tipo entero de mayor tamaño, 8 bytes (64 bits), con un rango de valores desde -2^63 a (2^63)-1";
    String var_float = "Conocido como tipo de precisión simple, emplea un total de 32 bits. Con este tipo de datos es posible representar números en el rango de 1.4x10^-45 a 3.4028235x10^38";

    //byte var_byte;
    //short var_short;
    //int var_int;
    //long var_long;
    //float var_float;
    //double var_double;
    //
    System.out.println("Selecciona una opción para obtener información del tipo de dato");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
  }
}
