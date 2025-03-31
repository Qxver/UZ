package Lab2.Zad3;

public class Test {
    public static void main(String[] args){
        Watek1 w1 = new Watek1();
        Watek2 w2 = new Watek2();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        System.out.println("Start programu");
        t1.start();
        t2.start();
        System.out.println("Koniec programu");
    }
}
