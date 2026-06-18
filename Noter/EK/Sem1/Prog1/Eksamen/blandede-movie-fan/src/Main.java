import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<MovieFan> movieFans = new ArrayList<>();

        MovieFan mateusz = new MovieFan("Mateusz", "Horror");
        MovieFan Albert = new MovieFan("Albert", "Horror");
        MovieFan Benjamin = new MovieFan("Benjamin", "Horror");
        MovieFan Holger = new MovieFan("Holger", "Horror");

        movieFans.add(mateusz);
        movieFans.add(Benjamin);
        movieFans.add(Holger);
        movieFans.add(Albert);

        for (MovieFan fan : movieFans){
            System.out.println(fan);
        }

        Collections.sort(movieFans, new MovieFanNameComparator());
        System.out.println();
        for (MovieFan fan : movieFans){
            System.out.println(fan);
        }

    }
}
