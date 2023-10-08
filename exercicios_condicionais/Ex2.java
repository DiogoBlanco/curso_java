package exercicios_condicionais;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("O número " + x + " é PAR");
        }
        else {
            System.out.println("O número " + x + " é ÍMPAR");
        }
        sc.close();
    }
}
