package Lab8.Zad2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Studenci = new ArrayList<>();
        Student student1 = new Student("Jan", "Kowalski", "383012");
        Student student2 = new Student("Jakub", "Nowak", "199447");
        Student student3 = new Student("Adrian", "Wisniewski", "112107");
        Studenci.add(student1);
        Studenci.add(student2);
        Studenci.add(student3);
        Studenci.forEach(System.out::println);
        System.out.println();

        System.out.println("Dlugosc listy: " + Studenci.size());
        System.out.println("3 element listy: " + Studenci.get(2));
    }
}
