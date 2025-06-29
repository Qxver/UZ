package Zad3;

import java.util.concurrent.Semaphore;

public class Main{
    public static void main(String[] args){
        Semaphore[] s1 = new Semaphore[3];
        Semaphore[] s2 = new Semaphore[3];
        Semaphore[] s1done = new Semaphore[3];
        Semaphore[] s2done = new Semaphore[3];

        for (int i = 0; i < 3; i++){
            s1[i] = new Semaphore(0);
            s2[i] = new Semaphore(0);
            s1done[i] = new Semaphore(0);
            s2done[i] = new Semaphore(0);
        }

        Dane1 d1 = new Dane1(s1, s1done);
        Dane2 d2 = new Dane2(s2, s2done);
        Obliczenia obliczenia = new Obliczenia(d1, d2, s1, s2, s1done, s2done);

        d1.start();
        d2.start();
        obliczenia.start();
    }
}
