package zad3;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int threads = 6;
        int N = 500000000;
        int zakres = N / threads;

        double[] arr = new double[N];
        Random random = new Random();

        for(int i = 0; i < N; i++){
            arr[i] = random.nextInt(Integer.MAX_VALUE);
        }

        long start_time = System.nanoTime();

        Watek[] watki = new Watek[threads];
        for(int i = 0; i < threads; i++){
            int start = i * zakres;
            int end = (i + 1) * zakres;
            watki[i] = new Watek(arr, start, end);
            watki[i].start();
        }

        try{
            for(int i = 0; i < threads; i++){
                watki[i].join();
            }
        } catch(Exception e){
            throw new RuntimeException(e);
        }

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        for(int i = 0; i < watki.length; i++){
            if(watki[i].arr_min < min){
                min = watki[i].arr_min;
            }
            if(watki[i].arr_max > max){
                max = watki[i].arr_max;
            }
        }

        long stop_time = System.nanoTime();
        long time_ms = (stop_time - start_time)/1000000;

        System.out.println("Max tablicy: " + max);
        System.out.println("Min tablicy: " + min);
        System.out.print("Czas: " + time_ms + "ms");
        
    }
}
