package zad1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args){
        int pojemnosc = 4;
                BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(pojemnosc);

        Cukiernik cukiernik = new Cukiernik("Cukiernik", queue);
        Pakowacz pakowacz = new Pakowacz("Pakowacz", queue);

        cukiernik.start();
        pakowacz.start();
    }
}
