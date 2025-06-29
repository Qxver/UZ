package zad2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        List<Integer> oceny = Collections.synchronizedList(new ArrayList<>());
        CyclicBarrier cb = new CyclicBarrier(4, new Srednia(oceny));

        Prowadzacy prowadzacy1 = new Prowadzacy(oceny, cb);
        Prowadzacy prowadzacy2 = new Prowadzacy(oceny, cb);
        Prowadzacy prowadzacy3 = new Prowadzacy(oceny, cb);
        Prowadzacy prowadzacy4 = new Prowadzacy(oceny, cb);

        prowadzacy1.setName("Prowadzacy1");
        prowadzacy2.setName("Prowadzacy2");
        prowadzacy3.setName("Prowadzacy3");
        prowadzacy4.setName("Prowadzacy4");

        prowadzacy1.start();
        prowadzacy2.start();
        prowadzacy3.start();
        prowadzacy4.start();
    }
}