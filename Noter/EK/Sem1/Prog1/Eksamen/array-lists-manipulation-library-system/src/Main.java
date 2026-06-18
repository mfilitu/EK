import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("GOT", "Mateusz", true);
        Book book2 = new Book("Bee hives", "Mateusz", true);
        Book book3 = new Book("Algebra", "Mateusz", false);
        Book book4 = new Book("Lav mad som en kok", "Mateusz", true);

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);


        borrowBook(books, "GOT");
        borrowBook(books, "GOT");

        updateName(books, "got", "Mads");







        try {
            book4.borrow();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        updateBorrowed(books);
        for (Book book : books){
            System.out.println(book);
        }

    }

    public static void borrowBook(ArrayList<Book> books, String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                try{
                    book.borrow();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
        }
    }

    public static void updateName(ArrayList<Book> books, String title, String newName){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                book.setAuthor(newName);

            }
        }
    }

    public static void updateBorrowed(ArrayList<Book> books){
        books.removeIf(book -> book.getIsAvailable() == false);
    }
}
