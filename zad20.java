import java.util.Scanner;

public class KonwersjaNaBinarny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int[] bity = new int[32];

        int n = Math.abs(liczba); 

        int index = 0;
        while (n > 0) {
            bity[index] = n % 2; 
            n = n / 2;        
            index++;
        }

        System.out.print("Liczba " + liczba + " binarnie: ");

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(bity[i]);
        }

        System.out.print(".");

        double częśćPoPrzecinku = Math.abs(liczba) - Math.floor(Math.abs(liczba));
        for (int i = 0; i < 7; i++) { 
            częśćPoPrzecinku *= 2;
            int bit = (int) częśćPoPrzecinku;
            System.out.print(bit);
            częśćPoPrzecinku -= bit;
        }
        
        System.out.println();
    }
}
