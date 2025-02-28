package Lab4;
import java.util.Random;
import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {
        int[] tablica = new int[30];
        int[] bubble = new int[30];
        int[] quicksort = new int[30];
        Random random = new Random();

        System.out.println("Zawartosc tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(52) + 99;
            bubble[i] = tablica[i];
            quicksort[i] = tablica[i];
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();
        System.out.println();

        int temp;
        boolean swapped;

        for (int i = 0; i < 2; i++) {
            swapped = false;
            for (int j = 0; j < bubble.length - i - 1; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println("Tablica po 2 przebiegach sortowania babelkowego: ");
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + ", ");
        }
        System.out.println();
        System.out.println();

        int high = quicksort.length - 1;
        int low = 0;
        int licznik = 0;

        while (licznik < 2 && low < high) {
            int pivot = quicksort[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (quicksort[j] < pivot) {
                    i++;
                    temp = quicksort[i];
                    quicksort[i] = quicksort[j];
                    quicksort[j] = temp;
                }
            }
            temp = quicksort[i + 1];
            quicksort[i + 1] = quicksort[high];
            quicksort[high] = temp;

            if(low < i){
                high = i;
            }

            else if(i + 2 < quicksort.length){
                low = i + 2;
            }
            licznik++;
        }

        System.out.println("Tablica po 2 przebiegach sortowania szybkiego: ");

        System.out.println(Arrays.toString(quicksort));
    }
}
