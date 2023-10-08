package exercicios_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite 3 valores e vamos calcular formas geométricas com eles:");
      System.out.println("Digite o primeiro valor:");
      double a = sc.nextDouble();
      System.out.println("Digite o segundo valor:");
      double b = sc.nextDouble();
      System.out.println("Digite o ultimo valor:");
      double c = sc.nextDouble();
      double triangleArea = (a * c) / 2.0;
      double circleArea = 3.14159 * (Math.pow(c, 2.0));
      double trapArea = (a + b) * c / 2.0;
      double squareArea = b * b;
      double rectangleArea = a * b;
      System.out.printf("Área do Triângulo Retângulo: %.3f%n", triangleArea);
      System.out.printf("Área do Círculo: %.3f%n", circleArea);
      System.out.printf("Área do Trapézio: %.3f%n", trapArea);
      System.out.printf("Área do Quadrado: %.3f%n", squareArea);
      System.out.printf("Área do Retângulo: %.3f%n", rectangleArea);
      sc.close();
   } 
}
