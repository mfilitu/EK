public class Main {
    public static void main(String[] args) {
        //opg1
        opg1();

    }

    public static void opg1() {
        Member member1 = new Member("Thorkild Hansen", 356);
        Book book1 = new Book("Allan B. Downey",
                "Think Java",
                "9781492072508");
        Book book2 = new Book("Rachel Cusk",
                "Omrids",
                "9788763851664");
        Book book3 = new Book("Yuval Noah Harari",
                "Sapiens",
                "9780062316097");

        System.out.println(book1);
        System.out.println();
        System.out.println(book1.loanBook(member1));
        System.out.println(book1.loanBook(member1));
        System.out.println();
        System.out.println(book1);
        System.out.println();
        book1.returnBook();
        System.out.println(book1);
    }
}
