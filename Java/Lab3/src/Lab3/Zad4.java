package Lab3;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iloczyn = 1;
        int liczba = 0;

        while(liczba != 5){
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            iloczyn *= liczba;
        }

        System.out.println("Iloczyn podanych liczb: " + iloczyn);

        scanner.close();
    }
}
