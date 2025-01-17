import java.util.Random;

public class LiczbyTablica {
    public static void main(String[] args) {
        Random random = new Random();

        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10) + 1; 
        }

        System.out.print("Wylosowane liczby: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println();

        int[] wystapienia = new int[10]; 
        for (int i = 0; i < tablica.length; i++) {
            wystapienia[tablica[i] - 1]++; 
        }

        System.out.println("Wystąpienia:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + wystapienia[i]);
        }
    }
}
