import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczba;
        
        do {
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);
        
        System.out.println("Suma wszystkich liczb: " + suma);
    }
}
