import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dochód w złotych: ");
        double przychod = scanner.nextDouble();

        double podatek;
        if (przychod <= 85528) {
            podatek = 0.18 * przychod - 556.02;
        } else {
            podatek = 14839.02 + 0.32 * (przychod - 85528);
        }

        podatek = Math.max(podatek, 0);

        System.out.printf("Należny podatek dochodowy: %.2f zł%n", podatek);

        scanner.close();
    }
}
