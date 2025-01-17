import java.util.Random;
import java.util.Scanner;

public class GraZaDuzaZaMala {
    public static void main(String[] args) {
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(100) + 1;  
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = 0;

        System.out.println("Witaj w grze 'Za dużo, za mało'! Spróbuj zgadnąć liczbę.");

        while (podanaLiczba != wylosowanaLiczba) {
            System.out.print("Podaj liczbę (1-100): ");
            podanaLiczba = scanner.nextInt();

            if (podanaLiczba > wylosowanaLiczba) {
                System.out.println("Podałeś za dużą wartość.");
            } else if (podanaLiczba < wylosowanaLiczba) {
                System.out.println("Podałeś za małą wartość.");
            }
        }

        System.out.println("Gratulacje! Zgadłeś liczbę.");
    }
}
