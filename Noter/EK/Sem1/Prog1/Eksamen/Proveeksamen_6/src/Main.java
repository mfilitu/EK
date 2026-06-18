public class Main {
    public static void main(String[] args) {
        Bil bil1 = new Bil(3000);
        Trailer trailer1 = new Trailer(600);
        Trailer trailer2 = new Trailer(400);

        System.out.println(bil1.totalWeight());
        bil1.addTrailer(trailer1);
        bil1.addTrailer(trailer2);
        System.out.println(bil1.totalWeight());

    }
}
