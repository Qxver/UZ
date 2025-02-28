package Lab2;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args){
        System.out.println("Wybierz operacje: ");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Dzielenie");
        Scanner scanner = new Scanner(System.in);
        int operacja = scanner.nextInt();

        System.out.println("Podaj a i b: ");
        float a = scanner.nextInt();
        float b = scanner.nextInt();

        System.out.println("Wynik: ");
        switch(operacja){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if(b!=0){
                System.out.println(a / b);
                }
                else{
                    System.out.println("Nie mozna dzielic przez 0");
                }
                break;

        }
    }
}
