import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Costomer> costomers = new ArrayList<>();

        costomers.add(new Costomer("Mateusz", 1000));
        costomers.add(new Costomer("Bo", 1500));
        costomers.add(new Costomer("Anna", 500));
        costomers.add(new Costomer("Iben", 2000));
        costomers.add(new Costomer("Peter", 100));

        //System.out.println(getFristVIP(costomers));
        System.out.println(getAllVIPS(costomers));

    }

    public static Costomer getFristVIP(ArrayList<Costomer> costomers){
        for (Costomer costomer : costomers){
            if (costomer.isVIP()){
                return costomer;
            }
        }
        return null;
    }

    public static ArrayList<Costomer> getAllVIPS(ArrayList<Costomer> costomers){
        ArrayList<Costomer> vipList = new ArrayList<>();
        for (Costomer costomer : costomers){
            if (costomer.isVIP()){
                vipList.add(costomer);
            }
        }
        return vipList;
    }
}
