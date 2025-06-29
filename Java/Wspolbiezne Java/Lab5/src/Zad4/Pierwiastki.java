package Zad4;

import java.util.concurrent.Semaphore;

class Pierwiastki extends Thread{
    public static double x1, x2;
    Semaphore s2;

    public Pierwiastki(Semaphore s2){
        this.s2 = s2;
    }

    public void run(){
        try{
            s2.acquire();
            if (Delta.delta < 0){
                System.out.println("Brak pierwiastków");
            }
            else{
                x1 = (-Dane.b - Math.sqrt(Delta.delta)) / (2 * Dane.a);
                x2 = (-Dane.b + Math.sqrt(Delta.delta)) / (2 * Dane.a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}