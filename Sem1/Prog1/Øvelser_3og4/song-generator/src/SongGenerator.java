public class SongGenerator {
    public static void main(String[] args) {
        printVerse("Løve","meow");

    }

    public static void printVerse(String animal, String sound) {
        System.out.println("Jens Hansen havde en bondegård, ih ah ih ah oh.");
        System.out.printf("Og på den gård " + "der var en %s, ih ah ih ah oh.%n", animal);
        System.out.printf("%s en siger %s-%s, ih ah ih ah oh.", animal, sound, sound);
    }
}
