import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Mateusz", 60);
        Book book2 = new Book("Peter", 50);
        Book book3 = new Book("Julius", 150);

        BookStore bookStore = new BookStore();

        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);

        System.out.println(bookStore);

        System.out.println(bookStore.findSmallest());

        Biography biography = new Biography("hc", 10, "mig");

        System.out.println(biography);

    }
}
