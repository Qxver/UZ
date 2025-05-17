package Zad1;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){
        Semaphore s1 = new Semaphore(1);

        Watek Mama = new Watek(s1);
        Watek Tata = new Watek(s1);
        Watek Dziecko = new Watek(s1);

        Mama.setName("Mama");
        Tata.setName("Tata");
        Dziecko.setName("Dziecko");

        Mama.start();
        Tata.start();
        Dziecko.start();
    }
}
