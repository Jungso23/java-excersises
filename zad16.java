import java.util.Scanner;

public class Dzielniki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        System.out.print("Dzielniki liczby " + liczba + " to: ");

        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
