public class BreadRecipie {
    public static void main(String[] args){
        System.out.println("Tilsæt 500 g. vand til skålen");
        System.out.println("Tilsæt 10 g. gær til skålen");
        System.out.println("Tilsæt 500 g. hvedemel til skålen");
        kneadDough();
        raise();
        kneadDough();
        raise();
        kneadDough();
        raise();
        System.out.println("Tilsæt 10 g. salt til skålen");
        kneadDough();
        raise();
        System.out.println("Form dejen til et brød");
        System.out.println("Bag brødet i ovnen ved 220 grader i 30 minutter");
    }

    public static void kneadDough() {
        System.out.println("Ælt dejen i 8 minutter");
    }
    public static void raise() {
        System.out.println("Lad dejen hæve i 2 time");
    }
}
