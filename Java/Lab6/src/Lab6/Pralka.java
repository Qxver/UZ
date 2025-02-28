package Lab6;

public class Pralka{
     Grzalka grzalka;
     Beben beben;
     PojemnikNaDetergenty pojemnikNaDetergenty;
     FiltrWody filtrWody;
     PompaWody pompaWody;
     Czujniki czujniki;
     Silnik silnik;
     PanelSterujacy panelSterujacy;

    public Pralka(){
        grzalka = new Grzalka();
        beben = new Beben();
        pojemnikNaDetergenty = new PojemnikNaDetergenty();
        filtrWody = new FiltrWody();
        pompaWody = new PompaWody();
        czujniki = new Czujniki();
        silnik = new Silnik();
        panelSterujacy = new PanelSterujacy();
    }

    int temperatura, predkoscBebna, predkoscWirowania = 0;
    public void programPrania(int typProgramu){
        System.out.println("Uruchamianie programu prania: " + typProgramu);
        switch (typProgramu){
            case 1:
                temperatura = 30;
                predkoscBebna = 800;
                predkoscWirowania = 1000;
                System.out.println("Program 1...");
                break;
            case 2:
                temperatura = 20;
                predkoscBebna = 600;
                predkoscWirowania = 800;
                System.out.println("Program 2...");
                break;
            case 3:
                temperatura = 60;
                predkoscBebna = 1000;
                predkoscWirowania = 1200;
                System.out.println("Program 3...");
                break;
            case 4:
                temperatura = 40;
                predkoscBebna = 900;
                predkoscWirowania = 1000;
                System.out.println("Program 4...");
                break;
            case 5:
                temperatura = 50;
                predkoscBebna = 800;
                predkoscWirowania = 800;
                System.out.println("Program 5...");
                break;
            default:
                System.out.println("Wybrano nieprawidlowy program");
        }
    }

    public void wlasnyProgramPrania(int temperatura, int czasPrania, int predkoscWirowania, boolean dodatkowePlukanie){
        System.out.println("Ustawianie własnego programu prania...");
        System.out.println("Temperatura: " + temperatura + " stopni");
        System.out.println("Czas prania: " + czasPrania + " minut");
        System.out.println("Prędkość wirowania: " + predkoscWirowania + " obr/min");
        System.out.println("Dodatkowe płukanie: " + (dodatkowePlukanie ? "Tak" : "Nie"));
    }
}
