package exercicios_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da primeira peça:");
        int cod1 = sc.nextInt();
        System.out.println("Digite a quantidade de peças:");
        int qtd1 = sc.nextInt();
        System.out.println("Digite o valor unitário:");
        double unit1 = sc.nextDouble();
        System.out.println("Digite o código da segunda peça:");
        int cod2 = sc.nextInt();
        System.out.println("Digite a quantidade de peças:");
        int qtd2 = sc.nextInt();
        System.out.println("Digite o valor unitário:");
        double unit2 = sc.nextDouble();
        double total = (qtd1 * unit1) + (qtd2 * unit2);
        System.out.printf("Valor a Pagar: R$ %.2f", total );
        sc.close();
    }
}
