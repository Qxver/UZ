package Zad4;

import java.util.concurrent.Semaphore;

public class Main{
    public static void main(String[] args){
        Semaphore s1 = new Semaphore(0);
        Semaphore s2 = new Semaphore(0);

        Dane dane = new Dane(s1);
        Delta delta = new Delta(s1, s2);
        Pierwiastki pierwiastki = new Pierwiastki(s2);
        
        dane.start();
        delta.start();
        pierwiastki.start();
    }
}