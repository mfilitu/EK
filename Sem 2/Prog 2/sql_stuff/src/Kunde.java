public class Kunde {
    String navn;
    double kredit;

    public Kunde(String n, double k) {
        this.navn = n;
        this.kredit = k;
    }

    @Override
    public String toString() {
        return navn + ": " + kredit + " kr.";
    }
}