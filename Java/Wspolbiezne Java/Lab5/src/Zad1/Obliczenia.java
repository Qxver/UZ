package Zad1;
import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread{
    private int suma;
    private Dane dane;
    private Semaphore s1;

    public Obliczenia(Dane dane, Semaphore s1){
        this.dane = dane;
        this.s1 = s1;
    }

    public void run(){
        int a, b;
        try {
            s1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = dane.getA();
        b = dane.getB();
        suma = a + b;
        System.out.println("Wynik: " + suma);
    }
}
