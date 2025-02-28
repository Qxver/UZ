package Lab7;
import java.io.*;
import java.util.Scanner;


public class Zad2 {
    public static void main(String[] args) throws IOException {
        File txt = new File("txt.txt");
        File csv = new File("csv.csv");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do zapisania do pliku txt: ");

        String writeTxt = scanner.nextLine();
        FileWriter fw = new FileWriter(txt);
        fw.write(writeTxt);

        FileReader fr = new FileReader(txt);
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }

        fw.close();
        fr.close();

        FileReader fr2 = new FileReader(csv);

        fr2.close();
        scanner.close();
    }
}
