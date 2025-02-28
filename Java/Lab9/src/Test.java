import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<StudentInstytut> Instytuty = new ArrayList<>();

        StudentInstytut instytut1 = new StudentInstytut();
        instytut1.Ustaw_Imie("Jan");
        instytut1.Ustaw_nazwisko("Kowalski");
        instytut1.Ustaw_indeks("238192");
        instytut1.Ustaw_wydzial("Wydzial1");
        instytut1.Ustaw_instytut("Instytut1");
        Instytuty.add(instytut1);

        StudentInstytut instytut2 = new StudentInstytut();
        instytut2.Ustaw_Imie("Jakub");
        instytut2.Ustaw_nazwisko("Nowak");
        instytut2.Ustaw_indeks("381491");
        instytut2.Ustaw_wydzial("Wydzial2");
        instytut2.Ustaw_instytut("Instytut2");
        Instytuty.add(instytut2);

        Instytuty.forEach(System.out::println);
    }
}
