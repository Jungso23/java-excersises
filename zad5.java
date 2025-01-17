import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price;
        int installments;

        while (true) {
            System.out.print("Podaj cenę towaru (od 100 zł do 10 000 zł): ");
            price = scanner.nextDouble();
            if (price >= 100 && price <= 10000) {
                break;
            } else {
                System.out.println("Cena musi być w przedziale od 100 zł do 10 000 zł.");
            }
        }

        while (true) {
            System.out.print("Podaj liczbę rat (od 6 do 48): ");
            installments = scanner.nextInt();
            if (installments >= 6 && installments <= 48) {
                break;
            } else {
                System.out.println("Liczba rat musi być w przedziale od 6 do 48.");
            }
        }

        double interestRate;
        if (installments >= 6 && installments <= 12) {
            interestRate = 0.025;
        } else if (installments >= 13 && installments <= 24) {
            interestRate = 0.05;
        } else {
            interestRate = 0.1;
        }

        double totalPrice = price * (1 + interestRate);
        double monthlyInstallment = totalPrice / installments;

        System.out.printf("Miesięczna rata wynosi: %.2f zł%n", monthlyInstallment);

        scanner.close();
    }
}
