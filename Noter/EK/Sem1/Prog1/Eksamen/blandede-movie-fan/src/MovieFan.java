public class MovieFan {
    private String name;
    private String favoriteGenre;

    public MovieFan(String name, String favoriteGenre){
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public boolean likesGenre(String genre){
        return favoriteGenre.equalsIgnoreCase(genre);
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return String.format("Name: %s, Favorite genre: %s", name, favoriteGenre);
    }
}
