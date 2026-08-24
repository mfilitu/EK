import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> books = new ArrayList<>();

    public Bibliotek(){
        Bog bog1 = new Bog(123, "test", 2000);
        Bog bog2 = new Bog(124, "test1", 2000);
        Bog bog3 = new Bog(125, "test2", 2000);
        books.add(bog1);
        books.add(bog2);
        books.add(bog3);
    }

    public ArrayList<Bog> getBooks() {
        return books;
    }

    public boolean isBookFound(int isbn){
        for (Bog bog : books){
            if (isbn == bog.getISBN()){

                System.out.println("Same ISBN found!");
                return true;
            }
        }
        return false;
    }


}
