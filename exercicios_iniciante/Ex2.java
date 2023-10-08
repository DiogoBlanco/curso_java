package exercicios_iniciante;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14159 * (Math.pow(radius, 2));
        System.out.printf("A área de um círculo com o raio de %.2f é de %.4f.", radius, area);
        sc.close();
    }
}
