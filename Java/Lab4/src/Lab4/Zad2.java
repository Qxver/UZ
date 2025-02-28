package Lab4;
import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] tablica = new int[7][7];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                tablica[i][j] = random.nextInt(100);
            }
        }

        for(int i = 0; i < 7; i++){
            int min = 101;
            int max = 0;
            double suma = 0;

            for(int j = 0; j < 7; j++){
                min = Math.min(min, tablica[i][j]);
                max = Math.max(max, tablica[i][j]);

                suma += tablica[i][j];
            }

            double srednia = suma / 7;
            int wieksze_od_sredniej = 0;
            int mniejsze_od_sredniej = 0;

            for(int j = 0; j < 7; j++){
                if(tablica[i][j] < srednia){
                    mniejsze_od_sredniej++;
                }
                if(tablica[i][j] > srednia){
                    wieksze_od_sredniej++;
                }
            }

            System.out.println("Kolumna " + i);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Srednia " + srednia);
            System.out.println("Elementy mniejsze od sredniej: " + mniejsze_od_sredniej);
            System.out.println("Elementy wieksze od sredniej: " + wieksze_od_sredniej);
            System.out.println();
        }


        int[][] reverse = new int[7][7];
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                reverse[i][j] = tablica[6-i][6-j];
            }
        }

        System.out.println("Odwrocona tablica: ");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(reverse[i][j] + ", ");
            }
        }
    }
}
