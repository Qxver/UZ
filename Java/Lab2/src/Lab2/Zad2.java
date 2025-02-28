package Lab2;

public class Zad2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = -15;
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Rownanie kwadratowe:");
        System.out.println(a + "x² + " + b + "x + " + c);
        System.out.println("Delta: " + delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }

        else if (delta == 0) {
            double x0 = (-b) / (2 * a);
            System.out.println("x0: " + x0);
        }

        else{
            System.out.println("Brak pierwiastkow");
        }

    }
}
