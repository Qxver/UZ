package Lab8.Zad1;

import java.util.ArrayList;

public class AutoKomis {
    public static void main(String[] args) {
        int Lp;
        ArrayList<Samochod> Lista = new ArrayList<>();
        Samochod auto1 = new Samochod("Volkswagen", "Passat", 2.0, "Sedan", "Diesel", 2017, "2017-05-15", 62000);
        Samochod auto2 = new Samochod("BMW", "320i", 2.0, "Coupe", "Benzyna", 2019, "2019-08-22", 105000);
        Samochod auto3 = new Samochod("Toyota", "Corolla", 1.8, "Hatchback", "Hybryda", 2021, "2021-02-11", 89000);
        Samochod auto4 = new Samochod("Audi", "A4", 2.0, "Kombi", "Diesel", 2018, "2018-06-30", 98000);
        Samochod auto5 = new Samochod("Mercedes-Benz", "C 200", 2.0, "Sedan", "Benzyna", 2020, "2020-03-05", 145000);
        Samochod auto6 = new Samochod("Honda", "Civic", 1.5, "Sedan", "Benzyna", 2019, "2019-09-18", 82000);
        Samochod auto7 = new Samochod("Ford", "Focus", 1.5, "Hatchback", "Diesel", 2016, "2016-11-07", 45000);
        Samochod auto8 = new Samochod("Mazda", "6", 2.5, "Sedan", "Benzyna", 2022, "2022-04-12", 129000);
        Samochod auto9 = new Samochod("Hyundai", "Tucson", 1.6, "SUV", "Hybryda", 2021, "2021-07-20", 125000);
        Samochod auto10 = new Samochod("Volvo", "XC60", 2.0, "SUV", "Diesel", 2020, "2020-10-03", 185000);
        Lista.add(auto1);
        Lista.add(auto2);
        Lista.add(auto3);
        Lista.add(auto4);
        Lista.add(auto5);
        Lista.add(auto6);
        Lista.add(auto7);
        Lista.add(auto8);
        Lista.add(auto9);
        Lista.add(auto10);

        Lista.forEach((i) -> System.out.println(i));
        auto1.gwarancja();

    }
}
