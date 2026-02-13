import java.util.Scanner;
import java.util.Random;

public class Ovelser8 {
    public static void main(String[] args) {

        //secretNumber();

        //rockPaperSiccors();

        //printTabel(7);
        printTabels();
    }

    public static void printTabel(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d * %2d = %2d\n", i, number, (i * number));

        }
    }

    public static void printTabels() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d ",i * j);
            }
            System.out.println();

        }
    }

    public static void rockPaperSiccors() {
        final int STONE = 0;
        final int SCISSOR = 1;
        final int PAPER = 2;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int aiWins = 0;
        int meWins = 0;


        while (aiWins < 3 && meWins < 3) {
            int me = scanner.nextInt();
            int ai = random.nextInt(3);
            System.out.printf("Jeg fik %s og du fik %s. ", ai, me);
            if (me == STONE && ai == SCISSOR) {
                System.out.println("Du vandt!");
                meWins++;
            } else if (me == SCISSOR && ai == PAPER) {
                System.out.println("Du vandt!");
                meWins++;
            } else if (me == PAPER && ai == SCISSOR) {
                System.out.println("Jeg vandt!");
                aiWins++;
            } else if (me == PAPER && ai == STONE) {
                System.out.println("Du vandt!");
                meWins++;
            } else if (me == STONE && ai == PAPER) {
                System.out.println("Jeg vandt!");
                aiWins++;
            } else if (me == SCISSOR && ai == STONE) {
                System.out.println("Jeg vandt!");
                aiWins++;
            } else {
                System.out.println("Uafgjort!");
            }
        }

        if (aiWins == 3) {
            System.out.println("ai won");
        } else if (meWins == 3) {
            System.out.println("you won");
        }
    }


    public static void secretNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("Gæt et tal mellem 1 og 100");
        //System.out.println(secretNumber);
        guess = scanner.nextInt();
        int numOfTries = 0;

        while (numOfTries < 10) {

            if (guess < secretNumber) {
                System.out.print("Too low :( ");
            } else {
                System.out.print("Too high :( ");
            }

            if (guess == secretNumber) {
                System.out.println("asd");
                System.out.println("Winna");
            } else {
                numOfTries++;
                System.out.println("Try again");
                guess = scanner.nextInt();
            }
        }

    }

}
