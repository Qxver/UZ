package Zad2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){
        int osoby = 5;
        int telefony = 2;

        Semaphore s1 = new Semaphore(telefony);

        for(int i = 0; i < 5; i++){
                
        }

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
