package Zad2;
import java.util.concurrent.Semaphore;

public class Watek extends Thread{
    public Semaphore s1;

    public Watek(Semaphore s1){
        this.s1 = s1;
    }
    public void run(){
        try {
            for(int i = 0; i < 5; i++){
                Thread.sleep(2000);
                System.out.println(this.getName() + " - Czytanie ksiazki...");

                Thread.sleep(2000);
                System.out.println(this.getName() + " - Picie herbaty...");

                s1.acquire();
                Thread.sleep(2000);
                System.out.println(this.getName() + " - Rozmowa telefoniczna...");
                s1.release();

                Thread.sleep(2000);
                System.out.println(this.getName() + " - Praca przy komputerze...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
