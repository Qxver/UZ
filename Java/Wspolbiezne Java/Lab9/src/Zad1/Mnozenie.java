package Zad1;

public class Mnozenie{
    private static final int SIZE = 1000;

    public static void main(String[] args) {
        int[][] A = new int[SIZE][SIZE];
        int[][] B = new int[SIZE][SIZE];
        int[][] C = new int[SIZE][SIZE];
        int[][] D = new int[SIZE][SIZE];

        fill_matrix_A(A);
        fill_matrix_B(B);

        long startTime = System.nanoTime();
        Mnozenie1Watek(A, B, C);
        long stopTime = System.nanoTime();
        double time1 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 1 watku: %.2fs\n", time1);

        startTime = System.nanoTime();
        Mnozenie4Watki(A, B, D);
        stopTime = System.nanoTime();
        double time2 = (stopTime - startTime) / 1_000_000_000.0;
        System.out.printf("Czas wykonania dla 4 watkow: %.2fs\n", time2);

        boolean porownanie = porownanie(C, D);
        System.out.println("Czy macierze sa rowne: " + porownanie);

        System.out.printf("Mnozenie wielowatkowe jest %.2f razy szybsze\n", time1 / time2);
    }

    private static void Mnozenie1Watek(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                C[i][j] = 0;
                for (int k = 0; k < SIZE; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    private static void Mnozenie4Watki(int[][] A, int[][] B, int[][] D) {
        Thread[] watki = new Thread[4];
        int zakres = (SIZE + 4 - 1) / 4;

        for (int t = 0; t < 4; t++) {
             int start = t * zakres;
             int end = Math.min(SIZE, start + zakres);

            watki[t] = new Thread(() -> {
                for (int i = start; i < end; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        D[i][j] = 0;
                        for (int k = 0; k < SIZE; k++) {
                            D[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            });
            watki[t].start();
        }

        for (int t = 0; t < 4; t++) {
            try {
                watki[t].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static boolean porownanie(int[][] C, int[][] D) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (C[i][j] != D[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void fill_matrix_A(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.abs((int) Math.round(Math.sin(i+j)*10));
            }
        }
    }

    public static void fill_matrix_B(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.abs((int) Math.round(Math.cos(i+j)*10));
            }
        }
    }

    public static void show_array(int[][] matrix) {
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+", ");
            }
        }
    }
}
