package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int liczba_random = random.nextInt(200) + 1;
        int liczba_input = 0;
        System.out.println("Podaj liczbe od 1 do 200");

        while(liczba_input != liczba_random){
            liczba_input = scanner.nextInt();

            if (liczba_input < liczba_random){
                System.out.println("Liczba jest wieksza");
            }
            else if (liczba_input > liczba_random){
                System.out.println("Liczba jest mniejsza");
            }
            else{
                System.out.println("Zgadles liczbe " + liczba_random);
            }
        }

        scanner.close();
    }
}
