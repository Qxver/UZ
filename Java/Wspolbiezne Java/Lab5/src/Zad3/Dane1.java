package Zad3;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane1 extends Thread{
    private int[]  a = new int[3];
    private Semaphore[] s1;
    private Semaphore[] s2;

    public Dane1(Semaphore s1[], Semaphore[] s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Podaj a: \n");
            a[i] = scanner.nextInt();
            s1[i].release();
            try{
                s2[i].acquire();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }

    public int getA(int i){
        return a[i];
    }
}
