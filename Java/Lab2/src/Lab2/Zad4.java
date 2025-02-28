package Lab2;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        int x = 10;
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[x];
        double suma = 0;

        System.out.println("Podaj liczby: ");
        for(int i=0; i<x; i++){
            liczby[i] = scanner.nextInt();
            suma += liczby[i];
        }

        int min = liczby[0];
        int max = liczby[0];
        double srednia = suma/x;

        for(int i=1; i<x; i++){
            if (liczby[i] < min){
                min = liczby[i];
            }
            if(liczby[i] > max){
                max = liczby[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Srednia: " + srednia);
    }
}
