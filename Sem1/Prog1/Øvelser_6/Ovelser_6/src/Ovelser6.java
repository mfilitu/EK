import java.util.Scanner;

public class Ovelser6 {
    public static void main(String[] args) {
        //countDown(10);

        //opgave1
        //interest(10, 0.5);
        //interest(10, 0.01);

        //opgave2
        //System.out.println(strawberry("rrrr"));

        //opgave3
        //substring();

        //Opgave 4
        //countDown(10);

        //opgave 5
        System.out.println(palindrome("otto"));
        System.out.println(palindrome("anna"));
        System.out.println(palindrome("Drage"));
        System.out.println(palindrome("xdd"));

        //opgave 6 skipped

        //using import java.util.Scanner;

//        Scanner scanner = new Scanner(System.in);
//        int age = -1;
//        while (age < 0 || age > 100) {
//            System.out.print("Indtast din alder: ");
//            age = scanner.nextInt();
//        }
//        System.out.println("Din alder er: " + age);


    }


    public static boolean palindrome(String word) {
        int len = word.length();
        int i = 0;

        if (len <= 1) {
            //System.out.println("True");
            return true;
        }
        char c = word.charAt(i);
        char c2 = word.charAt(len - 1);
        //System.out.println(c);
        //System.out.println(c2);

        if (c == c2) {
            palindrome(word.substring(1, len - 1));
        } else {
            return false;
        }

        return true;
    }

    public static int strawberry(String word) {
        int count = 0;
        int len = word.length();
        //System.out.println(len);
        int i = 0;

        while (i < len) {
            char r = word.charAt(i);
            i++;
            if (r == 'r') {
                count++;
            }
        }
        return count;
    }

    public static void substring() {
        String text = "strawberry";
        String part = text.substring(5);
        String part1 = text.substring(2, 5);
        String part2 = text.substring(10);
        //String part3 = text.substring(11); fejler da det er out of bounds
        System.out.println(part);
        System.out.println(part1);
        System.out.println(part2);
        //System.out.println(part3);
    }

    public static void countDown(int n) {
        int count = 0;
        if (n >= 0) {
            System.out.println(n);
            countDown(n - 1);
        } else {
            System.out.println("Done");
        }
    }

    public static void interest(int years, double interestRate) {
        double startingBal = 10000;
        int count = 0;
        while (years > 0) {
            count++;
            startingBal = startingBal + (startingBal * interestRate);
            System.out.println("Year: " + count + " Bal: " + startingBal);
            years--;
        }
    }

}