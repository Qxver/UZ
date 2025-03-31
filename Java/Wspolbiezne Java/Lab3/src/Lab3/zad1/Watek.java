package Lab3.zad1;

public class Watek extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + ", licznik " + i);
        }
    }
}
