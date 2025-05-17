package Zad2;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane1 extends Thread{
    private int a;
    private Semaphore s1;

    public Dane1(Semaphore s1){
        this.s1 = s1;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        s1.release();
        scanner.close();
    }

    public int getA() {
        return a;
    }
}
