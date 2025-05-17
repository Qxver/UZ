package zad2;

import java.util.concurrent.BlockingQueue;

public class Pakowacz extends Thread{
    private BlockingQueue<Integer> queue;

    public Pakowacz(String nazwa, BlockingQueue<Integer> queue){
        super(nazwa);
        this.queue = queue;
    }

    public void run(){
        try{
            while(true){
                System.out.println(Thread.currentThread().getName() + " czeka na ciastko...");
                Integer x = queue.take();
                System.out.println(Thread.currentThread().getName()+ " zdjal ciastko " + x);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
