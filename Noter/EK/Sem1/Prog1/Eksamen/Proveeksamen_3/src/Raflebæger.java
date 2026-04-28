import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int die;
    private ArrayList<Integer> dieList;

    public Raflebæger(int die) {
        this.die = die;
        this.dieList = new ArrayList<>();
    }

    public int ryst() {
        int total = 0;
        Random random = new Random();
        dieList.clear();
        for (int i = 0; i < die; i++) {
            int shuffle = random.nextInt(6) + 1;
            dieList.add(shuffle);
            System.out.println(shuffle);
            total += shuffle;

        }
        return total;
    }

    public ArrayList<Integer> se() {
        return dieList;
    }


}
