package Lab11;

public class Zad1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 0 ;
        try {
            int divide = x / y;
            System.out.println("Wynik dzielenia: " + divide);
        } catch (ArithmeticException e) {
            System.err.println("Nie dziel przez 0");
        }
    }
}
