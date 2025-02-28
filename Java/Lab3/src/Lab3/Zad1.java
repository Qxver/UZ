package Lab3;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int liczba = scanner.nextInt();
        int temp = liczba;
        int nieparzyste = 0;
        int parzyste = 0;
        int licznik_parzyste = 0;
        int licznik_nieparzyste = 0;
        boolean IsPrime = false;
        while(temp != 0) {
            int cyfra = temp % 10;
            if(cyfra%2 == 1) {
                nieparzyste += cyfra;
                licznik_nieparzyste += 1;
            }
            else {
                parzyste += cyfra;
                licznik_parzyste += 1;

            }
            temp /= 10;
        }

        float srednia_parzyste = parzyste/licznik_parzyste;
        System.out.println("Srednia cyfr parzystych: " + srednia_parzyste);

        float srednia_nieparzyste = nieparzyste/licznik_nieparzyste;
        System.out.println("Srednia cyfr nieparzystych: " + srednia_nieparzyste);

        float stosunek = srednia_nieparzyste/srednia_parzyste;
        System.out.println("Stosunek sredniej cyfr nieparzystych do sredniej cyfr parzystych: " + stosunek);

        if(liczba<=1) {
            IsPrime = false;
        }

        for(int i=2; i<=Math.sqrt(liczba); i++) {
            if(liczba % i == 0) {
                IsPrime = false;
            }
            else {
                IsPrime = true;
            }
        }

        if(IsPrime) {
            System.out.println("Liczba jest pierwsza");
        }
        else {
            System.out.println("Liczba nie jest pierwsza");
        }

        scanner.close();
    }
}
