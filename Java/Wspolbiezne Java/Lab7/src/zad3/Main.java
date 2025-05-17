package zad3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args){
        int pojemnosc = 10;
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(pojemnosc);

        Cukiernik cukiernik1 = new Cukiernik("Cukiernik1", queue);
        Cukiernik cukiernik2 = new Cukiernik("Cukiernik2", queue);
        cukiernik1.start();
        cukiernik2.start();

        Pakowacz pakowacz1 = new Pakowacz("Pakowacz1", queue);
        Pakowacz pakowacz2 = new Pakowacz("Pakowacz2", queue);
        pakowacz1.start();
        pakowacz2.start();

        Paleciarz paleciarz1 = new Paleciarz("Paleciarz1", queue);
        Paleciarz paleciarz2 = new Paleciarz("Paleciarz2", queue);
        paleciarz1.start();
        paleciarz2.start();




    }
}
