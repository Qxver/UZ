package zad3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Paleciarz extends Thread{
    private BlockingQueue<Integer> queue2;
    private static AtomicInteger serial = new AtomicInteger(1);

    public Paleciarz(String nazwa, BlockingQueue<Integer> queue2){
        super(nazwa);
        this.queue2 = queue2;
    }

    public void run(){
        try{
            while(true){
                Integer x = queue2.take();
                Integer id = serial.getAndIncrement();
                System.out.println(Thread.currentThread().getName()+ " zdjal ciastka " + x);
                Thread.sleep(1000);
                x = queue2.take();
                System.out.println(Thread.currentThread().getName()+ " zdjal ciastka " + x);
                Thread.sleep(1000);
                x = queue2.take();
                System.out.println(Thread.currentThread().getName()+ " zdjal ciastka " + x);
                Thread.sleep(1000);
                x = queue2.take();
                System.out.println(Thread.currentThread().getName()+ " zdjal ciastka " + x);
                Thread.sleep(1000);
                queue2.put(id);
                System.out.println(Thread.currentThread().getName()+ " umieszcza palete ciastek " + id + " w magazynie ");
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
