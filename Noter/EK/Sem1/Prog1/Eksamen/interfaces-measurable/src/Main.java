import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(5.0, 5.5, 6.7);
        Box b2 = new Box(2.0, 12.5, 9.7);
        Box b3 = new Box(45.0, 6.5, 7.7);
        Box b4 = new Box(4.0, 2.4, 13.7);
        Box b5 = new Box(9.0, 3.4, 1.7);

        List<Measurable> measurableList = new ArrayList<>();

        measurableList.add(b1);
        measurableList.add(b2);
        measurableList.add(b3);
        measurableList.add(b4);
        measurableList.add(b5);
        System.out.println(getBiggestBox(measurableList));

    }

    private static Measurable getBiggestBox(List<Measurable> measurableList) {
        Measurable biggest = measurableList.getFirst();
        for (Measurable box : measurableList){
            if (box.getMeasure() > biggest.getMeasure()){
                biggest = box;
            }
        }
        return biggest;
    }
}
