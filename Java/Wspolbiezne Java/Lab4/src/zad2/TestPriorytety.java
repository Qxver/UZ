package zad2;

public class TestPriorytety {
    public static void main(String[] arg)
    {
        Watek2 w2 = new Watek2();
        Thread t1 = new Thread(w2,"Watek 1");
        Thread t2 = new Thread(w2,"Watek 2");
        t2.setPriority(t1.getPriority() + 5);
        t1.start();
        t2.start();
    }

}
