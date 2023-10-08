package exercicios_iniciante;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diferença entre produtos - Digite quatro números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("A diferença do produto de A e B pelo produto de C e B é: " + diferenca);
        sc.close();
    }
}
