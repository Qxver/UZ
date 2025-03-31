package Lab1;
import java.util.Random;
import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args){
        Random random = new Random();
        int N = 10;
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<N; i++){
            arr[i] = random.nextInt(100);

            if(arr[i]>max){
                max3 = max2;
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i] > max3){
                max3 = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

            sum += arr[i];
        }

        double length = arr.length;
        double avg = sum / length;

        System.out.println(Arrays.toString(arr));
        System.out.println("Max: " + max);
        System.out.println("Max 2: " + max2);
        System.out.println("Max 3: " + max3);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1- i] = temp;
        }
        System.out.println("Reversed: " + Arrays.toString(arr));
    }

}
