package zad1;
import java.util.concurrent.Exchanger;

public class Sprzedawca extends Thread{
    Exchanger<String> ex;
    String str = "Olej rzepakowy 1 litr";

    public Sprzedawca(String name,Exchanger<String> ex)
    {
        super(name);
        this.ex = ex;
    }

    public void run() {
        System.out.println(getName() + " " + str);
        try {
            str = ex.exchange(str);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + " " + str);
    }
}