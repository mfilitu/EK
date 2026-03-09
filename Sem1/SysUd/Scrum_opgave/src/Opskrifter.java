public class Opskrifter {
    private String titel;
    private String ingredienser;
    private String fremgangsmåde;
    private String kategori;
    private int rating;
    private String kommentar;


    public Opskrifter(String titel, String ingredienser, String fremgangsmåde, String kategori) {
        this.titel = titel;
        this.ingredienser = ingredienser;
        this.fremgangsmåde = fremgangsmåde;
        this.kategori = kategori;
    }

    public String getTitel(){
        return titel;
    }

    public String getIngredienser(){
        return ingredienser;
    }

    public String getFremgangsmåde() {
        return fremgangsmåde;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getRating() {
        return rating;
    }
    public int setRating(int rating) {
        return this.rating = rating;
    }
    public String getKommentar() {
        return kommentar;
    }
    public String setKommentar(String kommentar) {
        return this.kommentar = kommentar;
    }

    public String toString() {
        return String.format("Titel: %s\n" +
                "Kategori: %s\n" +
                "Ingredienser: %s\n" +
                "Fremgangsmåde: %s\n" +
                "Rating: %s\n" +
                "Kommentar: %s\n", getTitel(), getKategori(), getIngredienser(), getFremgangsmåde(), getRating(), getKommentar());
    }
}
