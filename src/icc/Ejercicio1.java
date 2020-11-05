/*
 * Esta clase pregunta al usuario por una figura geométrica (Triángulo o Círculo) y sus datos para calcular el área
 * @author: Alvaro Hernández
 * @version: 1
 */

import java.util.Scanner;
import java.lang.Math.*;

public class Ejercicio1 {
  public static void main(String[] args) {
    int figura;
    double area;
    int base;
    int altura;
    int radio;
    Scanner input = new Scanner(System.in);

    System.out.println("El siguiente programa te permite calcular el área de un Triángulo o Círculo. Selecciona la figura geométrica ingresando el número correspondiente");
    System.out.println("1) Triángulo");
    System.out.println("2) Círculo");
    figura = input.nextInt();

    if (figura == 1) {
      System.out.println("Seleccionaste Triángulo"); 
      System.out.println("Ingresa la base del Triángulo"); 
      base = input.nextInt();
      System.out.println("Ingresa la altura del Triángulo"); 
      altura = input.nextInt();
      area = (base * altura)*1.0/2;
      System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es " + area); 
    } else if (figura == 2) {
      System.out.println("Seleccionaste Círculo"); 
      System.out.println("Ingresa el Radio del Círculo");
      radio = input.nextInt();
      area = Math.PI * Math.pow(radio, 2);
      System.out.println("El area del Círculo con Radio " + radio + " es " + area);
    } else {
      System.out.println("No seleccionaste una opción válida, no podemos calcular el área"); 
    }
  }
}
