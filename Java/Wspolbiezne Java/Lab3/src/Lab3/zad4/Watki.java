package Lab3.zad4;

public class Watki extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(this.getName() + ", licznik " + i);
        }
    }
}
