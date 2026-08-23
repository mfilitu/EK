public class Book {
    private int numberOfPages;
    private String author;

    public Book(String author, int numberOfPages){
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public String toString(){
        return String.format("Author: %s, NumberOfPages: %s", author, numberOfPages);
    }
}
