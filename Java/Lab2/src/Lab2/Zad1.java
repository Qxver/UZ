package Lab2;

public class Zad1 {

    public static void main(String[] args) {
        int height = 5;
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
    }
}
