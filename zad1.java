import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = 1.8 * celsius + 32.0;
        System.out.printf("Temperatura %.2f stopni Celsjusza to %.2f stopni Fahrenheita.%n", celsius, fahrenheit);
        scanner.close();
    }
}
