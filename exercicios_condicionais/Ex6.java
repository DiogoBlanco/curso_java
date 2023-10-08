package exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer:");

        double x = sc.nextDouble();

        if (x < 0.0 || x > 100.0) {
            String interval = "Fora de Intervalo";
            System.out.println(interval);
        }
        else if (x <= 25.0) {
            String interval = "[0, 25]";
            System.out.println("Intervalo " + interval);
        }
        else if (x <= 50) {
            String interval = "[25, 50]";
            System.out.println("Intervalo " + interval);
        }
        else if (x <= 75) {
            String interval = "[50, 75]";
            System.out.println("Intervalo " + interval);
        }
        else {
            String interval = "[75, 100]";
            System.out.println(interval);
        }
        sc.close();
    }
}
