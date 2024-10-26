public class Main {
    public static void main(String[] args){
        System.out.println("Nasza pierwsza aplikacja");

        int number = 7;
        int conditionNumber=6;


        if (number>conditionNumber){
            System.out.println("Liczba " + number + " jest wieksza od " + conditionNumber);
            if (number == 7){
                System.out.println("Siedem to szczęśliwa liczba");
            }
        } else if (number<conditionNumber){
            System.out.println("Liczba " + number + " jest mniejsza od " + conditionNumber);
        }else {
            System.out.println("Liczby sa równe");
        }
    }
}
