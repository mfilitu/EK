import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e){
            System.out.println("Fejl: " + e.getMessage());
        }

        try {
            account.deposit(-1500);
        } catch (InsufficientFundsException e){
            System.out.println("Fejl: " + e.getMessage());
        }

        System.out.println(OddEvenChecker.isEven(4));
        System.out.println(OddEvenChecker.isOdd(7));

        int[] arr = {9, 5, 2, 8, 1};

        System.out.println(LargestNumberFinder.findLargest(arr));

        System.out.println(StringStatistics.countChars("programmering", 'r'));

        /*System.out.print("BMI calculator:\n");

        try{
            System.out.println(Bmi.calculate(1.81, 84.4));
            System.out.println(Bmi.calculate(0, 84));
        } catch (InvalidHeightException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Bmi.calculate(0,84));*/



    }
}
