public class Main {
    public static void main(String[] args) {
        Film jaws = new Film("jaws", 1999);
        Film catMovie = new Film("Cats");

        Producer MB = new Producer("Michael Bay");
        System.out.println(jaws);
        jaws.addProducer(MB);
        System.out.println(jaws);

        System.out.println(catMovie);
        catMovie.addProducer(new Producer("Mateusz"));
        System.out.println(catMovie);

    }
}
