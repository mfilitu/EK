import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> books = new ArrayList<>();

    public Bibliotek(){

    }

    public ArrayList<Bog> getBooks() {
        return books;
    }

    public void addBook(Bog bog){
        books.add(bog);
    }

    public boolean isBookFound(Bog targetBog){
        for (Bog bog : books){
            if (targetBog.getISBN() == bog.getISBN()){

                System.out.println("Book with same ISBN found!");
                return true;
            }
        }
        return false;
    }


}
