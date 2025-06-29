package Zad3;

import java.util.concurrent.Semaphore;

public class Filozof extends Thread{
    private int id;
    private Semaphore LewyWidelec;
    private Semaphore PrawyWidelec;

    public Filozof(int id, Semaphore LewyWidelec, Semaphore PrawyWidelec){
        this.id = id;
        this.LewyWidelec = LewyWidelec;
        this.PrawyWidelec = PrawyWidelec;
    }

    private void Mysli(){
        try{
            System.out.println("Filozof " + id + " myśli.");
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    private void Je(){
        try{
            System.out.println("Filozof " + id + " je.");
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    public void run(){
        try{
            while(true){
                Mysli();
                System.out.println("Filozof " + id + " jest głodny.");

                if (id % 2 == 0){
                    LewyWidelec.acquire();
                    System.out.println("Filozof " + id + " podniósł lewy widelec.");
                    PrawyWidelec.acquire();
                    System.out.println("Filozof " + id + " podniósł prawy widelec.");
                } 
                else{
                    PrawyWidelec.acquire();
                    System.out.println("Filozof " + id + " podniósł prawy widelec.");
                    LewyWidelec.acquire();
                    System.out.println("Filozof " + id + " podniósł lewy widelec.");
                }

                Je();

                LewyWidelec.release();
                PrawyWidelec.release();
                System.out.println("Filozof " + id + " odłożył widelce.");
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
