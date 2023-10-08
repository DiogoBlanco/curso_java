package exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        int cod, qtd;
        double val;
        
        System.out.println("Digite o código do produto:");
        cod = sc.nextInt();

        System.out.println("Digite a quantidade do produto:");
        qtd = sc.nextInt();

        if (cod == 1) {
            val = 4.00;
            double total = qtd * val;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 2) {
            val = 4.50;
            double total = qtd * val;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 3) {
            val = 5.00;
            double total = qtd * val;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 4) {
            val = 2.00;
            double total = qtd * val;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 5) {
            val = 1.50;
            double total = qtd * val;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        
        sc.close();
    }
}
