import java.util.Random;

public class MacierzMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Tworzymy macierz 5x5
        int[][] macierz = new int[5][5];
        
        // Wypełniamy macierz losowymi liczbami z zakresu -5 do 5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = random.nextInt(11) - 5; // Zakres od -5 do 5
            }
        }

        // Wyświetlamy macierz
        System.out.println("Macierz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Wyznaczanie minimów i maksimów dla każdej kolumny
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

        // Wyświetlanie minimów
        System.out.println("\nMinima dla każdej kolumny:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Kolumna " + (j + 1) + ": " + minima[j]);
        }

        // Wyświetlanie maksimów
        System.out.println("\nMaksima dla każdej kolumny:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Kolumna " + (j + 1) + ": " + maxima[j]);
        }
    }
}
