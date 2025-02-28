package Lab6;
import java.util.Scanner;

public class Interfejs{
    public static void main(String[] args){
        Pralka pralka = new Pralka();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz program prania (1-5):");
        int program = scanner.nextInt();

        pralka.programPrania(program);

        pralka.czujniki.Cisnienie();
        pralka.czujniki.Temperatura();
        pralka.czujniki.ZabezpieczeniePrzezZalaniem();
        pralka.czujniki.WagaBebna();
        pralka.grzalka.podgrzewaj(pralka.temperatura);
        pralka.beben.obracanie(pralka.predkoscBebna);
        pralka.pojemnikNaDetergenty.dodajDetergent("proszek");
        pralka.filtrWody.droznosc();
        pralka.pompaWody.pompowanie();
        pralka.czujniki.PoziomWody();
        pralka.silnik.ustawPredkosc(pralka.predkoscWirowania);
        pralka.panelSterujacy.wyswietlStan("Pranie w toku");

        System.out.println("Czy chcesz ustawić własny program prania? (tak/nie):");
        String odpowiedz = scanner.next();

        if (odpowiedz.equals("tak")){
            System.out.println("Podaj temperaturę:");
            int temperatura = scanner.nextInt();

            System.out.println("Podaj czas prania w minutach:");
            int czasPrania = scanner.nextInt();

            System.out.println("Podaj prędkość wirowania:");
            int predkoscWirowania = scanner.nextInt();

            System.out.println("Czy dodać dodatkowe płukanie? (tak/nie):");
            boolean dodatkowePlukanie = scanner.next().equalsIgnoreCase("tak");

            pralka.wlasnyProgramPrania(temperatura, czasPrania, predkoscWirowania, dodatkowePlukanie);
        }
        scanner.close();
    }
}
