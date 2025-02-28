package Lab3;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        int potega = 1;
        System.out.println("Potegi liczby 3 mniejsze od podanej liczby: ");
        while(potega < liczba){
            System.out.println(potega);
            potega *= 3;
        }
        scanner.close();
    }
}
