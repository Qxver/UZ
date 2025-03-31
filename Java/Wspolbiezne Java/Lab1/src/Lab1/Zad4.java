package Lab1;
import java.util.Random;
import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        Random random = new Random();

        for(int i=0; i<10; i++){
            arr1[i] = random.nextInt(100);
            arr2[i] = random.nextInt(100);
            arr3[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int max1 = Arrays.stream(arr1).max().getAsInt();
        int max2 = Arrays.stream(arr2).max().getAsInt();
        int max3 = Arrays.stream(arr3).max().getAsInt();
        int max = Math.max(max1, Math.max(max2, max3));
        System.out.println("arr1 max: " + max1);
        System.out.println("arr2 max: " + max2);
        System.out.println("arr3 max: " + max3);
        System.out.println("MAX: " + max);
    }
}
