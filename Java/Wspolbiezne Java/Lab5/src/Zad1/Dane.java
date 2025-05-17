package Zad1;
import java.util.Scanner;
import java.util.concurrent.Semaphore;


public class Dane extends Thread{
    private int a, b;
    private Semaphore s1;

    public Dane(Semaphore s1){
        this.s1 = s1;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a: ");
        a = scanner.nextInt();

        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        s1.release();

        scanner.close();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
