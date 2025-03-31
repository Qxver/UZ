package Lab2.Zad2;

public class Watek2 extends Thread{

    public void run(){
        for(int i = 1; i <= 20; i++){
            System.out.println("Liczba " + i + ", Watek2;");
        }
    }
}
