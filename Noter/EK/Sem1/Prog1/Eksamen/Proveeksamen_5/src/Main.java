public class Main {
    public static void main(String[] args) {
        Card SixH = new Card("hearts", 6);
        Card SixD = new Card("diamonds", 6);
        Card FiveD = new Card("diaminds", 5);

        System.out.println(SixH.beats(FiveD));
        System.out.println(FiveD.beats(SixH));
        System.out.println(SixH.beats(SixH));
        System.out.println(FiveD.beats(FiveD));

        System.out.println("\nSuit:\n");
        System.out.println(SixD.beats(SixH));
        System.out.println(SixH.beats(SixD));

    }

}
