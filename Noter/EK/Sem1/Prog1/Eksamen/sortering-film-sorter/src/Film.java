public class Film {
    private String title;
    private int rating;

    public Film(String title, int rating){
        this.title = title;
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public String getTitle(){
        return title;
    }

    public boolean overEight(){
        return getRating() > 8;
    }

    public String toString(){
        return String.format("Title: %s\nRating: %s", getTitle(), getRating());
    }
}
