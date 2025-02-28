package Lab4;
import java.util.Random;

public class Zad3 {
    public static void main(String[] args){
        int[] tablica = new int[40];
        Random random = new Random();

        for(int i = 0; i < 11; i++){
            tablica[i] = random.nextInt(5)+1;
        }

        for(int i = 11; i < 21; i++){
            tablica[i] = random.nextInt(5)+6;
        }

        for(int i = 21; i < 31; i++){
            tablica[i] = random.nextInt(45)+11;
        }

        for(int i = 31; i < 40; i++){
            tablica[i] = random.nextInt(16)+60;
        }

        System.out.println("Elementy tablicy z liczbami 1-5: ");
        for(int i = 0; i < 11; i++){
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Elementy tablicy z liczbami 6-10: ");
        for(int i = 11; i < 21; i++){
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Elementy tablicy z liczbami 11-55: ");
        for(int i = 21; i < 31; i++) {
            System.out.print(tablica[i] + ", ");
        }
            System.out.println();
            System.out.println();

            System.out.println("Elementy tablicy z liczbami 60-75: ");
            for(int i = 31; i < 40; i++){
                System.out.print(tablica[i] + ", ");
            }
            System.out.println();
            System.out.println();

    }
}

