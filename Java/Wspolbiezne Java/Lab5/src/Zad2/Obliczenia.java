package Zad2;

import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread{
    private int suma;
    private Dane1 dane1;
    private Dane2 dane2;
    private Semaphore s1;
    private Semaphore s2;

    public Obliczenia(Dane1 dane1, Dane2 dane2, Semaphore s1, Semaphore s2){
        this.dane1 = dane1;
        this.dane2 = dane2;
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run(){
        int a, b;
        try {
            s1.acquire();
            s2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a = dane1.getA();
        b = dane2.getB();
        suma = a + b;
        System.out.println("Wynik: " + suma);
    }
}