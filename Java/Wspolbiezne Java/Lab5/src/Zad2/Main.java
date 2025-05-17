package Zad2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){
        Semaphore s1 = new Semaphore(0);
        Semaphore s2 = new Semaphore(0);
        Dane1 d1 = new Dane1(s1);
        Dane2 d2 = new Dane2(s2);
        Obliczenia obliczenia = new Obliczenia(d1, d2, s1, s2);
        d1.start();
        d2.start();
        obliczenia.start();
    }
}
