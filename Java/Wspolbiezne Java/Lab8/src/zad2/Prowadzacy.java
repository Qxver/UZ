package zad2;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Prowadzacy extends Thread{
    private List<Integer> oceny;
    private CyclicBarrier cb;
    Random random = new Random();

    public Prowadzacy(List<Integer> oceny, CyclicBarrier cb){
        this.oceny = oceny;
        this.cb = cb;
    }

    public void run(){
        try {
            Thread.sleep(random.nextInt(3000)+1000);
            int ocena = random.nextInt(4) + 2;
            oceny.add(ocena);
            System.out.println(Thread.currentThread().getName() + " wystawił ocenę: " + ocena);
            cb.await();
        }
        catch (InterruptedException | BrokenBarrierException e){
            throw new RuntimeException(e);
        }
    }
}
