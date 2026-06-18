public class Article implements Printable{
    private String title;
    private String author;

    public Article(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String printInfo(){
        return String.format("Title: %s Author: %s", title, author);
    }
}
