package zad3;

import java.util.ArrayList;
import java.util.List;

public class Watek1 extends Thread{

    public static void main(String[] args){
        long start_time = System.nanoTime();
        int N = 1000;
        List<Integer> pierwsze = new ArrayList<>();

        for(int i = 2; i <= N; i++){
            if(LiczbaPierwsza(i)){
                pierwsze.add(i);
            }
        }

        System.out.println("Liczby pierwsze: " + pierwsze);
        long end_time = System.nanoTime();
        double time = (end_time - start_time) / 1_000_000.0;
        System.out.println("Czas wykonania programu: " + time + "s");
    }

    private static boolean LiczbaPierwsza(int n){
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2){
            if (n % i == 0) return false;
        }
        return true;
    }
}