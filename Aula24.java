public class Aula24 {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);
        
        int c;
        double d;
        c = 5;
        d = 2 * c;
        System.out.println(c);
        System.out.println(d);

        // Área do trapézio

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        // Como converter valores (casting)
        int e, f;
        double resultado;
        e = 5;
        f = 2;
        resultado = (double) e / f;
        System.out.printf("%.2f%n", resultado);
    }
}
