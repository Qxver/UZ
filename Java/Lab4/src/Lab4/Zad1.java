package Lab4;
import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        int[] tablica = new int[30];
        int[] kopia = new int[30];
        Random random = new Random();

        System.out.println("Zawartosc tablicy: ");
        for(int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(52) + 99;
            kopia[i] = tablica[i];
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();
        System.out.println("Zawartosc kopii tablicy: ");
        for(int i = 0; i < kopia.length; i++){
            System.out.print(kopia[i] + ", ");
        }
    }
}
