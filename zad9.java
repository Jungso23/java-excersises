import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int potega = 1;
        while (potega <= n) {
            System.out.print(potega + " ");
            potega *= 2;
        }
    }
}
