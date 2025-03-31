package Lab3.zad4;

import Lab3.zad1.Watek;

public class Main {
    public static void main(String[] args){
        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();
        Watek w4 = new Watek();
        Watek w5 = new Watek();
        w1.setName("Watek 1");
        w2.setName("Watek 2");
        w3.setName("Watek 3");
        w4.setName("Watek 4");
        w5.setName("Watek 5");

        w5.start();

        try {
            w5.join();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        w4.start();

        try {
            w4.join();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        w3.start();

        try {
            w3.join();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        w2.start();

        try {
            w2.join();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        w1.start();
    }
}
