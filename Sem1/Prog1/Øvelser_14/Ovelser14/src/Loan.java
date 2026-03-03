import java.time.LocalDate;

public class Loan {
    final Member member;
    final Book book;
    final LocalDate borrowedDate;

    public Loan(Member member, Book book, LocalDate borrowedDate) {
        this.member = member;
        this.book = book;
        this.borrowedDate = borrowedDate;
    }


    public LocalDate getDueDate() {
        return borrowedDate.plusDays(14);
    }

    public boolean isOverdue() {
        LocalDate now = LocalDate.now();
        LocalDate dueDate = getDueDate();
        return now.isAfter(dueDate);
    }

    @Override
    public String toString(){

        return String.format("%s: %s\n(%s) - Udlånt\nTil %s (%s)\nAfleveringsprist: %s", book.author, book.title, book.isbn, member.name, member.id, getDueDate());
    }
}
