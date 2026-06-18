import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> plantList = new ArrayList<>();

        plantList.add(new Plant("blomst", 2));
        plantList.add(new Plant("kaktus", 3));
        plantList.add(new Plant("blomst", 3));
        plantList.add(new Plant("blomst", 2));
        plantList.add(new Plant("blomst", -1));
        plantList.add(new Plant("blomst", 3));

        System.out.println(needsWater(plantList));
    }

    private static int needsWater(List<Plant> plantList) {
        int counter = 0;
        for (Plant plant : plantList){
            if (plant.needsWater()){
                counter++;
            }

        }
        return counter;
    }
}
