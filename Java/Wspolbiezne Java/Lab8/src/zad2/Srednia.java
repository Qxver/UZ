package zad2;
import java.util.List;

public class Srednia extends Thread{
    private List<Integer> oceny;
    private float srednia;

    public Srednia(List<Integer> oceny){
        this.oceny = oceny;
    }

    public void run(){
        float suma = 0;

        for(int i = 0; i < oceny.size(); i++){
            suma += oceny.get(i);
        }
        
        srednia = suma / oceny.size();
        System.out.println("Srednia: " + srednia);
    }
}
