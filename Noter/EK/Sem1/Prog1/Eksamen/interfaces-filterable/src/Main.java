import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filterable> filterableArrayList = new ArrayList<>();

        filterableArrayList.add(new Product("Cola zero", "Den bedste cola"));
        filterableArrayList.add(new Product("Sprite zero", "Den bedste sprite"));
        filterableArrayList.add(new Product("Cola", "Den gode cola"));
        filterableArrayList.add(new Product("Sprite", "Den gode sprite"));

        System.out.println(getKeywordList(filterableArrayList, "cola"));


    }

    public static ArrayList<Filterable> getKeywordList(ArrayList<Filterable> list, String keyword){
        ArrayList<Filterable> keywordList = new ArrayList<>();

        for (Filterable item : list){
            if (item.matches(keyword)){
                keywordList.add(item);
            }
        }
        return keywordList;
    }
}
