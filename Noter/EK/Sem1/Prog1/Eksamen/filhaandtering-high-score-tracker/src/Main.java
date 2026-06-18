import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<PlayerScore> playerScores = new ArrayList<>();

        playerScores.add( new PlayerScore("Mateusz", 500));
        playerScores.add( new PlayerScore("Bo", 255));
        playerScores.add( new PlayerScore("Peter", 1000));
        playerScores.add( new PlayerScore("Julius", 750));

        


        try {
            System.out.println(readScores());
        } catch (IOException e){
            System.out.println("fejl");
        }



    }

    public static void writeScores(ArrayList<PlayerScore> scores) throws IOException {
        File file = new File("Scores.txt");

        Writer writer = new FileWriter(file);

        for (PlayerScore score : scores){
            writer.write(score.getPlayerName() + "," + score.getScore() + "\n");
        }
        writer.close();

    }

    public static ArrayList<PlayerScore> readScores() throws FileNotFoundException {
        ArrayList<PlayerScore> playerScores = new ArrayList<>();

        File file = new File("Scores.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] data = line.split(",");

            String name = data[0];
            int score = Integer.parseInt(data[1]);

            playerScores.add(new PlayerScore(name, score));
        }
        scanner.close();

        return playerScores;

    }
}
