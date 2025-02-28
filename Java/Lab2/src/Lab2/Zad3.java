package Lab2;

public class Zad3 {
    public static void main(String[] args) {
        double mph = 100;
        double kph = mph * 1.609344;
        System.out.println("Predkosc w milach: " + mph);
        System.out.println("Predkosc w kilometrach: " + String.format("%.2f", kph));
    }
}
