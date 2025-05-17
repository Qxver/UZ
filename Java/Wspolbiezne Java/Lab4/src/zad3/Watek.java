package zad3;

public class Watek extends Thread{
    double[] arr;
    int start;
    int end;
    double arr_min = Integer.MAX_VALUE;
    double arr_max = Integer.MIN_VALUE;
    public Watek(double[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run(){
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for(int i = start; i < end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

            if(min < arr_min){
                arr_min = min;
            }
            if(max > arr_max){
                arr_max = max;
            }
        }

        //System.out.println("Max lokalne: " + max);
       //System.out.println("Min lokalne: " + min);
    }
}
