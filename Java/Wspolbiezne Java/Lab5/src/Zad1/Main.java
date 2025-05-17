package Zad1;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){
        Semaphore s1 = new Semaphore(0);
        Dane dane = new Dane(s1);
        Obliczenia obliczenia = new Obliczenia(dane, s1);

        dane.start();
        obliczenia.start();
    }
}
