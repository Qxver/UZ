package Zad3;

import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread{
    private Dane1 dane1;
    private Dane2 dane2;
    private Semaphore[] s1;
    private Semaphore[] s3;
    private Semaphore[] s2;
    private Semaphore[] s4;

    public Obliczenia(Dane1 dane1, Dane2 dane2, Semaphore[] s1, Semaphore[] s3, Semaphore[] s2, Semaphore[] s4){
        this.dane1 = dane1;
        this.dane2 = dane2;
        this.s1 = s1;
        this.s3 = s3;
        this.s2 = s2;
        this.s4 = s4;
    }

    public void run(){
        for (int i = 0; i < 3; i++){
            try{
                s1[i].acquire();
                s3[i].acquire();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            int a = dane1.getA(i);
            int b = dane2.getB(i);
            int suma = a + b;
            System.out.println("Suma: " + suma);
            s2[i].release();
            s4[i].release();
        }
    }
}
