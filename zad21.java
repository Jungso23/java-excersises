import java.util.Scanner;

public class KonwersjaKodow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        System.out.println("Liczba " + liczba + " w kodzie ZM (binarnym): " + toBinary(liczba));

        System.out.println("Liczba " + liczba + " w kodzie ZU1: " + toZU1(liczba));

        System.out.println("Liczba " + liczba + " w kodzie ZU2: " + toZU2(liczba));
    }

    public static String toBinary(int liczba) {
        return Integer.toBinaryString(liczba);
    }

    public static String toZU1(int liczba) {
        if (liczba >= 0) {
            return Integer.toBinaryString(liczba);
        } else {
            int absValue = Math.abs(liczba);
            String binary = Integer.toBinaryString(absValue);
            StringBuilder inverted = new StringBuilder();
            for (int i = 0; i < binary.length(); i++) {
                inverted.append(binary.charAt(i) == '0' ? '1' : '0');
            }
            return inverted.toString();
        }
    }

    public static String toZU2(int liczba) {
        if (liczba >= 0) {
            return Integer.toBinaryString(liczba);
        } else {
            int absValue = Math.abs(liczba);
            String binary = Integer.toBinaryString(absValue);
            StringBuilder inverted = new StringBuilder();
            for (int i = 0; i < binary.length(); i++) {
                inverted.append(binary.charAt(i) == '0' ? '1' : '0');
            }
            String result = addOneToBinary(inverted.toString());
            return result;
        }
    }

    public static String addOneToBinary(String binary) {
        StringBuilder result = new StringBuilder(binary);
        int carry = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1' && carry == 1) {
                result.setCharAt(i, '0');
                carry = 1;
            } else if (binary.charAt(i) == '0' && carry == 1) {
                result.setCharAt(i, '1');
                carry = 0;
            }
        }
        if (carry == 1) {
            result.insert(0, "1");
        }
        return result.toString();
    }
}
