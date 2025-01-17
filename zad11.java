import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        int licznik = 0;

        do {
            liczba = scanner.nextInt();
            if (liczba != 0) {
                if (liczba > max) {
                    max = liczba;
                }
                if (liczba < min) {
                    min = liczba;
                }
                suma += liczba;
                licznik++;
            }
        } while (liczba != 0);

        if (licznik > 0) {
            int sumaMaxMin = max + min;
            double srednia = (double) suma / licznik;
            
            System.out.println("Suma największej i najmniejszej liczby: " + sumaMaxMin);
            System.out.println("Średnia arytmetyczna liczb: " + srednia);
        } else {
            System.out.println("Nie podano żadnych liczb.");
        }
    }
}
