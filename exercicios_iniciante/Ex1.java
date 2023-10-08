package exercicios_iniciante;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a + b;
        System.out.println("Você digitou:");
        System.out.println(a + " e " + b + " e o resultado da soma é " + sum + ".");
        sc.close();
    }
}
