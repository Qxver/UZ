package Zad3;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        final int liczba_filozofow = 5;
        Filozof[] filozof = new Filozof[liczba_filozofow];
        Semaphore[] widelec = new Semaphore[liczba_filozofow];

        for (int i = 0; i < liczba_filozofow; i++) {
            widelec[i] = new Semaphore(1);
        }

        for (int i = 0; i < liczba_filozofow; i++) {
            Semaphore LewyWidelec = widelec[i];
            Semaphore PrawyWidelec = widelec[(i + 1) % liczba_filozofow];
            filozof[i] = new Filozof(i, LewyWidelec, PrawyWidelec);
            filozof[i].start();
        }
    }
}
