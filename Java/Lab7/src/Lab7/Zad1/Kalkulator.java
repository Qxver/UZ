package Lab7.Zad1;
import java.util.Arrays;

public class Kalkulator {
    double[] liczby;

    public Kalkulator(double liczba1){
        this.liczby = new double[]{liczba1};
    }

    public Kalkulator(double liczba1, double liczba2, double liczba3, double liczba4){
        this.liczby = new double[]{liczba1, liczba2, liczba3, liczba4};
    }

    public Kalkulator(double liczba1, double liczba2, double liczba3, double liczba4, double liczba5, double liczba6, double liczba7){
        this.liczby = new double[]{liczba1, liczba2, liczba3, liczba4, liczba5, liczba6, liczba7};
    }

    public Kalkulator(Kalkulator kopia){
        this.liczby = Arrays.copyOf(kopia.liczby, kopia.liczby.length);
    }

    public double Suma(){
        return Arrays.stream(liczby).sum();
    }

    public static void main(String[] args){
        Kalkulator k1 = new Kalkulator(1);
        Kalkulator k2 = new Kalkulator(1, 5, 7, 8);
        Kalkulator k3 = new Kalkulator(1, 2, 3, 4, 5, 6, 7);
        Kalkulator kopia = new Kalkulator(k3);

        System.out.println("Suma k1: " + k1.Suma());
        System.out.println("Suma k2: " + k2.Suma());
        System.out.println("Suma k3: " + k3.Suma());
        System.out.println("Suma kopia k3: " + kopia.Suma());
    }
}

