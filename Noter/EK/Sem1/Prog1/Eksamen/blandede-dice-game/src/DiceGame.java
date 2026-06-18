import java.util.Random;

public class DiceGame {
    private int targetNumber;

    public DiceGame(){
        Random random = new Random();
        targetNumber = random.nextInt(6)+1;
    }

    public String guess(int playerGuess){
        if (playerGuess < targetNumber){
            return "Too low!";
        } else if (playerGuess > targetNumber) {
            return "Too high!";
        } else return "You Guessed it!";
    }
}
