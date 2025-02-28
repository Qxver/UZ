public class StudentInstytut extends StudentUZ {
    String Instytut;

    public void Ustaw_instytut(String Instytut){
        this.Instytut = Instytut;
    }

    public String getInstytut(){
        return Instytut;
    }

    @Override
    public String toString() {
        return "Imie: " + imie + "\nNazwisko: " + nazwisko + "\nIndeks: " + indeks + "\nWydzial: " + Wydzial + "\nInstytut:" + Instytut + "\n";
    }
}
