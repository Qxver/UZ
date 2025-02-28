package Lab10;
import java.time.LocalDate;

public class Zad1{
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int threadId = i;
            Thread thread = new Thread(() -> {
                System.out.println("Wątek: " + threadId + ", Data: " + LocalDate.now());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.err.println("Wątek został przerwany: " + threadId);
                }
            });
            thread.start();
        }
    }
}
