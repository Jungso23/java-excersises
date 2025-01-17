import java.util.Scanner;

public class WzględniePierwsze {
    
    public static int nwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę (> 0): ");
        int n = scanner.nextInt();

        boolean[][] a = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int liczba1 = i + 1;
                int liczba2 = j + 1;

                if (nwd(liczba1, liczba2) == 1) {
                    a[i][j] = true;  
                } else {
                    a[i][j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]) {
                    System.out.print("+");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
