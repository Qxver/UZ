package Lab1;

public class Zad1 {
    public static void main(String[] args){
        System.out.println("Hello world");

        int height = 10;
        int k = 1;
        int b = height;
        for(int i=0; i<height; i++) {

            for(int a=0; a<b; a++) {
                System.out.print(" ");
            }

            for(int j=0; j<k; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
            b-=1;
            k += 2;
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<=height-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("     \n");
        }
    }
}
