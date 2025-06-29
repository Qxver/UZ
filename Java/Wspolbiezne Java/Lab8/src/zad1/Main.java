package zad1;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args){
        Exchanger<String> ex = new Exchanger<>();
        Klient k1 = new Klient("Klient", ex);
        Sprzedawca s1 = new Sprzedawca("Sprzedawca", ex);
        k1.start();
        s1.start();
    }
}
