import java.util.Scanner;

public class LiczbaCyfry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int sumaCyfr = 0;
        int sumaParzystych = 0;
        int sumaNieparzystych = 0;
        int liczbaParzystych = 0;
        int liczbaNieparzystych = 0;
        
        int temp = Math.abs(liczba); 


        while (temp > 0) {
            int cyfra = temp % 10;
            sumaCyfr += cyfra;

            if (cyfra % 2 == 0) { 
                sumaParzystych += cyfra;
                liczbaParzystych++;
            } else { 
                sumaNieparzystych += cyfra;
                liczbaNieparzystych++;
            }

            temp /= 10;
        }


        double sredniaParzystych = (liczbaParzystych > 0) ? (double) sumaParzystych / liczbaParzystych : 0;
        double sredniaNieparzystych = (liczbaNieparzystych > 0) ? (double) sumaNieparzystych / liczbaNieparzystych : 0;


        double stosunek = (sredniaNieparzystych != 0) ? sredniaParzystych / sredniaNieparzystych : 0;


        System.out.println("Suma cyfr liczby: " + sumaCyfr);
        System.out.println("Średnia arytmetyczna cyfr parzystych: " + sredniaParzystych);
        System.out.println("Średnia arytmetyczna cyfr nieparzystych: " + sredniaNieparzystych);
        System.out.println("Stosunek średniej arytmetycznej cyfr parzystych do nieparzystych: " + stosunek);
    }
}
