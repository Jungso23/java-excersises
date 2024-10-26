import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("konwersja z C do F");
        //1,8* C +32.0


        Scanner input1 = new Scanner(System.in);
        System.out.println("Podaj 1 cyfre ");
        int a = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Podaj 2 cyfre ");
        int b = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Podaj 3 cyfre ");
        int c = input3.nextInt();
        input3.close();

        if (a > b && a > c) {
            System.out.println("cyfra " + a + " jest największa");
        }
        else if (b > a && b > c) {
            System.out.println("cyfra " + b + " jest najwieksza");
        }
        else if (c > a && c > b) {
            System.out.println("cyfra " + c + " jest najwieksza");
        }

        if (a < b && a < c) {
            System.out.println("cyfra " + a + " jest najmniejsza");
        }
        else if (b < a && b < c) {
            System.out.println("cyfra " + b + " jest najmniejsza");
        }
        else if (c < a && c < b) {
            System.out.println("cyfra " + c + " jest najmniejsza");
        }
    }

}
//        boolean done = false;
//        int count = 10;
//
//        while (!done) {
//            try {
//                Scanner input = new Scanner();
//                System.out.println("podaj liczbe: ");
//                int number = input.nextInt();
//                input.close();
//            }
//        }
//        for (int i = 0; i < number; i++) {
//            for (int j = 1; j <= number; j++) {
//                if (j == number) {
//                    System.out.println(j);
//                } else {
//                    System.out.println(j + ", ");
//                }
//            }
//            System.out.println();
//        }
//        done = true;
//    }catch (InputMismatchException exception){
//        System.out.println("Prosze podac prawidlowoa liczbe ");
//        Scanner input = new Scanner(System.in);
//        System.out.println("podaj liczbe: ");
//        int number=input.nextInt();
//        input.close();
//
//        try{
//            number=input.nextInt();
//
//          for(int i=0; i <number; i++){
//            for (int j=1; j<=number; j++) {
//               if (j == number) {
//                   System.out.println(j);
//               }else {
//                   System.out.println(j + ", ");
//               }
//            }
//          System.out.println();
//          }
//
//        }catch (InputMismatchException exception){
//            System.out.println("prosze podac liczbe calkowita");
//        }
//
//        input.close();
