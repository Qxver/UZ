package zad3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Cukiernik extends Thread{
    private BlockingQueue<Integer> queue;
    private static AtomicInteger serial = new AtomicInteger(1);

    public Cukiernik(String nazwa, BlockingQueue<Integer> queue){
        super(nazwa);
        this.queue = queue;
    }

    public void run(){
        try{
            while (true) {
                System.out.println(Thread.currentThread().getName() + " miesza ciasto na ciastko...");
                Thread.sleep(1000);
                Integer id = serial.getAndIncrement();
                System.out.println(Thread.currentThread().getName() + " wyprodukowal ciastko " + id);
                Thread.sleep(1000);
                queue.put(id);
                System.out.println(Thread.currentThread().getName() + " polozyl zapakowane ciastka");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }


    }
}
