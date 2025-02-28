package Lab3;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int liczba = scanner.nextInt();

        System.out.println("Dzielniki liczby " + liczba + ": ");

        for(int i = 1; i <= liczba; i++){
            if(liczba % i == 0){
                System.out.print(i + ", ");
            }
        }

        scanner.close();
    }
}