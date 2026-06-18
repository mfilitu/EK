public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrow() throws Exception {
        if (!isAvailable){
            throw new Exception("Book is currently borrowed!");
        } else isAvailable = false;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public String toString(){
        return String.format("Title: %s, Author: %s, Available: %s", getTitle(), author, getIsAvailable());
    }
}
