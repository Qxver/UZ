package zad2;

public class Watek1 implements Runnable{
    public void run(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 1; i <= 1000000; i++){
            int a = i*i;
            System.out.println(Thread.currentThread().getName());
        }
    }
}
