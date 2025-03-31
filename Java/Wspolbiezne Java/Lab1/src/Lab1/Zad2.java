package Lab1;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int liczba = scanner.nextInt();
        int a = 0;
        for(int i=liczba; i>0; i--){
            if(liczba%i==0){
                a += 1;
            }
        }
        if(a<=2){
            System.out.println("Liczba " + liczba + " jest pierwsza.");
        }
        else{
            System.out.println("Liczba " + liczba + " nie jest pierwsza.");
        }
    }
}
