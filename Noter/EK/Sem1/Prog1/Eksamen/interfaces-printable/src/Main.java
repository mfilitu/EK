import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> material = new ArrayList<>();

        Book lionKing = new Book("Lion King", "Mateusz");
        Book got = new Book("Game Of thrones", "Mateusz");
        Article ai = new Article("Ai is over", "Mateusz");
        Article book = new Article("Books are good!", "Mateusz");

        material.add(lionKing);
        material.add(got);
        material.add(ai);
        material.add(book);

        for (Printable mat : material){
            System.out.println(mat.printInfo());
        }

    }
}
