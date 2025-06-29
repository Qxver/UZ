package Zad2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){
        final int osoby = 5;
        final int telefony = 2;

        Semaphore s1 = new Semaphore(telefony);

        for(int i = 0; i < osoby; i++){
            Watek osoba = new Watek(s1);
            osoba.setName("Osoba-" + (i + 1));
            osoba.start();
        }
    }
}
