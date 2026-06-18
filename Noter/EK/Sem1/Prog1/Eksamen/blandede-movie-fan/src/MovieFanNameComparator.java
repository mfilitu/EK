import java.util.Comparator;

public class MovieFanNameComparator implements Comparator<MovieFan> {

    @Override
    public int compare(MovieFan o1, MovieFan o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
