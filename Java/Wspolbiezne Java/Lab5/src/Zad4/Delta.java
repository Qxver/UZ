package Zad4;

import java.util.concurrent.Semaphore;

class Delta extends Thread{
    public static double delta;
    Semaphore s1, s2;

    public Delta(Semaphore s1, Semaphore s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run(){
        try{
            s1.acquire();
            delta = Dane.b * Dane.b - 4 * Dane.a * Dane.c;
            s2.release();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
