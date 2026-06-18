import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();


        play(diceGame);
    }

    public static void play(DiceGame diceGame){
        boolean active = true;
        Scanner scanner = new Scanner(System.in);
        while(active){
            System.out.println("Make your guess!");
            int guess = scanner.nextInt();
            System.out.println(diceGame.guess(guess));
            if (diceGame.guess(guess).equalsIgnoreCase("you guessed it!")){
                active = false;
            }
        }
    }
}
