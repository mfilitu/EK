import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Film matrix = new Film("Matrix", 9);
        Film bee = new Film("Bee movie", 5);

        System.out.println(matrix);
        System.out.println(bee);

        System.out.println(matrix.overEight());
        System.out.println(bee.overEight());

        List<Film> filmList = new ArrayList<>();

        filmList.add(matrix);
        filmList.add(bee);

        Collections.sort(filmList, new FilmComperator());

        System.out.println("List of films:\n");
        for (Film f : filmList){
            System.out.println(f);
        }

    }
}
