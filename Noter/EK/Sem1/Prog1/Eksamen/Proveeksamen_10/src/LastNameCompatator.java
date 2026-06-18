import java.util.Comparator;

public class LastNameCompatator implements Comparator<HogwartsStudent> {
    @Override
    public int compare(HogwartsStudent o1, HogwartsStudent o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
