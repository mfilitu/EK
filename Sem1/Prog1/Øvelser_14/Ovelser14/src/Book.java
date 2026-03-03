import java.time.LocalDate;

public class Book {
    final String author;
    final String title;
    final String isbn;

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;

    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", author, title, isbn);
    }
}

