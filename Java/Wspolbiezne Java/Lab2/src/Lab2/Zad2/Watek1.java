package Lab2.Zad2;

public class Watek1 extends Thread{
    public void run(){
        for(int i = 1; i <= 20; i++){
            System.out.println("Liczba " + i + ", Watek1;");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
