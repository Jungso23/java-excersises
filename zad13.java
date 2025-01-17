import java.util.Scanner;

public class Prostokat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak wypełnienia prostokąta: ");
        char znak = scanner.next().charAt(0);
        System.out.print("Podaj współrzędną x lewego górnego rogu: ");
        int x = scanner.nextInt();
        System.out.print("Podaj współrzędną y lewego górnego rogu: ");
        int y = scanner.nextInt();
        System.out.print("Podaj długość boku a (szerokość): ");
        int a = scanner.nextInt();
        System.out.print("Podaj długość boku b (wysokość): ");
        int b = scanner.nextInt();

        for (int i = 1; i <= y + b - 1; i++) {
            for (int j = 1; j <= x + a - 1; j++) {
                if (i >= y && i < y + b && j >= x && j < x + a) {
                    System.out.print(znak); 
                } else {
                    System.out.print("_");
                }
            }
            System.out.println(); 
        }
    }
}
