public class Biography extends Book {

    private String mainCharecter;

    public Biography(String author, int numberOfPages, String mainCharecter){
        super(author, numberOfPages);

        this.mainCharecter = mainCharecter;
    }

    public String toString(){
        return super.toString() + " " + mainCharecter;
    }
}
