import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Beer> beerList = new ArrayList<>();

        Beer tuborg = new Beer("Tuborg", 5.4, 22);
        Beer calsberg = new Beer("calsberg", 5.7, 23);
        Beer classic = new Beer("classic", 11.5, 25);
        Beer nul = new Beer("Alkoholfri", 0.0, 25);

        System.out.println(tuborg);

        try {
            tuborg.setAlcoholPercentage(11);
        } catch (Exception e) {
            System.out.println("not a valid percentage!");
        }
        try {
            tuborg.setPrice(101);
        } catch (Exception e) {
            System.out.println("not a valid price!");
        }
        System.out.println(tuborg);


        beerList.add(calsberg);
        beerList.add(classic);
        beerList.add(nul);
        beerList.add(tuborg);

        printAvarege(beerList);
    }

    private static void printAvarege(List<Beer> beerList) {
        double avarege = 0.0;
        for (Beer beer : beerList) {
            avarege += beer.getAlcoholPercentage();
        }
        avarege /= beerList.size();

        System.out.println(avarege);
    }
}
