import java.util.Scanner;

public class Ovelser7 {
    public static void main(String[] args) {
        //opgave 1
        //footballResultScanner("3 1");

        //opgave 2
        //secretNumber();

        //opgave 3
        //footballResultScanner();

        //opgave 5
        /*
        System.out.println(canMarry(20, true, false, false));
        System.out.println(canMarry(22, false, true, false));
        System.out.println(canMarry(31, true, false, true));
        System.out.println(canMarry(17, true, true, true));
        */

        //opgave 6
        //casting();

        //opgave 7
        //secretNumber();

        //opgave 8
        //canEnter();

    }

    public static boolean canEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor gammel er du? ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("kom ind");
            return true;
        }
        System.out.println("gtfo");
        return false;
    }

    public static void casting() {
        int a = 5;
        double b = a;
        System.out.println(b);

        double a1 = 5.5;
        int b1 = (int) a1;
        System.out.println(b1);

        double a2 = 5.5;
        int b2 = (int) a2;
        System.out.println(b2);

        int a3 = 66;
        char b3 = (char) a3;
        System.out.println(b3);

        char a4 = 'B';
        int b4 = a4;
        System.out.println(b4);


        //error
        /*char a5 = 't';
        boolean b5 = (boolean) a5;
        System.out.println(b5);*/

        //error
        /*
        String a6 = "true";
        boolean b6 = (boolean) a6;
        System.out.println(b6);*/

        String a7 = "true";
        boolean b7 = Boolean.parseBoolean(a7);
        System.out.println(b7);

        /*
        String a8 = "10";
        int b8 = (int) a8;
        System.out.println(b8);*/

        String a9 = "10";
        int b9 = Integer.parseInt(a9);
        System.out.println(b9);
    }

    public static boolean canMarry(int age, boolean isHandsome, boolean isBrave, boolean isRich) {
        if (age < 18) {
            return false;
        }
        if (isHandsome) {
            if (isBrave || isRich) {
                return true;
            }
        }
        return false;
    }

    public static void secretNumber() {
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int secretNumber = 99;
        System.out.println("Gæt et tal mellem 1 og 100");
        guess = scanner.nextInt();
        while (guess != secretNumber) {

            if (guess < secretNumber) {
                System.out.print("Too low :( ");
            } else {
                System.out.print("Too high :( ");
            }

            if (guess == secretNumber && guess <= 100 && guess > 0) {
                System.out.println("Winna");
            } else {
                System.out.println("Try again");
                guess = scanner.nextInt();
            }
        }

    }

    public static void footballResultScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast resultatet af kampen: ");
        System.out.print("Hjemmehold: ");
        int score1 = scanner.nextInt();
        System.out.print("Udehold: ");
        int score2 = scanner.nextInt();
        System.out.print("Hjemmehold: " + score1 + " mål\n");
        System.out.print("Udeholdet: " + score2 + " mål\n");

        if (score1 > score2) {
            System.out.println("Hjemmeholdet vandt!");
        } else if (score2 > score1) {
            System.out.println("Udeholdet vandt!");
        } else {
            System.out.println("Det blev uafgjort!");
        }

    }

}
