package zad3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Pakowacz extends Thread{
    private BlockingQueue<Integer> queue;
    private static AtomicInteger serial = new AtomicInteger(1);

    public Pakowacz(String nazwa, BlockingQueue<Integer> queue){
        super(nazwa);
        this.queue = queue;
    }

    public void run(){
        try{
            while(true){
                System.out.println(Thread.currentThread().getName() + " czeka na ciastko...");
                Integer x = queue.take();
                Integer y = queue.take();
                System.out.println(Thread.currentThread().getName()+ " zdjal " + x  + " ciastko i " + y + " ciastko i je zapakowal");
                Thread.sleep(1000);
                Integer id = serial.getAndIncrement();
                queue.put(id);
                System.out.println(Thread.currentThread().getName() + " polozyl ciastka w sreberku " + x);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
