import java.util.Comparator;

public class FilmComperator implements Comparator<Film> {

    public int compare(Film o1, Film o2){
        return o1.getTitle().compareTo(o2.getTitle());
    }

}
