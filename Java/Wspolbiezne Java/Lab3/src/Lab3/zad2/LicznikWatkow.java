package Lab3.zad2;

public class LicznikWatkow {
    private int wartoscKrytyczna;

    public synchronized int policzMnie() {
        wartoscKrytyczna++;
        wartoscKrytyczna--;
        return wartoscKrytyczna;
    }
}