package Zad4;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

class Dane extends Thread{
    public static double a, b, c;
    Semaphore s1;

    public Dane(Semaphore s1){
        this.s1 = s1;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj a: ");
        a = scanner.nextDouble();
        System.out.print("Podaj b: ");
        b = scanner.nextDouble();
        System.out.print("Podaj c: ");
        c = scanner.nextDouble();
        s1.release();
    }
}