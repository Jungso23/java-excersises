import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator pozwalający na wykonywanie operacji +, -, *, / na dwóch liczbach.");

        System.out.print("Podaj pierwszą liczbę: ");
        double number1 = scanner.nextDouble();

        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double number2 = scanner.nextDouble();

        switch (operation) {
            case '+':
                System.out.printf("Wynik: %.2f%n", number1 + number2);
                break;
            case '-':
                System.out.printf("Wynik: %.2f%n", number1 - number2);
                break;
            case '*':
                System.out.printf("Wynik: %.2f%n", number1 * number2);
                break;
            case '/':
                if (number2 != 0) {
                    System.out.printf("Wynik: %.2f%n", number1 / number2);
                } else {
                    System.out.println("Błąd: Dzielenie przez zero jest niemożliwe.");
                }
                break;
            default:
                System.out.println("Błąd: Nieznany symbol operacji.");
        }

        System.out.println("Naciśnij Enter, aby zakończyć działanie programu.");
        scanner.nextLine();
        scanner.nextLine();

        scanner.close();
    }
}
