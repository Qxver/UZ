package Lab2.Zad3;

public class Watek2 implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 20; i++){
            System.out.println("Liczba " + i + ", Watek2;");
        }
    }
}
