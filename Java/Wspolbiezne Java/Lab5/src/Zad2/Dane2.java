package Zad2;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane2 extends Thread{
    private int b;
    private Semaphore s2;

    public Dane2(Semaphore s2){
        this.s2 = s2;
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        s2.release();
        scanner.close();
    }

    public int getB(){
        return b;
    }
}