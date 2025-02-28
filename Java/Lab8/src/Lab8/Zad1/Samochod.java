package Lab8.Zad1;
import java.time.LocalDate;

public class Samochod {
    String marka;
    String model;
    double pojemnosc_silnika;
    String typ_nadwozia;
    String typ_silnika;
    int rok_produkcji;
    String data_1_rejestracji;
    double cena;

    public Samochod(String marka, String model, double pojemnosc_silnika, String typ_nadwozia, String typ_silnika, int rok_produkcji, String data_1_rejestracji, double cena){
        this.marka = marka;
        this.model = model;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.typ_nadwozia = typ_nadwozia;
        this.typ_silnika = typ_silnika;
        this.rok_produkcji = rok_produkcji;
        this.data_1_rejestracji = data_1_rejestracji;
        this.cena = cena;
    }

    String getMarka(){
        return marka;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getPojemnosc_silnika(){
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(int pojemnosc_silnika){
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public String getTyp_nadwozia(){
        return typ_nadwozia;
    }

    public void setTyp_nadwozia(String typ_nadwozia){
        this.typ_nadwozia = typ_nadwozia;
    }

    public String getTyp_silnika(){
        return typ_silnika;
    }

    public void setTyp_silnika(String typ_silnika){
        this.typ_silnika = typ_silnika;
    }

    public int getRok_produkcji(){
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji){
        this.rok_produkcji = rok_produkcji;
    }

    public String getData_1_rejestracji(){
        return data_1_rejestracji;
    }

    public void setData_1_rejestracji(String data_1_rejestracji){
        this.data_1_rejestracji = data_1_rejestracji;
    }

    public double getCena(){
        return cena;
    }

    public void setCena(double cena){
        this.cena = cena;
    }

    public void gwarancja() {
        LocalDate DataRejestracji = LocalDate.parse(this.data_1_rejestracji);
        LocalDate dataGraniczna = DataRejestracji.plusYears(2);
        if (LocalDate.now().isBefore(dataGraniczna)) {
            System.out.println("Samochod posiada gwarancję");
        } else {
            System.out.println("Samochod nie posiada gwarancji");
        }
    }

    @Override
    public String toString() {
        return "Marka: " + marka + "\nModel: " + model + "\nPojemność silnika: " + pojemnosc_silnika +
                "\nTyp nadwozia: " + typ_nadwozia + "\nTyp silnika: " + typ_silnika +
                "\nRok produkcji: " + rok_produkcji + "\nData rejestracji: " + data_1_rejestracji +
                "\nCena: " + cena + "\n";
    }
}

