import java.util.Random;

public class MacierzMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        

        int[][] macierz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = random.nextInt(11) - 5; 
            }
        }

        System.out.println("Macierz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }

        int[] minima = new int[5];
        int[] maxima = new int[5];

        for (int j = 0; j < 5; j++) {
            minima[j] = macierz[0][j];
            maxima[j] = macierz[0][j];
            for (int i = 1; i < 5; i++) {
                if (macierz[i][j] < minima[j]) {
                    minima[j] = macierz[i][j];
                }
                if (macierz[i][j] > maxima[j]) {
                    maxima[j] = macierz[i][j];
                }
            }
        }

        System.out.println("\nMinima dla każdej kolumny:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Kolumna " + (j + 1) + ": " + minima[j]);
        }

        System.out.println("\nMaksima dla każdej kolumny:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Kolumna " + (j + 1) + ": " + maxima[j]);
        }
    }
}
