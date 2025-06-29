package Zad3;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane2 extends Thread{
    private int[] b = new int[3];
    private Semaphore[] s3;
    private Semaphore[] s4;

    public Dane2(Semaphore[] s3, Semaphore[] s4){
        this.s3 = s3;
        this.s4 = s4;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Podaj b: \n");
            b[i] = scanner.nextInt();
            s3[i].release();
            try{
                s4[i].acquire();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }

    public int getB(int i){
        return b[i];
    }
}
