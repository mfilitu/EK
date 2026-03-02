public class Book {
    final String author;
    final String title;
    final String isbn;
    Member borrowedBy;

    public Book(String author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;

    }
    public boolean isAvailable(){
        return borrowedBy == null;
    }

    public String toString() {
        String status = isAvailable() ? "På hylden" : "Udlånt";
        return String.format("%s, %s, %s, %s\nBorrowed by: %s", author, title, isbn, status, borrowedBy);
    }

    public boolean loanBook(Member member){
        if (isAvailable() == true){
            borrowedBy = member;
            return true;
        } else {
            return false;
        }

    }

    public void returnBook(){
        if (isAvailable() == false){
            borrowedBy = null;
        }

    }
}
