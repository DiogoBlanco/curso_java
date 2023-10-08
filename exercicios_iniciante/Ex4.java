package exercicios_iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do funcionário:");
        int number = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        int hours = sc.nextInt();
        System.out.println("Digite o valor por hora:");
        double value = sc.nextDouble();
        double salary = hours * value;
        System.out.println("Número do funcionário: " + number);
        System.out.printf("Salário:  U$ %.2f", salary );
        sc.close();
    }
}
