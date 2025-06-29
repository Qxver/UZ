package Zad2;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.security.MessageDigest;

public class Mnozenie{
    private static int SIZE = 500;
    private static final int liczba_rdzeni  = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args){
        try {
            PrintStream out = new PrintStream(new FileOutputStream("wyniki.txt", true));
            System.setOut(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Liczba rdzeni procesora: " + liczba_rdzeni + "\n");
        int[][] A = new int[SIZE][SIZE];
        int[][] B = new int[SIZE][SIZE];
        int[][] C1 = new int[SIZE][SIZE];
        int[][] D1 = new int[SIZE][SIZE];

        fill_matrix_A(A);
        fill_matrix_B(B);

        System.out.println("Macierze 500x500");
        long startTime = System.nanoTime();
        Mnozenie1Watek(A, B, C1);
        long stopTime = System.nanoTime();
        double time1 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 1 watku: %.2fs\n", time1);

        startTime = System.nanoTime();
        MnozenieRdzenie(A, B, D1);
        stopTime = System.nanoTime();
        double time2 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 4 watkow: %.2fs\n", time2);

        boolean porownanie = porownanie(C1, D1);
        System.out.println("Czy macierze sa rowne: " + porownanie);

        System.out.printf("Mnozenie wielowatkowe jest %.2f razy szybsze\n", time1 / time2);

        System.out.println("MD5 macierzy C1: " + MD5(C1));
        System.out.println("MD5 macierzy D1: " + MD5(D1) + "\n");

        SIZE = 1000;
        A = new int[SIZE][SIZE];
        B = new int[SIZE][SIZE];
        int[][] C2 = new int[SIZE][SIZE];
        int[][] D2 = new int[SIZE][SIZE];

        System.out.println("Macierze 1000x1000");
        startTime = System.nanoTime();
        Mnozenie1Watek(A, B, C2);
        stopTime = System.nanoTime();
        double time3 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 1 watku: %.2fs\n", time3);

        startTime = System.nanoTime();
        MnozenieRdzenie(A, B, D2);
        stopTime = System.nanoTime();
        double time4 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 4 watkow: %.2fs\n", time4);

        porownanie = porownanie(C2, D2);
        System.out.println("Czy macierze sa rowne: " + porownanie);

        System.out.printf("Mnozenie wielowatkowe jest %.2f razy szybsze\n", time3 / time4);

        System.out.println("MD5 macierzy C2: " + MD5(C2));
        System.out.println("MD5 macierzy D2: " + MD5(D2) + "\n");


        SIZE = 1500;
        A = new int[SIZE][SIZE];
        B = new int[SIZE][SIZE];
        int[][] C3 = new int[SIZE][SIZE];
        int[][] D3 = new int[SIZE][SIZE];

        System.out.println("Macierze 1500x1500");
        startTime = System.nanoTime();
        Mnozenie1Watek(A, B, C3);
        stopTime = System.nanoTime();
        double time5 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 1 watku: %.2fs\n", time5);

        startTime = System.nanoTime();
        MnozenieRdzenie(A, B, D3);
        stopTime = System.nanoTime();
        double time6 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 4 watkow: %.2fs\n", time6);

        porownanie = porownanie(C3, D3);
        System.out.println("Czy macierze sa rowne: " + porownanie);

        System.out.printf("Mnozenie wielowatkowe jest %.2f razy szybsze\n", time5 / time6);

        System.out.println("MD5 macierzy C3: " + MD5(C3));
        System.out.println("MD5 macierzy D3: " + MD5(D3) + "\n");

        System.out.println("---------------------------------------------------------------------");

        
    }

    private static void Mnozenie1Watek(int[][] A, int[][] B, int[][] C){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                C[i][j] = 0;
                for (int k = 0; k < SIZE; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    private static void MnozenieRdzenie(int[][] A, int[][] B, int[][] D){
        Thread[] watki = new Thread[liczba_rdzeni];
        int zakres = (SIZE + liczba_rdzeni - 1) / liczba_rdzeni;

        for (int t = 0; t < liczba_rdzeni; t++){
            final int start = t * zakres;
            final int end = Math.min(SIZE, start + zakres);

            watki[t] = new Thread(() ->{
                for (int i = start; i < end; i++){
                    for (int j = 0; j < SIZE; j++){
                        D[i][j] = 0;
                        for (int k = 0; k < SIZE; k++){
                            D[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            });
            watki[t].start();
        }

        for (int t = 0; t < liczba_rdzeni; t++){
            try{
                watki[t].join();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    private static boolean porownanie(int[][] C, int[][] D){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (C[i][j] != D[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static void fill_matrix_A(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Math.abs((int) Math.round(Math.sin(i+j)*10));
            }
        }
    }

    private static void fill_matrix_B(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Math.abs((int) Math.round(Math.cos(i+j)*10));
            }
        }
    }

    private static void show_array(int[][] matrix){
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+", ");
            }
        }
    }

    private static String MD5(int[][] matrix){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    int value = matrix[i][j];
                    md.update((byte) (value >> 24));
                    md.update((byte) (value >> 16));
                    md.update((byte) (value >> 8));
                    md.update((byte) (value));
                }
            }

            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++){
                sb.append(String.format("%02x", digest[i]));
            }

            return sb.toString();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
