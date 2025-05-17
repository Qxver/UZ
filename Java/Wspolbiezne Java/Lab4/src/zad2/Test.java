package zad2;

public class Test{
    public static void
    main(String[] args){
        Watek1 w1 = new Watek1();
        new Thread(w1,"Watek 1").start();
        new Thread(w1,"Watek 2").start();
    }
}
