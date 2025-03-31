package Lab1;
import java.util.Random;
import java.util.Arrays;

public class Zad5 {
    public static void main(String[] args){
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrix3 = new int[3][3];
        Random random = new Random();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix1[i][j] = random.nextInt(100);
                matrix2[i][j] = random.nextInt(100);
            }
        }

        
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix3));
    }
}
