package exercicios_condicionais;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;

        System.out.println("Digite dois números inteiros:");
        
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Os números " + a + " e " + b + " SÃO múltiplos");
        }
        else {
            System.out.println("Os números " + a + " e " + b + " NÂO SÃO múltiplos");
        }
        sc.close();
    }
}
