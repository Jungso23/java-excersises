import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int suma;
        
        // Pętla while
        suma = 0;
        int i = A;
        while (i <= B) {
            suma += i;
            i++;
        }
        System.out.print(suma + " ");
        
        // Pętla do-while
        suma = 0;
        i = A;
        do {
            suma += i;
            i++;
        } while (i <= B);
        System.out.print(suma + " ");
        
        // Pętla for
        suma = 0;
        for (i = A; i <= B; i++) {
            suma += i;
        }
        System.out.print(suma);
    }
}
