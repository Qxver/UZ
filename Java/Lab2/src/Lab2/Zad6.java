package Lab2;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj cene pojazdu: (max 300tys)");
        int cena = scanner.nextInt();

        System.out.println("Podaj liczbe rat: (max 96 miesiecy)");
        int raty = scanner.nextInt();

        if(cena>300000){
            System.out.println("Bledna cena pojazdu");

        }

        else if(raty<=24){
            System.out.println("Cena miesiecznego zobowiazania przez " + raty + " miesiecy: ");
            System.out.println((cena*1.02)/raty);
        }

        else if(raty<=48){
            System.out.println("Cena miesiecznego zobowiazania przez " + raty + " miesiecy: ");
            System.out.println((cena*1.03)/raty);
        }

        else if(raty<=60){
            System.out.println("Cena miesiecznego zobowiazania przez " + raty + " miesiecy: ");
            System.out.println((cena*1.04)/raty);
        }

        else if(raty<=72){
            System.out.println("Cena miesiecznego zobowiazania przez " + raty + " miesiecy: ");
            System.out.println((cena*1.05)/raty);
        }

        else if(raty<=96){
            System.out.println("Cena miesiecznego zobowiazania przez " + raty + " miesiecy: ");
            System.out.println((cena*1.06)/raty);
        }

        else{
            System.out.println("Bledna ilosc rat");
        }

        }
    }

