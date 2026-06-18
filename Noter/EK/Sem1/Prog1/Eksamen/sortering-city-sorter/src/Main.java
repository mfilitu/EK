import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City gentofte = new City("Gentofte", 100001);
        City lyngby = new City("lyngby", 5990);
        City søborg = new City("søborg", 1520);

        System.out.println(gentofte.isLarge());
        System.out.println(lyngby.isLarge());
        System.out.println(søborg.isLarge());

        List<City> cityList = new ArrayList<>();

        cityList.add(lyngby);
        cityList.add(søborg);
        cityList.add(gentofte);


        Collections.sort(cityList, new cityNameComparator());

        printCityList(cityList);

        Collections.sort(cityList, new PopulationComparator());
        printCityList(cityList);

    }

    private static void printCityList(List<City> cityList) {
        for (City city : cityList){
            System.out.println(city);
        }
    }
}
