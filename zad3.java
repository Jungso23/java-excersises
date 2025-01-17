import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wagę w kilogramach: ");
        double weight = scanner.nextDouble();

        System.out.print("Podaj wzrost w metrach: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else {
            System.out.println("Nadwaga");
        }

        scanner.close();
    }
}
