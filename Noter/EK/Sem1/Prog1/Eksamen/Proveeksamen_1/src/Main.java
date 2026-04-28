public class Main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();

        System.out.println(tekst);
        tekst.tilføj("Hello");
        tekst.tilføj("Hello");
        tekst.tilføj("Hello");
        tekst.tilføj("World");
        System.out.println(tekst);

        System.out.println(tekst.findAntalUikke(tekst.getTekstLinjer()));
    }
}
