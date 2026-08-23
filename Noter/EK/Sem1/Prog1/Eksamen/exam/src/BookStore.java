import java.util.ArrayList;

public class BookStore  {
    private ArrayList<Book> books;

    public BookStore(){
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book findSmallest(){
        Book smallest = books.getFirst();
        for (Book book : books){
            if (smallest.getNumberOfPages() > book.getNumberOfPages()){
                smallest = book;
            }
        }
        return smallest;
    }

    public String toString(){
        return books.toString();
    }


}
