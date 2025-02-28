package Lab11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj 1 liczbe: ");
            int x = scanner.nextInt();
            System.out.println("Podaj 2 liczbe: ");
            int y = scanner.nextInt();
            int suma = x+y;
            System.out.println("Suma liczb: " + suma);
        } catch (InputMismatchException e) {
            System.err.println("Podano błędną wartość zmiennej.");
        }
    }
}
